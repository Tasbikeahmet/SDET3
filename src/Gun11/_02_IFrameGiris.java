package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilis.BaseStaticDriver;

public class _02_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);//frame1
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Turkiye");

        driver.switchTo().parentFrame();//geldigi yere geri doner(1 basamak doner)

        driver.switchTo().frame(1);//frame2
        WebElement menu=driver.findElement(By.id("animals"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByIndex(ddmenu.getOptions().size()-1);//son elemani sectik

        driver.switchTo().parentFrame();



        BekleKapat();
    }
}
