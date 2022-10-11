package Gun10;
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilis.BaseStaticDriver;

public class _04_Waitsoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");
        WebElement s6=driver.findElement(By.xpath("(//*[@id='tbodyid']//a)[2]"));
        s6.click();
       // WebElement s6= driver.findElement(By.linkText("Samsung galaxy s6")); hocanin yaptigi
        WebElement ekle= driver.findElement(By.linkText("Add to cart"));
        ekle.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();//Alert kutucuguna gecildi ve tamam butonuna basildi

        WebElement anasayfa= driver.findElement(By.id("nava"));
        anasayfa.click();




        BekleKapat();
    }
}
