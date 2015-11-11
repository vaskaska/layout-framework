package com.statravel.qa.domain;

import org.openqa.selenium.Dimension;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Vasili_Ramantsou on 11/6/2015.
 *
 */
public enum TestDevice {

    DESKTOP("desktop", new Dimension(1024, 800), asList("desktop")),
    MOBILE("mobile", new Dimension(450, 800), asList("mobile"));

    private final String name;
    private final Dimension screenSize;
    private final List<String> tags;

    TestDevice(String name, Dimension screenSize, List<String> tags) {
        this.name = name;
        this.screenSize = screenSize;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public Dimension getScreenSize() {
        return screenSize;
    }

    public List<String> getTags() {
        return tags;
    }
}
