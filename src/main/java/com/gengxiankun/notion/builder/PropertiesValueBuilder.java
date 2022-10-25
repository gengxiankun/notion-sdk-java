package com.gengxiankun.notion.builder;

import com.gengxiankun.notion.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiankun.geng
 */
public class PropertiesValueBuilder {

    private Map<String, PropertyValue> properties = new HashMap<>();

    public PropertiesValueBuilder buildTitle(String id, String content) {
        List<PropertyValueTitle> propertyValueTitles = new ArrayList<>();
        propertyValueTitles.add(PropertyValueTitle.builder().text(PropertyValueText.builder().content(content).build()).build());
        properties.put(id, PropertyValue.builder().title(propertyValueTitles).build());
        return this;
    }

    public PropertiesValueBuilder buildSelect(String id, String select) {
        properties.put(id, PropertyValue.builder().select(PropertyValueSelect.builder().name(select).build()).build());
        return this;
    }

    public PropertiesValueBuilder buildNumber(String id, Long number) {
        properties.put(id, PropertyValue.builder().number(number).build());
        return this;
    }

    public PropertiesValueBuilder buildNumber(String id, Double number) {
        properties.put(id, PropertyValue.builder().number(number).build());
        return this;
    }

    public PropertiesValueBuilder buildDate(String id, String date) {
        properties.put(id, PropertyValue.builder().date(PropertyValueDate.builder().start(date).build()).build());
        return this;
    }

    public Map<String, PropertyValue> getProperties() {
        return this.properties;
    }

}
