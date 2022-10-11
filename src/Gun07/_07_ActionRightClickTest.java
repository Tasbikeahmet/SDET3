package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilis.BaseStaticDriver;

public class _07_ActionRightClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        Bekle(3);
        WebElement element=driver.findElement(By.id("rightClickBtn"));
        Bekle(2);
        Actions aksiyonlar= new Actions(driver);

        Action aksiyon= aksiyonlar.moveToElement(element).contextClick().build();

        aksiyon.perform();




BekleKapat();

    }



}
