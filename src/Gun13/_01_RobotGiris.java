package Gun13;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilis.BaseStaticDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Base64;

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");

        Robot rbt=new Robot();

        for (int i = 0; i < 13; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
// Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("\"C:\\Users\\ahmet\\OneDrive\\Desktop\\naklejki_panda_2818_detail-969x1080.jpg\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.
Bekle(1);
rbt.keyPress(KeyEvent.VK_CONTROL);
rbt.keyPress(KeyEvent.VK_V);
Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement submint= driver.findElement(By.id("submitbutton"));
        submint.click();


WebElement asser= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(asser.getText().contains("has been successfully uploaded."));
BekleKapat();

    }
}
