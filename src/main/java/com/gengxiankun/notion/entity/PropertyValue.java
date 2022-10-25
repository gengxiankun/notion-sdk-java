package com.gengxiankun.notion.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author xiankun.geng
 */
@Data
@Builder
public class PropertyValue {

    private List<PropertyValueTitle> title;

    private Object number;

    private PropertyValueSelect select;

    private PropertyValueDate date;

}
