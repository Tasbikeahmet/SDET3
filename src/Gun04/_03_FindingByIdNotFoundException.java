package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
try {


        WebElement eleman=driver.findElement(By.id("Label_"));
        System.out.println(eleman.getText()); }
catch (Exception ex){
    System.out.println("eleman bulunumadi"+ ex.getMessage());
}


        Thread.sleep(3000);
        driver.quit();
    }
}
