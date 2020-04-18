package Steps;

import io.cucumber.java.Before;


import static com.codeborne.selenide.Selenide.*;

public class Testec {
    @Before
    public void tesTec () {
        open("https://cucumber.netlify.app/");
    }
}
