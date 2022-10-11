package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilis.BaseStaticDriver;

import java.nio.file.WatchEvent;

public class _05_ActionsClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));
        Bekle(2);
        Actions aksiyonlar= new Actions(driver);
        System.out.println("Aksiyon oncesi aksiyonlar sinifi olusturuldu");
        Bekle(2);
        Action aksiyon= aksiyonlar.moveToElement(element).click().build();//element in uzerine git ve CLICK i hazirla
        System.out.println("Aksiyon hazirlandi");
        Bekle(2);
        aksiyon.perform();//aksiyonu gerceklestir
        System.out.println("Aksiyon gerceklesti");
       // aksiyonlar.moveToElement(element).click().build().perform(); kisahali





        BekleKapat();
    }







}
