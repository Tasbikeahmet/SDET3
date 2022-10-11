package Gun13;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_ekrankayit extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Ahmet");
        WebElement pass= driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Ahmet123");
        WebElement login= driver.findElement(By.id("btnLogin"));
        login.click();

        List<WebElement>spanmsg=driver.findElements(By.id("spanMessage"));
        if (spanmsg.size()>0){//login olamadinhata ekran goruntusu saklayalim
            //hata ekrani screenshot inni alalim
            System.out.println("Login olunamadi , hata mesaji gorundu");

            TakesScreenshot ts= (TakesScreenshot)driver;//1.asama ekran goruntusu alma  degiskenini tanimladim
            File hafizadakihali=ts.getScreenshotAs(OutputType.FILE);//2 asama saklama tipi secildi dosya olarak
            //hafizadakihali ->dosya olarak kaydedicez(jpg, png, bmp)
            FileUtils.copyFile(hafizadakihali, new File("ekranGoruntuleri/LoginKontrol.png"));
            //
        }

        BekleKapat();
    }
}
