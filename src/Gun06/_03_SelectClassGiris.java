package Gun06;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilis.BaseStaticDriver;

public class _03_SelectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com/");

        WebElement menu= driver.findElement(By.id("searchDropdownBox"));

        Select ddmenu= new Select(menu);
        ddmenu.selectByVisibleText("Books");
        Bekle(1);
        WebElement srcbutton= driver.findElement(By.id("nav-search-submit-button"));
        srcbutton.click();

        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon"));



BekleKapat();
    }
}
