package com.gengxiankun.notion;

import com.alibaba.fastjson.JSON;
import com.gengxiankun.notion.entity.Database;
import com.gengxiankun.notion.entity.ResponseBody;
import com.gengxiankun.notion.entity.Page;
import com.gengxiankun.notion.enums.NotionRequestEnum;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author xiankun.geng
 */
public class NotionClient {

    private final static Logger logger = LoggerFactory.getLogger(NotionClient.class);

    private final String BASE_URL = "https://api.notion.com/v1/";

    private final String HEADER_ACCEPT = "application/json";

    private final String HEADER_CONTENT_TYPE = "application/json";

    private final String VERSION = "2022-06-28";

    private final Integer REQUEST_SUCCESS = 200;

    private String secret;

    public NotionClient(String secret) {
        this.secret = secret;
    }

    private Response preprocessingClient(NotionRequestEnum requestEnum, String body) {
        try (AsyncHttpClient client = new DefaultAsyncHttpClient()) {
            return client.prepare(requestEnum.getMethod(), BASE_URL + requestEnum.getUrl())
                    .setHeader("accept", HEADER_ACCEPT)
                    .setHeader("Notion-Version", VERSION)
                    .setHeader("content-type", HEADER_CONTENT_TYPE)
                    .setHeader("authorization", "Bearer " + this.secret)
                    .setBody(body)
                    .execute()
                    .toCompletableFuture()
                    .join();
        } catch (IOException e) {
            logger.error("Notion http 请求异常 {}", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public ResponseBody createDatabase(Database database) {
        Response response = this.preprocessingClient(NotionRequestEnum.CREATE_DATABASE, JSON.toJSONString(database));
        if (response == null) {
            logger.error("Create a database fail，返回结果 null");
            return null;
        }
        if (response.getStatusCode() != REQUEST_SUCCESS) {
            logger.error("Create a database fail，返回结果 {}", response.getResponseBody());
            return null;
        }
        return JSON.parseObject(response.getResponseBody(), ResponseBody.class);
    }

    public ResponseBody createPage(Page page) {
        Response response = this.preprocessingClient(NotionRequestEnum.CREATE_PAGE, JSON.toJSONString(page));
        if (response == null) {
            logger.error("Create a page fail，返回结果 null");
            return null;
        }
        if (response.getStatusCode() != REQUEST_SUCCESS) {
            logger.error("Create a page fail，返回结果 {}", response.getResponseBody());
            return null;
        }
        return JSON.parseObject(response.getResponseBody(), ResponseBody.class);
    }

}
