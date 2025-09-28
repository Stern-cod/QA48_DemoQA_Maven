package com.demoqa.padges.bookStore;

import com.demoqa.padges.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);

    }
    @FindBy(id="userName")
    WebElement userField;
    @FindBy(id="password")
    WebElement passwordField;

    public LoginPage eneterUserData(String userName, String password) {
        type(userField ,userName);
        typeWithJS(passwordField,password,0,400);

        return this;
    }
    @FindBy(id="login")
    WebElement loginButton;

    public ProfilePage clickOnLoginButton() {
        click(loginButton) ;
        return new ProfilePage(driver);
    }
}
