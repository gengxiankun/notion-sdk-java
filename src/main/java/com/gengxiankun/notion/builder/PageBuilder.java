package com.gengxiankun.notion.builder;

import com.gengxiankun.notion.entity.Page;
import com.gengxiankun.notion.entity.Parent;
import com.gengxiankun.notion.entity.PropertyValue;

import java.util.Map;

/**
 * @author xiankun.geng
 */
public class PageBuilder {

    public Page build(Parent parent, Map<String, PropertyValue> properties) {
        return Page.builder().parent(parent).properties(properties).build();
    }

}
