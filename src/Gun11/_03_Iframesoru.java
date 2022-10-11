package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilis.BaseStaticDriver;

/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
public class _03_Iframesoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://chercher.tech/practice/frame");
        driver.switchTo().frame(0);//frame1
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Turkiye");
        driver.switchTo().frame(0);//frame1
        WebElement check= driver.findElement(By.id("a"));
        check.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement menu=driver.findElement(By.id("animals"));
        Select ddmenu=new Select(menu);//drop down menu
        ddmenu.selectByIndex(3);//4 elemani sectik

        driver.switchTo().parentFrame();

    }
}
