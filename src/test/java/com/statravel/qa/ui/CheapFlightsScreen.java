package com.statravel.qa.ui;

import com.epam.ta.jselenium.ui.Browser;
import com.epam.ta.jselenium.ui.PageIdentificator;
import com.epam.ta.jselenium.ui.PageUrl;
import com.epam.ta.jselenium.ui.Screen;
import com.epam.ta.jselenium.ui.locator.annotation.DefinedLocator;
import com.epam.ta.jselenium.ui.locator.annotation.DefinedLocators;
import com.epam.ta.jselenium.ui.locator.annotation.ElementName;
import com.statravel.qa.ui.components.SearchWidgetComponent;

/**
 * Created by Vasili_Ramantsou on 11/5/2015.
 *
 */
@PageUrl("")
@PageIdentificator(locators = @DefinedLocators(@DefinedLocator(using = "//ul[contains(@class, 'searchTabs contain')]")))
public class CheapFlightsScreen extends Screen {

    @ElementName(name = "Search Widget box")
    @DefinedLocator(using = "//div[@class='searchWrapper portrait']")
    private SearchWidgetComponent searchWidgetBox;

    @ElementName(name = "Search Widget box")
    @DefinedLocator(using = "//div[@class='searchWrapper landscape']")
    private SearchWidgetComponent searchWidgetLandscape;

    public CheapFlightsScreen(Browser browser) {
        super(browser);
    }

    public SearchWidgetComponent getSearchWidgetBox() {
        return searchWidgetBox;
    }

    public void setSearchWidgetBox(SearchWidgetComponent searchWidgetBox) {
        this.searchWidgetBox = searchWidgetBox;
    }

    public SearchWidgetComponent getSearchWidgetLandscape() {
        return searchWidgetLandscape;
    }

    public void setSearchWidgetLandscape(SearchWidgetComponent searchWidgetLandscape) {
        this.searchWidgetLandscape = searchWidgetLandscape;
    }
}
