package Steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;


import static com.codeborne.selenide.Selenide.*;

public class Testec {
    @Before()

    public void tesTec () {
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1000x1000";
        open("https://cucumber.netlify.app/");
    }
}
