package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _01_WindowGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank'"));
        for (WebElement link:linkler){
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }
        Set<String> WindowIdler=driver.getWindowHandles();
        for (String id:WindowIdler)
            System.out.println("id = " + id);

        Bekle(6);
        BekleKapat();
    }
}
//        id = CDwindow-E5D0D19CB0BCFD9CB583F34B65EDF4DF
//        id = CDwindow-6CA71F9D852990BE8AEB7D2AECBC7480
//        id = CDwindow-399001DA2113FF61566160C1B808B23A
//        id = CDwindow-6E7DF3D36698FE62007CF42515C23DC0
//        id = CDwindow-A59F6D13417D976C2E52229243A32137
//        id = CDwindow-751A9C3BCDDB5A6F9822439CEF6F236D
//        id = CDwindow-D8DF6AF540B754C9DC38AA0795618699
//        id = CDwindow-5786E5839EAE571D02690E0B224D2165
//        id = CDwindow-A0C6BE6DC0F0740AC57C7B4F3585EFA7
//        id = CDwindow-7C582D80A599EDBF309BEE3BD799FAA8
