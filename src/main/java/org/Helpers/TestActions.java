package org.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestActions {
    WebDriver driver;

    public void clickElement(WebElement element) {
        if (element.isDisplayed()) {
            element.click();
        }
    }

    public boolean isEnabled(WebElement element){return element.isEnabled();}

    public String getText(WebElement element) {
        return element.getText();
    }

    public void sendKeys(WebElement element, String value) {
        if (element.isDisplayed()) {
            element.sendKeys(value);
        }
    }
}
