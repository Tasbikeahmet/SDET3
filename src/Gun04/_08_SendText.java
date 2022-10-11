package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class _08_SendText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement element=driver.findElement(By.linkText("No, thanks!"));
        element.click();
        Bekle(2);

        WebElement txtBox= driver.findElement(By.id("user-message"));
        txtBox.sendKeys("merhaba Selenium");
        Bekle(3);

        WebElement btn=driver.findElement(By.className("btn-default"));
        btn.click();
        Bekle(3);

        WebElement msg= driver.findElement(By.id("display"));
        if (msg.getText().contains("merhaba Selenium"))
            System.out.println("Test passed");
        else System.out.println("Test fail");
        BekleKapat();
    }
}
