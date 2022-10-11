package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

import java.util.List;

//        1- https://www.youtube.com/ adresine gidiniz
//        2- "Selenium" kelimesi ile video aratınız.
//        3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//        4- Son videonun title ını yazdırınız.
public class soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");
        WebElement aramakutu= driver.findElement(By.cssSelector("div[id='search-input']>input"));
        //WebElement aramabutton=driver.findElement(By.cssSelector("button[id='search-icon-legacy']>yt-icon"));
        WebElement aramabutton=driver.findElement(By.id("search-icon-legacy"));
        aramakutu.sendKeys("Selenium");
        Bekle(2);
        aramabutton.click();

        driver.getCurrentUrl().contains("Selenium");
Bekle(5);

       JavascriptExecutor js= (JavascriptExecutor) driver;
        for (int i = 0; i < 15; i++) {


            js.executeScript("window.scrollBy(0,1900)");
            Bekle(10);
        }

        List<WebElement>video=driver.findElements(By.xpath("//span[@id='video-title']"));
        System.out.println("video.size() = " + video.size());
        for (WebElement e:video)
           if (video.size()==5){
               System.out.println(e.getAttribute("title"));
           }

//BekleKapat();
    }
}
