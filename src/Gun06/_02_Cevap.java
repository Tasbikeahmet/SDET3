package Gun06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;
import org.junit.Assert;
import java.util.List;

public class _02_Cevap extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        WebElement user= driver.findElement(By.id("user-name"));
        user.sendKeys("standard_user");
        Bekle(2);
        WebElement passord= driver.findElement(By.id("password"));
        passord.sendKeys("secret_sauce");
        Bekle(2);
        WebElement login= driver.findElement(By.id("login-button"));
        login.click();
        Bekle(2);
        WebElement gir= driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        gir.click();
        Bekle(2);
        WebElement ekle= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        ekle.click();
        Bekle(2);
        WebElement cik= driver.findElement(By.id("back-to-products"));
        cik.click();
        Bekle(2);
        WebElement gir1= driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        gir1.click();
        Bekle(2);
        WebElement ekle2= driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        ekle2.click();
        Bekle(2);
        WebElement cik1= driver.findElement(By.id("back-to-products"));
        cik1.click();
        Bekle(2);
        WebElement sepet= driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        sepet.click();
        Bekle(2);
        WebElement check= driver.findElement(By.xpath("//*[@id='checkout']"));
        check.click();
        Bekle(2);
        WebElement ad= driver.findElement(By.xpath("//*[@id='first-name']"));
        ad.sendKeys("Ahmet");
        Bekle(2);
        WebElement soyad= driver.findElement(By.xpath("//*[@id='last-name']"));
        soyad.sendKeys("Mutlu");
        Bekle(2);
        WebElement posta= driver.findElement(By.xpath("//*[@id='postal-code']"));
        posta.sendKeys("34540");
        Bekle(2);
        WebElement cont= driver.findElement(By.xpath("//*[@id='continue']"));
        cont.click();
        Bekle(2);

        List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam=0;

        for (WebElement e:ucretler)
        {
            System.out.println(e.getText());
            toplam +=Double.parseDouble(e.getText().substring(1));

        }
        System.out.println("toplam="+toplam);

        WebElement total= driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
       double alttoplam= Double.parseDouble(total.getText().substring(13));
        System.out.println("alttoplam = " + alttoplam);

        if (toplam==alttoplam)
            System.out.println("Test passed");
        else System.out.println("Test failed");


        Assert.assertTrue(toplam==alttoplam);


       BekleKapat();
    }
}
