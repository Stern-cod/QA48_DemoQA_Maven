package com.demoqa.padges.alertsFrameWindows;

import com.demoqa.padges.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;
    public AlertsPage alertWithTimer() {
        click(timerAlertButton);
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return new AlertsPage(driver);
    }
}
