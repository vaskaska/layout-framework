package com.statravel.qa.tests.cheap_flights;

import com.statravel.qa.domain.POS;
import com.statravel.qa.domain.Page;

import com.statravel.qa.domain.TestDevice;
import com.statravel.qa.tests.BaseTest;
import com.statravel.qa.ui.CheapFlightsScreen;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheapFlightsPageTest extends BaseTest {

    @Test
    @Parameters({"device"})
    public void cheapFlightTest_AU(TestDevice device) {
        changeScreenSize(device.getScreenSize());
        browser.openScreen(buildUrl(POS.AU, Page.CHEAP_FLIGHTS), CheapFlightsScreen.class);
        checkLayout(CHEAP_FLIGHTS_BASE_TEST, device, POS.AU);
    }

    @Test
    @Parameters({"device"})
    public void cheapFlightTest_DE(TestDevice device) {
        changeScreenSize(device.getScreenSize());
        browser.openScreen(buildUrl(POS.DE, Page.CHEAP_FLIGHTS), CheapFlightsScreen.class);
        checkLayout(CHEAP_FLIGHTS_BASE_TEST, device, POS.DE);
    }

    @Test
    @Parameters({"device"})
    public void cheapFlightTest_FR(TestDevice device) {
        changeScreenSize(device.getScreenSize());
        browser.openScreen(buildUrl(POS.FR, Page.CHEAP_FLIGHTS), CheapFlightsScreen.class);
        checkLayout(CHEAP_FLIGHTS_BASE_TEST, device, POS.FR);
    }

    @Test
    @Parameters({"device"})
    public void cheapFlightTest_NZ(TestDevice device) {
        changeScreenSize(device.getScreenSize());
        browser.openScreen(buildUrl(POS.NZ, Page.CHEAP_FLIGHTS), CheapFlightsScreen.class);
        checkLayout(CHEAP_FLIGHTS_BASE_TEST, device, POS.NZ);
    }
}