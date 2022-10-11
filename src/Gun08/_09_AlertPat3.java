package Gun08;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class _09_AlertPat3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe=driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clickMe.click();

        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());//Alertin texti alindi
        driver.switchTo().alert().sendKeys("ahmet");

        driver.switchTo().alert().accept();//Alert kutucuguna gecildi ve tamam butonuna basildi
        Bekle(2);

        WebElement txtActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("ahmet"));





        BekleKapat();
    }
}
