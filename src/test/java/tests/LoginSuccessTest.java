package tests;

import org.testng.annotations.Test;
import steps.LoginSuccessSteps;

public class LoginSuccessTest extends BaseTest {

    @Test(dataProvider = "loginDataCorrect")
    public void testLoginSuccess(String login, String password) {
        visit("");
        LoginSuccessSteps steps1 = steps.doLogin(login, password);
        steps1.verifyAllOk();
    }
}
