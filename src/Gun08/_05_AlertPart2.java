package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class _05_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe=driver.findElement(By.cssSelector("[Class='btn btn-default btn-lg']"));
        clickMe.click();

        Bekle(2);
        driver.switchTo().alert().dismiss();//Alert kutucuguna gecildi ve cencel butonuna basildi
        Bekle(2);





        BekleKapat();
    }
}
