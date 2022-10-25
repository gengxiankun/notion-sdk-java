package com.gengxiankun.notion.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author xiankun.geng
 */
@Builder
@Data
public class Database {

    private Parent parent;

    private Map<String, PropertyObject> properties;

    private List<Title> title;

}
