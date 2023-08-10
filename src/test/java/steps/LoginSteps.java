package steps;

import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    public LoginSuccessSteps doLogin(String login, String password) {
        inputLoginData(login, password);
        return new LoginSuccessSteps();
    }

    private void inputLoginData(String login, String password) {
        loginPage.fillLoginField(login);
        loginPage.fillPasswordField(password);
        loginPage.clickButton();
    }

    public LoginFailedSteps doIncorrectLogin(String login, String password) {
        inputLoginData(login, password);
        return new LoginFailedSteps();
    }
}

