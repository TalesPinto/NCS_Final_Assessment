package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Toolbar {

    private WebDriver driver;

    public Toolbar(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin(){
        driver.findElement(By.className("nav-login-signup")).click();
    }

    public void clickMenu() {
        driver.findElement(By.cssSelector("[aria-label=menu]")).click();
    }
}
