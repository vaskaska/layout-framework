package com.statravel.qa.ui.components;

import com.epam.ta.jselenium.ui.Browser;
import com.epam.ta.jselenium.ui.UIObject;
import com.epam.ta.jselenium.ui.elements.Input;
import com.epam.ta.jselenium.ui.locator.annotation.DefinedLocator;
import com.epam.ta.jselenium.ui.locator.annotation.ElementName;

/**
 * Created by Vasili_Ramantsou on 11/6/2015.
 *
 */
public class SearchWidgetComponent extends UIObject {

    @ElementName(name = "Departure date input")
    @DefinedLocator(using = ".//input[contains(@class,'flight_depart_date')]")
    private Input departureDateInput;

    public SearchWidgetComponent(Browser browser) {
        super(browser);
    }

    public synchronized void clickDepartureDateInput(){
        browser.getMouse().mouseMove(departureDateInput.getCoordinates());
        departureDateInput.click();
    }
}
