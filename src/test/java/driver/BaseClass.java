package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("https://www.johnlewis.com");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.manage().deleteAllCookies();
    }

    public void tearDown(){
        driver.quit();
    }

}

