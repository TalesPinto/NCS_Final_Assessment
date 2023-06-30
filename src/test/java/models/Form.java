package models;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Form {

    private WebDriver driver;

    public Form(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignup(){
        driver.findElement(By.cssSelector("p > a")).click();
    }

    public void clickSignupError(){
        driver.findElement((By.cssSelector("[aria-label=\"signup\"]"))).click();
    }


}
