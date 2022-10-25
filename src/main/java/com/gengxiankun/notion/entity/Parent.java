package com.gengxiankun.notion.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

/**
 * @author xiankun.geng
 * @link <a href="https://developers.notion.com/reference/parent-object">Parent object</a>
 */
@Data
@Builder
public class Parent {

    /**
     * 类型
     */
    private String type;

    /**
     * The ID of the database that this page belongs to.
     */
    @JSONField(name = "database_id")
    private String databaseId;

    /**
     * The ID of the page that this page belongs to.
     */
    @JSONField(name = "page_id")
    private String pageId;

    /**
     * Always true.
     */
    private String workspace;

    /**
     * The ID of the page that this page belongs to.
     */
    @JSONField(name = "block_id")
    private String blockId;

}
