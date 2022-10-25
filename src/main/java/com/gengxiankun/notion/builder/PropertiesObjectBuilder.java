package com.gengxiankun.notion.builder;

import com.gengxiankun.notion.entity.PropertyObjectNumber;
import com.gengxiankun.notion.entity.PropertyObject;
import com.gengxiankun.notion.entity.PropertyObjectSelect;
import com.gengxiankun.notion.entity.PropertyObjectSelectOption;
import com.gengxiankun.notion.enums.NumberFormatEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiankun.geng
 */
public class PropertiesObjectBuilder {

    private Map<String, PropertyObject> properties = new HashMap<>();

    public PropertiesObjectBuilder buildTitle(String id) {
        properties.put(id, PropertyObject.builder().title(new Object()).build());
        return this;
    }

    public PropertiesObjectBuilder buildDate(String id) {
        properties.put(id, PropertyObject.builder().date(new Object()).build());
        return this;
    }

    public PropertiesObjectBuilder builtRichText(String id) {
        properties.put(id, PropertyObject.builder().richText(new Object()).build());
        return this;
    }

    public PropertiesObjectBuilder buildNumber(String id, NumberFormatEnum formatEnum) {
        properties.put(id, PropertyObject.builder().number(PropertyObjectNumber.builder().format(formatEnum.getName()).build()).build());
        return this;
    }

    public PropertiesObjectBuilder buildSelect(String id, List<PropertyObjectSelectOption> options) {
        properties.put(id, PropertyObject.builder().select(PropertyObjectSelect.builder().options(options).build()).build());
        return this;
    }

    public Map<String, PropertyObject> getProperties() {
        return this.properties;
    }

}
