package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

import java.util.List;

public class _06_FindingElements extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        List<WebElement> liste= driver.findElements(By.tagName("a"));

        for (WebElement e:liste)
            System.out.println(e.getText());

        BekleKapat();
    }
}
