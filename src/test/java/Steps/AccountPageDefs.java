package Steps;

import Pages.AccountPage;
import io.cucumber.java.en.Then;

public class AccountPageDefs {
    AccountPage accountPage = new AccountPage();
    @Then("click {string} close button")
    public void clickCloseButton(String arg0) {
        accountPage.clickCloseButton(arg0);
    }

    @Then("content have text All projects")
    public void contentHaveTextAllProjects() {
        accountPage.contentIsVisible();
    }
}
