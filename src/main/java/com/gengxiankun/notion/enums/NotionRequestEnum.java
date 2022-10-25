package com.gengxiankun.notion.enums;

/**
 * @author xiankun.geng
 */
public enum NotionRequestEnum {

    /**
     * Create a database
     */
    CREATE_DATABASE("databases", "POST"),

    /**
     * Create a page
     */
    CREATE_PAGE("pages", "POST");

    private String url;

    private String method;

    NotionRequestEnum(String url, String method) {
        this.url = url;
        this.method = method;
    }

    public String getUrl() {
        return this.url;
    }

    public String getMethod() {
        return this.method;
    }

}
