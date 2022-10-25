package com.gengxiankun.notion.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiankun.geng
 */
public enum NumberFormatEnum {

    /**
     * 数字
     */
    NUMBER,

    /**
     * 美元
     */
    DOLLAR,

    /**
     * 人民币
     */
    YUAN,

    /**
     * 未知格式
     */
    UNKNOWN;

    /**
     * 用来存放小写字符串与枚举值的关系
     */
    private static final Map<String, NumberFormatEnum> ENUM_MAP = new HashMap<>();

    /**
     * 获取小写名称
     */
    public String getName() {
        return this.name().toLowerCase();
    }

    /**
     * 根据 type 获取相对应的枚举值
     */
    public static NumberFormatEnum instanceOf(String type) {
        return ENUM_MAP.getOrDefault(type, UNKNOWN);
    }

    static {
        NumberFormatEnum[] parentTypes = values();

        for (NumberFormatEnum parentType : parentTypes) {
            if (parentType != UNKNOWN) {
                ENUM_MAP.put(parentType.getName(), parentType);
            }
        }
    }

}
