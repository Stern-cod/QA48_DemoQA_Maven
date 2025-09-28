package com.demoqa.tests;

import com.demoqa.padges.BasePage;
import com.demoqa.padges.HomePage;
import com.demoqa.padges.SidePanel;
import com.demoqa.padges.bookStore.LoginPage;
import com.demoqa.padges.bookStore.ProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBookStore();
        new SidePanel(driver).selectLogin();

    }
    @Test
    public void loginPositiveTest(){
        new LoginPage(driver).eneterUserData("pro100kod",
                "As012345!").clickOnLoginButton();
        new ProfilePage(driver).verifyUserName("pro100kod");

    }
}
