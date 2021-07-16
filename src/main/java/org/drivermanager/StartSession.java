package org.drivermanager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class StartSession {
    private static AppiumDriver driver;
    private DesiredCapabilities capabilities;

    public AppiumDriver createAndroidDriver() {

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "7");
        capabilities.setCapability("deviceName", "Redmi");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.miui.calculator");
        capabilities.setCapability("appActivity",
                "com.miui.calculator.cal.CalculatorActivity");

        try {
            driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            return driver;
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        return driver;
    }

    public AppiumDriver createIOSDriver() {

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("deviceName", "IPhone 7 Plus");
        capabilities.setCapability("app", System.getProperty("iOSAppPath"));
        capabilities.setCapability("platformName", "iOS");

        try {
            driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            return driver;
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        return driver;
    }
}