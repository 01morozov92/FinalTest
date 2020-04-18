package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    public void clickButton(String text) {
        $(By.xpath("/html/body/header/div/div/nav/ul/li[6]/"+text)).click();
    }
    public void clickButtonLogin(String text) {

        $(By.xpath("//*[@id=\"" + text + "\"]/div[2]/input[2]")).click();
    }
}
