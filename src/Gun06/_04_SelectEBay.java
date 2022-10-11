package Gun06;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilis.BaseStaticDriver;

public class _04_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.ebay.com/");

        WebElement menu= driver.findElement(By.xpath("//*[@id='gh-cat']"));
        Select ddmenu= new Select(menu);
        ddmenu.selectByValue("20081");
        Bekle(3);
        WebElement srcb=driver.findElement(By.xpath("//*[@id='gh-btn']"));
        srcb.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));

        BekleKapat();
    }
}
