package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;
/*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switch().alert() bunula kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz.
 */

public class _04_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe=driver.findElement(By.cssSelector("[Class='btn btn-default']"));
        clickMe.click();

        Bekle(2);
        driver.switchTo().alert().accept();//Alert kutucuguna gecildi ve tamam butonuna basildi
        Bekle(2);





        BekleKapat();
    }

}
