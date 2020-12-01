package PageObjects;

import driver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseClass {

    public void babyandChildMouseHover(){
        driver.findElement(By.xpath("//button[contains(@class,'c-button-yMKB7 c-button--primary-39fbj " +
                "c-button--inverted-UZv88 c-button--primary-3tLoH')]")).click();

        WebElement babyandChild = driver.findElement(By.linkText("Baby & Child"));
        Actions actions = new Actions(driver);
        actions.moveToElement(babyandChild).build().perform();

        driver.findElement(By.linkText("All Toys")).click();

    }
}
