package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class _05_FindingByLinkText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");
        WebElement element= driver.findElement(By.linkText("Siparişlerim"));//sadece a tag lerinde callisir

        System.out.println(element.getText());
        System.out.println("element.getAttribute(\"title\") = " + element.getAttribute("title"));
        System.out.println("element.getAttribute(\"href\") = " + element.getAttribute("href"));
        System.out.println("element.getAttribute(\"rel\") = " + element.getAttribute("rel"));

        WebElement element2= driver.findElement(By.partialLinkText("Süper Fiyat"));//sadece a tag lerinde callisir
        System.out.println("element2 = " + element2.getText());


        BekleKapat();

    }







}
