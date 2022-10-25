package com.gengxiankun.notion.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiankun.geng
 */
public enum ParentTypeEnum {

    /**
     * Database 类型
     */
    DATABASE_ID,

    /**
     * Page 类型
     */
    PAGE_ID,

    /**
     * Workspace 类型
     */
    WORKSPACE,

    /**
     * Block 类型
     */
    BLOCK_ID,

    /**
     * 未知类型
     */
    UNKNOWN;

    /**
     * 用来存放小写字符串与枚举值的关系
     */
    private static final Map<String, ParentTypeEnum> TYPE_MAP = new HashMap<>();

    /**
     * 获取小写名称
     */
    public String getName() {
        return this.name().toLowerCase();
    }

    /**
     * 根据 type 获取相对应的枚举值
     */
    public static ParentTypeEnum instanceOf(String type) {
        return TYPE_MAP.getOrDefault(type, UNKNOWN);
    }

    static {
        ParentTypeEnum[] parentTypes = values();

        for (ParentTypeEnum parentType : parentTypes) {
            if (parentType != UNKNOWN) {
                TYPE_MAP.put(parentType.getName(), parentType);
            }
        }
    }

}
