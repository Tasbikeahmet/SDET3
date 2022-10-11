package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class _02_ElemaninStatusu extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println(sali.isDisplayed());//gorunuyor mu
        System.out.println(sali.isEnabled());  //  aktif mi
        System.out.println(sali.isSelected());// secilimi

        sali.click();
        Bekle(3);
        System.out.println(sali.isSelected());

        BekleKapat();

    }
}
