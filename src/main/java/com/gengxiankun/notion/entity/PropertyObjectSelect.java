package com.gengxiankun.notion.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author xiankun.geng
 */
@Data
@Builder
public class PropertyObjectSelect {

    private List<PropertyObjectSelectOption> options;

}
