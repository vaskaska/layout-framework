package com.statravel.qa.tests;

import com.epam.ta.jselenium.ui.Browser;
import com.galenframework.specs.reader.page.SectionFilter;
import com.galenframework.testng.GalenTestNgTestBase;
import com.statravel.qa.config.Configuration;
import com.statravel.qa.config.GalenSpecsReferences;
import com.statravel.qa.domain.POS;
import com.statravel.qa.domain.Page;
import com.statravel.qa.domain.TestDevice;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.test.context.ContextConfiguration;
import java.io.IOException;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@ContextConfiguration(locations = { "classpath:application-context.xml" })
public abstract class BaseTest extends GalenTestNgTestBase implements GalenSpecsReferences {

    protected static Configuration testConfig;

    protected Browser browser;

    static{
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        testConfig = (Configuration)context.getBean("testConfig");
    }

    @BeforeSuite(alwaysRun = true)
    public void initConfiguration() throws IOException {
        PropertiesLoaderUtils.loadAllProperties("common.properties");
    }

    @Override
    public WebDriver createDriver(Object[] args) {
        if(testConfig.getRemote() == true) {
            try {
                DesiredCapabilities capability = DesiredCapabilities.firefox();
                WebDriver driver = new RemoteWebDriver(buildRemoteUrl(testConfig.getSeleniumHost(), testConfig.getSeleniumPort()), capability);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
                driver.manage().window().setSize(new Dimension(1024, 800));
                browser = Browser.wrapWebDriver("firefox", driver);
                return driver;
            } catch (MalformedURLException e) {
                throw new RuntimeException();
            }
        } else {
            WebDriver driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().window().setSize(new Dimension(1024, 800));
            browser = Browser.wrapWebDriver("firefox", driver);
            return driver;
        }
    }

    public void changeScreenSize(Dimension dimension){
        browser.manage().window().setSize(dimension);
    }

    public URL buildRemoteUrl(String seleniumHost, String seleniumPort) throws MalformedURLException{
        return new URL("http://" + seleniumHost + ":" + seleniumPort + "/wd/hub");
    }

    public String buildUrl(POS pos, Page page){
        return getBaseUrl(pos) + "/" + testConfig.getPosConfigurationProperty(pos, page.getPageUrl());
    }

    public void checkLayout(String filePath, TestDevice testDevice, POS pos){
        try {
            Map<String, Object> vars = new HashMap<>();
            vars.put("pos", pos);
            checkLayout(filePath, new SectionFilter(testDevice.getTags(), Collections.<String>emptyList()), new Properties(), vars);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getBaseUrl(POS pos) {
        String url = null;
        switch (pos) {
            case UK:
                url = testConfig.getUrl_uk();
                break;
            case US:
                url = testConfig.getUrl_us();
                break;
            case AU:
                url = testConfig.getUrl_au();
                break;
            case NZ:
                url = testConfig.getUrl_nz();
                break;
            case SG:
                url = testConfig.getUrl_sg();
                break;
            case FR:
                url = testConfig.getUrl_fr();
                break;
            case DE:
                url = testConfig.getUrl_de();
                break;
            case ZA:
                url = testConfig.getUrl_za();
                break;
            case TH:
                url = testConfig.getUrl_th();
                break;
            case AT:
                url = testConfig.getUrl_at();
                break;
            default:
                break;
        }
        return url;
    }
}
