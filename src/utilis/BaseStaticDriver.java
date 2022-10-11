package utilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BaseStaticDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

     static
    {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
       // driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //

        Duration dr= Duration.ofSeconds(30);
         wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(dr); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(dr); // bütün webElement için geçerli
    }
    public static void BekleKapat(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    public static void Bekle(int saniye){

        try {
            Thread.sleep(saniye+1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void kalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
}
