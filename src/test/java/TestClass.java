import PageObjects.AllToys;
import PageObjects.HomePage;
import driver.BaseClass;
import org.junit.Test;

public class TestClass extends BaseClass {
    HomePage homePage = new HomePage();
    AllToys allToys = new AllToys();

    @Test
    public void linkPrintTest(){

        homePage.babyandChildMouseHover();
        allToys.linkTest();
    }
}
