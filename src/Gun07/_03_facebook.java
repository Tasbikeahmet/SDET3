package Gun07;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class _03_facebook extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");
        WebElement kayit= driver.findElement(By.cssSelector("[id^='u_0_0']"));
        kayit.click();

        WebElement tekrar=driver.findElement(By.name("reg_email_confirmation__"));

        System.out.println("tekrar emaili gorunuyor mu?  "+tekrar.isDisplayed());

        WebElement ad= driver.findElement(By.name("firstname"));
        ad.sendKeys("Ahmet");
        WebElement soyad= driver.findElement(By.name("lastname"));
        soyad.sendKeys("Mutlu");

        Assert.assertFalse(tekrar.isDisplayed());// assert kontrol hata yoksa rahatsiz etmiyor

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("Ahmet@gmail.com");
        Assert.assertTrue(tekrar.isDisplayed());// assert kontrol hata yoksa rahatsiz etmiyor


        System.out.println("ilk email girildikten sonra tekrar emaili gorunuyor mu?  "+tekrar.isDisplayed());





        BekleKapat();
    }
}
