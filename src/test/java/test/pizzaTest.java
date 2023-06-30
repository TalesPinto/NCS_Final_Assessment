package test;

import models.Form;
import models.SidesPage;
import models.Toolbar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class pizzaTest {

    private WebDriver driver;

    private WebDriver getWebDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        return driver;
    }



    @BeforeEach
      public void setup() {
        getWebDriver();
        driver.get("https://d3ovkzfkbrwp1z.cloudfront.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @Test
    public void openSignupFormToErrorMessage() {
        new Toolbar(driver).clickLogin();
        new Form(driver).clickSignup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // wait for error form to open
        new Form(driver).clickSignupError();
    }




    @Test
    public void validateUsernameError() {
        String usernameErrorMessage = driver.findElement(By.id("username-err")).getText(); //Refactor
        Assertions.assertEquals("Username is required", usernameErrorMessage);
    }

    @Test
    public void validatePasswordError(){
      String passwordErrorMessage = driver.findElement(By.id("password-err")).getText(); //Refactor
      Assertions.assertEquals("Password is required", passwordErrorMessage);
    }

    @Test
    public void validateConfirmError() {
        String confirmErrorMessage = driver.findElement(By.id("confirm-err")).getText(); //Refactor
        Assertions.assertEquals("Please confirm your password", confirmErrorMessage);
    }

//    @Test
//    public void fillOutUsername() {
//        driver.findElement(By.cssSelector("[id=input-91]")).click();
//        driver.findElement(By.cssSelector("[id=input-95]")).sendKeys("abc");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // wait for error form to open
//        driver.findElement(By.id("input-91")).sendKeys("abc");

//    }

//    @Test
//    public void locateFavPizza() {
//        new Toolbar(driver).clickMenu();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // wait for error form to open
//        new SidesPage(driver).clickMenuSides();
//    }



//
//
//        System.out.println("got here");




    @AfterEach
    public void quit() {
        driver.quit();
    }
}
