package mk.ukim.finki.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Time;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() throws InterruptedException {
        Thread.sleep(12000);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("a8c37x1j")))
                .isDisplayed();
    }
}
