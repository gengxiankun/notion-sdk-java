package com.gengxiankun.notion.builder;

import com.gengxiankun.notion.entity.Parent;
import com.gengxiankun.notion.enums.ParentTypeEnum;

/**
 * @author xiankun.geng
 */
public class ParentBuilder {

    public Parent buildPage(String pageId) {
        return Parent.builder().type(ParentTypeEnum.PAGE_ID.getName()).pageId(pageId).build();
    }

    public Parent buildDatabase(String databaseId) {
        return Parent.builder().type(ParentTypeEnum.DATABASE_ID.getName()).databaseId(databaseId).build();
    }

}
