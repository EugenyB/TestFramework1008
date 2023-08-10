package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    //By loginFieldBy = By.id("login");
    @FindBy(id="login")
    WebElement loginField;
    //By passwordFieldBy = By.id("passw");
    @FindBy(id="passw")
    WebElement passwordField;
    //By buttonBy = By.id("okbutton");
    @FindBy(id="okbutton")
    WebElement button;

    public void fillLoginField(String text) {
        //WebElement loginField = driver.findElement(loginFieldBy);
        loginField.clear();
        loginField.sendKeys(text);
    }

    public void fillPasswordField(String text) {
        //WebElement passwordField = driver.findElement(passwordFieldBy);
        passwordField.clear();
        passwordField.sendKeys(text);
    }

    public void clickButton() {
        //WebElement button = driver.findElement(buttonBy);
        button.click();
    }
}

