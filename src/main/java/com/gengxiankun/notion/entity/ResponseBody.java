package com.gengxiankun.notion.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

/**
 * @author xiankun.geng
 */
@Data
@Builder
public class ResponseBody {

    private String object;

    private String id;

    private String cover;

    private String icon;

    @JSONField(name = "created_time")
    private String createdTime;

}
