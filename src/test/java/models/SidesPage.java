package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SidesPage {

    private WebDriver driver;

    public SidesPage(WebDriver driver) {
        this.driver = driver;
    }



    public void clickMenuSides(){
        for(WebElement elem : driver.findElements(By.cssSelector("[role=tab]"))) {

            System.out.println(elem.getText());
            if(elem.getText().equalsIgnoreCase("SIDES")) {
                //loop through menu to click SIDES option
                System.out.println(elem.getText());
                elem.click();
            }
        }
    }

    // create a method to create a list with all sides
        // create empty list
        // create webelement list of all objects using a for loop

    // create a method to get "Chunky Chips and Aioli" object
        // get and verify KJ
        // get and verify price

}
