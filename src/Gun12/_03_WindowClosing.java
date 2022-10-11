package Gun12;
/*
   1- https://www.selenium.dev/  sayfasına gidiniz
   2- Sayfadaki bütün yeni sayfa açan linkleri tıklatınız(mailto hariç)
   3- Açılan bütün yeni sayfaları teer teker kapatınız
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _03_WindowClosing extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowId= driver.getWindowHandle();//sadece bulundugu sayfanin win idsini verir


        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank'"));
        for (WebElement link:linkler){
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }
        Set<String> WindowIdler=driver.getWindowHandles();// acik olan butun win lerin  idlerini verir

        for (String id:WindowIdler) {
            if (id.equals(anaSayfaWindowId))continue;//ana sayfa deilse

            driver.switchTo().window(id);// diger sayfalara gecis yapar
            System.out.println(id+"Title ="+driver.getTitle());
            driver.close();
        }

        Bekle(6);
        BekleKapat();
    }
}
