package Gun13;

import org.openqa.selenium.Dimension;
import utilis.BaseStaticDriver;

public class _03_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();//ekrani tam haline getiriyor
        Bekle(4);

        //ekrani yeni olculere gore set etme
        Dimension dim=new Dimension(516,600);
        driver.manage().window().setSize(dim);
        Bekle(5);
        BekleKapat();

    }
}
