package org.drivermanager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;

public interface FactoryDriver {
    AppiumDriver<WebElement> createDriver(String OS) throws MalformedURLException;
}
