package com.gengxiankun.notion.builder;

import com.gengxiankun.notion.entity.Title;
import com.gengxiankun.notion.entity.TitleText;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiankun.geng
 */
public class TitleBuilder {

    private final List<Title> titles = new ArrayList<>();

    public TitleBuilder buildText(String content) {
        TitleText text = TitleText.builder().content(content).link(null).build();
        this.titles.add(Title.builder().type("text").text(text).build());
        return this;
    }

    public List<Title> getTitles() {
        return this.titles;
    }

}
