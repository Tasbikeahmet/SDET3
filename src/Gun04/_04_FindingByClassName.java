package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

import java.util.List;

public class _04_FindingByClassName extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://form.jotform.com/221934510376353");
        WebElement element=driver.findElement(By.className("Form-submit-button"));
        System.out.println(element.getText());
        WebElement element2=driver.findElement(By.className("from-sub-label"));
        System.out.println(element2.getText());//FindElement birden fazla eleman varsa ilkini getirir

        List<WebElement> liste = driver.findElements(By.className("from-sub-label"));
        for (WebElement e:liste)
            System.out.println("e.getText() = " + e.getText());

        BekleKapat();
    }
}
