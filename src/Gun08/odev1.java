package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilis.BaseStaticDriver;

import java.util.List;
import java.util.WeakHashMap;

public class odev1 extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        WebElement sehir = driver.findElement(By.xpath("//div[@id='answerDiv']//div[1]"));
        WebElement ulkeler = driver.findElement(By.xpath("(//*[@class='destinationBox'])[1]"));
        WebElement ulkeler2 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[2]"));
        WebElement ulkeler3 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[3]"));
        WebElement ulkeler4 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[4]"));
        WebElement ulkeler5 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[5]"));
        WebElement ulkeler6 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[6]"));
        WebElement ulkeler7 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[7]"));
        WebElement ulkeler8 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[8]"));
        WebElement ulkeler9 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[9]"));
        WebElement ulkeler10 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[10]"));
        WebElement ulkeler11 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[11]"));
        WebElement ulkeler12 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[12]"));
        WebElement ulkeler13 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[13]"));
        WebElement ulkeler14 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[14]"));
        WebElement ulkeler15 = driver.findElement(By.xpath("(//*[@class='destinationBox'])[15]"));



        Actions aksiyonlar = new Actions(driver);
        aksiyonlar.moveToElement(sehir).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler).perform();
        WebElement check = driver.findElement(By.xpath("(//*[@class='destinationBox']//child::div)[1]"));


        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler).clickAndHold().perform();
        Bekle(2);

        new Actions(driver).release(ulkeler2).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler2).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler3).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler3).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler4).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler4).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler5).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler5).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler6).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler6).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler7).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler7).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler8).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler8).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler9).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler9).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler10).perform();

        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler10).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler11).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler11).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler12).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler12).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler13).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler13).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler14).perform();
        if (check.getTagName().contains("correctAnswer")) ;
        else aksiyonlar.moveToElement(ulkeler14).clickAndHold().perform();
        Bekle(2);
        new Actions(driver).release(ulkeler15).perform();




        BekleKapat();
    }
}
