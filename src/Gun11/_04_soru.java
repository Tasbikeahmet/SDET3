package Gun11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilis.BaseStaticDriver;
/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */

public class _04_soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement ilksayi=driver.findElement(By.id("number1Field"));
        WebElement ikincisayi=driver.findElement(By.id("number2Field"));
        WebElement islem= driver.findElement(By.id("selectOperationDropdown"));
        WebElement submit= driver.findElement(By.id("calculateButton"));
        WebElement sonuc= driver.findElement(By.id("numberAnswerField"));
        WebElement sil= driver.findElement(By.id("clearButton"));


        Select ddMenu=new Select(islem);
        for (int i = 0; i < 5; i++) {
            ddMenu.selectByIndex(i);



            for (int j = 0; j < 5; j++) {


                int randomsayi1 = (int) (Math.random() * 100);
                int randomsayi2 = (int) (Math.random() * 100);
                ilksayi.sendKeys(String.valueOf(randomsayi1));
                ikincisayi.sendKeys(String.valueOf(randomsayi2));
                double toplam = randomsayi1 + randomsayi2;
                submit.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));
                String ytoplam = String.valueOf(toplam);
                double dsonuc = Double.parseDouble(sonuc.getAttribute("value"));
                String ysonuc = String.valueOf(dsonuc);
                System.out.println(ysonuc + " =" + ytoplam);
                Assert.assertEquals(ysonuc, ytoplam);
                ilksayi.clear();
                ikincisayi.clear();
            }
//            switch (i) {
//                case 0 =
//                    double toplam = Double.parseDouble(ilksayi.getAttribute("value") + ikincisayi.getAttribute("value"));
//                case 1 =
//                    double cikarma = Double.parseDouble(ilksayi.getAttribute("value") - ikincisayi.getAttribute("value"));
//                case 2 =
//                    double carpma = Double.parseDouble(ilksayi.getAttribute("value") * ikincisayi.getAttribute("value"));
//                case 3 =
//                    double bolme = Double.parseDouble(ilksayi.getAttribute("value") / ikincisayi.getAttribute("value"));
//                case 4 =
//                    double ekle= Double.parseDouble(ilksayi.getAttribute("value").contains(ikincisayi.getAttribute("value"));
//
//            }

        }











        BekleKapat();
    }

}
