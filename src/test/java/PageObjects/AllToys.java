package PageObjects;

import driver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllToys extends BaseClass {
    public void linkTest(){

    List<WebElement> linkList =driver.findElements(By.tagName("a"));
    int linkCount = linkList.size();
         System.out.println("Total Number of links on AllToys Page : "+linkCount);

    for(int i = 0 ; i<linkList.size() ; i++){
        String linkText = linkList.get(i).getText();
        System.out.println(" Following links are present on AllToys Page :"+ linkText);
    }
}}
