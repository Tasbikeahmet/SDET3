package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilis.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _02_WindowSwitch extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowId= driver.getWindowHandle();//sadece bulundugu sayfanin win idsini verir


        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank'"));
        for (WebElement link:linkler){
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }
        Set<String> WindowIdler=driver.getWindowHandles();// acik olan butun win lerin  idlerini verir

        for (String id:WindowIdler) {
            if (id.equals(anaSayfaWindowId))continue;//ana sayfa deilse

            driver.switchTo().window(id);// diger sayfalara gecis yapar
            System.out.println(id+"Title ="+driver.getTitle());

        }

        Bekle(6);
        BekleKapat();
    }
}
//        CDwindow-7630261F31A0DCD30CFF1D24E9AFC71DTitle =Selenium
//        CDwindow-B8B78CAA6289A508D234E4043382370BTitle =Selenium Developers - Google Groups
//        CDwindow-5536BF7731F8D1E4DAD0AD465745DFEATitle =Kiwi IRC - The web IRC client
//        CDwindow-FF472FF7A83B9E675ECDC828716A0A1ATitle =Join selenium on Slack | Slack
//        CDwindow-477D2028AAEDD195A768F41C64095C10Title =GitHub - SeleniumHQ/selenium: A browser automation framework and ecosystem.
//        CDwindow-17A7D7EC8BDFB09C26742F8026BF8731Title =Selenium (WebDriver) - Home | Facebook
//        CDwindow-DF4836882E45F27261044E9B4AB42309Title =Selenium Conference - YouTube
//        CDwindow-E59F7E9828E2F483DE9CC9F815B98ABFTitle =Selenium (@SeleniumHQ) / Twitter
//        CDwindow-8DA41AFCE74F2C38D3210218DAC30712Title =Selenium Users - Google Groups
//        CDwindow-0C6DD20815D7C0222AF282ADAB84F7B8Title =Selenium Conf 2022 - Online | ConfEngine - Conference Platform
//
