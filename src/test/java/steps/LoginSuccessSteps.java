package steps;

import pages.LoginSuccessPage;

public class LoginSuccessSteps {
    LoginSuccessPage page = new LoginSuccessPage();

    public void verifyAllOk() {
        page.assertThatUserDivPresent();
    }
}
