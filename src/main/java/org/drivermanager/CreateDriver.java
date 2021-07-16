package org.drivermanager;

import io.appium.java_client.AppiumDriver;

public class CreateDriver implements FactoryDriver {
    private AppiumDriver driver;
    private StartSession startDriver;

    public AppiumDriver createDriver(String OS) {
        startDriver = new StartSession();
        if (OS.equals("android")) {
            driver = startDriver.createAndroidDriver();
        } else if (OS.equals("ios")) {
            driver = startDriver.createIOSDriver();
        }
        return driver;
    }
}
