package Gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class odev1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/text-box");
        Bekle(3);
        WebElement element1= driver.findElement(By.cssSelector("[id='userName-wrapper'] input"));
        element1.sendKeys("Automation");

        WebElement element2= driver.findElement(By.cssSelector("[id='userEmail-wrapper'] input"));
        element2.sendKeys("Testing@gmail.com");

        WebElement element3= driver.findElement(By.cssSelector("[id='currentAddress-wrapper'] input"));
        element3.sendKeys("Testing Current Address");

        WebElement element4= driver.findElement(By.id("permanentAddress"));
        element4.sendKeys("Testing Permanent Address");

        WebElement  element= driver.findElement(By.cssSelector("[id='submit']"));
        element.click();

        if (element1.getText().contains("Automation"))
            System.out.println("true");
        else System.out.println("false");
        if (element2.getText().contains("Testing"))
            System.out.println("true");
        else System.out.println("false");

        BekleKapat();



    }
}
