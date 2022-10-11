package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilis.BaseStaticDriver;

public class _01_ActionTuskontrolSentKeys extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar= new Actions(driver);
        Action aksiyon=aksiyonlar
                .moveToElement(element)//kutucuga gittim
                .click()//icine tiklattim
                .keyDown(Keys.SHIFT)//shiftmtusuna bastim
                .sendKeys("a")//kucuk a harfiyazdim ama shifte basili oldugundan buyuk a yazdi
                .keyUp(Keys.SHIFT)//shift tusunu elimizi kaldirdik
                .sendKeys("hmet")//ismin devamiini yazdim
                .build();

                aksiyon.perform();
        Bekle(2);





        BekleKapat();
    }



}
