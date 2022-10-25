package com.gengxiankun.notion.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

/**
 * @author xiankun.geng
 */
@Data
@Builder
public class PropertyValueDate {

    private String start;

    private String end;

    @JSONField(name = "time_zone")
    private String timeZone;

}
