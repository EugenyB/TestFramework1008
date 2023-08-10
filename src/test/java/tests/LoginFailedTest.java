package tests;

import org.testng.annotations.Test;
import steps.LoginFailedSteps;

public class LoginFailedTest extends BaseTest {

    @Test(dataProvider = "loginDataFailed")
    public void testLoginFailed(String login, String password) {
        visit("");
        LoginFailedSteps steps1 = steps.doIncorrectLogin(login, password);
        steps1.verifyThatFailedPageVisible();
    }

    @Test(dataProvider = "loginDataFailed", dependsOnMethods = {"testLoginFailed"})
    public void testLoginFailedAndBackLinkIsPresent(String login, String password) {
        visit("");
        LoginFailedSteps steps1 = steps.doIncorrectLogin(login, password);
        steps1.verifyThatBackLinkIsVisible();
    }
}
