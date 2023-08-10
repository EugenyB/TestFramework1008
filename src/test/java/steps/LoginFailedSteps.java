package steps;

import pages.LoginFailedPage;

public class LoginFailedSteps {

    LoginFailedPage page = new LoginFailedPage();

    public void verifyThatFailedPageVisible() {
        page.assertThatUserDivIsAbsent();
        page.assertThatErrorDivIsPresent();
    }

    public void verifyThatBackLinkIsVisible() {
        page.assertBackLinkExists();
    }
}
