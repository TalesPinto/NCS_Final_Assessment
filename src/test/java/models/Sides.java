package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sides {

    WebElement elementSides;

    public Sides(WebElement elementPizza) {
        this.elementSides = elementPizza;
    }

    public String getName(){
        return elementSides.findElement(By.className("name")).getText();
    }

    
}
