package Gun08;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilis.BaseStaticDriver;

import java.util.List;

public class _03_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");
        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();
        WebElement element= driver.findElement(By.xpath("//*[@id='catnav-primary-link-10855' ]"));
        WebElement kolye= driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibkolye= driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar= new Actions(driver);
        aksiyonlar.moveToElement(element).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(kolye).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(bibkolye).click().build().perform();
        Bekle(2);

        String url= driver.getCurrentUrl();
        Assert.assertTrue(url.contains("bib"));

        BekleKapat();



    }
}
