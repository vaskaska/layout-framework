package com.statravel.qa.tests;

import com.statravel.qa.domain.POS;
import com.statravel.qa.domain.Page;

import com.statravel.qa.domain.TestDevice;
import com.statravel.qa.ui.CheapFlightsScreen;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheapFlightsPageTest extends BaseTest {

    @Test
    @Parameters({"pos", "device"})
    public void cheapFlightTest(POS pos, TestDevice device) {
        changeScreenSize(device.getScreenSize());
        CheapFlightsScreen cheapFlightsScreen = browser.openScreen(buildUrl(pos, Page.CHEAP_FLIGHTS), CheapFlightsScreen.class);
        checkLayout(CHEAP_FLIGHTS_BASE_TEST, device);

//        cheapFlightsScreen.getSearchWidget().clickDepartureDateInput();
//        checkLayout(SEARCH_WIDGET_BOX_CALENDAR_TEST, device);
    }
}