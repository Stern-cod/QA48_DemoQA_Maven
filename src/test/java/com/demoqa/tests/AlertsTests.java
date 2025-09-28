package com.demoqa.tests;

import com.demoqa.padges.HomePage;
import com.demoqa.padges.SidePanel;
import com.demoqa.padges.alertsFrameWindows.AlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts();

    }
    @Test
    public void alertWaitTest(){
        new AlertsPage(driver).alertWithTimer();
    }


}
