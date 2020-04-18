package Steps;

import Config.UserConfig;
import Pages.SignInPage;
import io.cucumber.java.en.Then;

public class SignInPageDefs {
    SignInPage signInPage = new SignInPage();
    @Then("input login")
    public void inputLogin() {
        signInPage.loginInput(UserConfig.USER_LOGIN);
    }

    @Then("input password")
    public void inputPassword() {
        signInPage.passwordInput(UserConfig.USER_PASSWORD);
    }
}
