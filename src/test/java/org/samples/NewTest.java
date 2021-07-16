package org.samples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.drivermanager.CreateDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class NewTest {

    WebDriver driver;
    AppiumDriver appiumDriver;

    @Test
    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        CreateDriver managerDriver = new CreateDriver();
        managerDriver.createDriver("android");
        System.out.println("At app");
    }
}
