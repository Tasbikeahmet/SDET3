package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class _01_IframeGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);//frame1
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Turkiye");

        driver.switchTo().parentFrame();//geldigi yere geri doner(1 basamak doner)
        driver.switchTo().defaultContent();// ana sayfaya direk doner

        BekleKapat();

    }
}
