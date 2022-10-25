package com.gengxiankun.notion.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * @author xiankun.geng
 */
@Data
@Builder
public class Page {

    private Parent parent;

    private Map<String, PropertyValue> properties;

}
