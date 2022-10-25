package com.gengxiankun.notion.builder;

import com.gengxiankun.notion.entity.Database;
import com.gengxiankun.notion.entity.Parent;
import com.gengxiankun.notion.entity.PropertyObject;
import com.gengxiankun.notion.entity.Title;

import java.util.List;
import java.util.Map;

/**
 * @author xiankun.geng
 */
public class DatabaseBuilder {

    public Database build(Parent parent, List<Title> title, Map<String, PropertyObject> properties) {
        return Database.builder().parent(parent).title(title).properties(properties).build();
    }

}
