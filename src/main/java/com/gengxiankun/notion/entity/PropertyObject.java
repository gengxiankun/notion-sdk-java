package com.gengxiankun.notion.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

/**
 * @author xiankun.geng
 */
@Builder
@Data
public class PropertyObject {

    private Object title;

    @JSONField(name = "rich_text")
    private Object richText;

    private Object checkbox;

    private PropertyObjectSelect select;

    private PropertyObjectNumber number;

    private Object date;

    @JSONField(name = "multi_select")
    private Object multiSelect;

    private Object people;

    private Object files;

}
