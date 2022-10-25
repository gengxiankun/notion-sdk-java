package com.gengxiankun.notion.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author xiankun.geng
 */
@Builder
@Data
public class Title {

    private String type;

    private TitleText text;

}
