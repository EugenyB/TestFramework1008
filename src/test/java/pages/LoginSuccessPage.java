package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSuccessPage extends BasePage {
    //By divGrayBy = By.xpath("//*[@id='id_gray']");
    @FindBy(xpath = "//*[@id='id_gray']")
    WebElement divGray;


    public void assertThatUserDivPresent() {
        //WebElement divGray = driver.findElement(divGrayBy);
        assertThat(divGray.isDisplayed()).isTrue();
    }
}
