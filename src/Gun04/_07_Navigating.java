package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class _07_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        //tarayicinin linklere tikladiginda gidip geldigi sayfalari
        //saklar ve asagidaki komutlarla ileri geri yonlendirir

        WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();
        Bekle(3);
        driver.navigate().back();
        Bekle(3);

        driver.navigate().forward();

        BekleKapat();

    }

}
