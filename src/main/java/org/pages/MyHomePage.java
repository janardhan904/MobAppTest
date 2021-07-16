package org.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage {

    private AndroidDriver<AndroidElement> driver;

    public MyHomePage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="settings button")
    private AndroidElement settingsButton;

    public void clickSettingsButton(){
        settingsButton.click();
    }

    @AndroidFindBy(id="log out")
    private AndroidElement logOutButton;

    public void clickLogOut(){
        logOutButton.click();
    }

    @AndroidFindBy(id="alert settings")
    private AndroidElement alertSettings;

    public boolean alertSettingsIsDisplayed() {
        return alertSettings.isDisplayed();
    }
}
