package com.gengxiankun.notion.builder;

import com.gengxiankun.notion.entity.PropertyObjectSelectOption;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiankun.geng
 */
public class PropertySelectOptionBuilder {

    private List<PropertyObjectSelectOption> options = new ArrayList<>();

    public PropertySelectOptionBuilder build(String name, String color) {
        options.add(PropertyObjectSelectOption.builder().name(name).color(color).build());
        return this;
    }

    public PropertySelectOptionBuilder build(String name) {
        options.add(PropertyObjectSelectOption.builder().name(name).build());
        return this;
    }

    public List<PropertyObjectSelectOption> getOptions() {
        return this.options;
    }

}
