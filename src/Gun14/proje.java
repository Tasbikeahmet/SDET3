package Gun14;

import utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class proje extends BaseStaticDriver {
    public static void main(String[] args) {
        scenario1();
        scenario2();
        scenario3();
        scenario4();
        scenario5();

        BekleKapat();

    }

    private static void scenario5() {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addToCart = driver.findElement(By.xpath("(//*[@class='basicDetails'])[2]/button"));
        addToCart.click();

        WebElement iframe = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        WebElement payWithDebitCC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CC")));
        payWithDebitCC.click();

        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Email']")));
        emailInput.sendKeys("fakeEmail@email.com");

        WebElement confirmEmailInput = driver.findElement(By.cssSelector("[placeholder='Confirm Email']"));
        confirmEmailInput.sendKeys("fakeEmail@email.com");

        WebElement nameInput = driver.findElement(By.cssSelector("[placeholder='Name On Card']"));
        nameInput.sendKeys("Fake Name");

        WebElement privateFrame = driver.findElement(By.cssSelector("[name^='__privateStripeFrame']"));
        driver.switchTo().frame(privateFrame);

        WebElement cardNumberInput = driver.findElement(By.name("cardnumber"));
        cardNumberInput.sendKeys("4242 4242 4242 4242");

        WebElement expDateInput = driver.findElement(By.name("exp-date"));
        expDateInput.sendKeys("12/22");

        WebElement cvcInput = driver.findElement(By.name("cvc"));
        cvcInput.sendKeys("000");

        driver.switchTo().parentFrame();

        WebElement payButton = driver.findElement(By.className("Pay-Button"));
        payButton.click();

        WebElement thankYouMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("confirme_text")));
        Assert.assertTrue(thankYouMessage.isDisplayed());

    }

    private static void scenario4() {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addToCart = driver.findElement(By.xpath("(//*[@class='basicDetails'])[2]/button"));
        addToCart.click();

        WebElement iframe = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        WebElement payWithDebitCC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CC")));
        payWithDebitCC.click();

        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Email']")));
        emailInput.sendKeys("fakeEmail@email.com");

        WebElement confirmEmailInput = driver.findElement(By.cssSelector("[placeholder='Confirm Email']"));
        confirmEmailInput.sendKeys("fakeEmail@email.com");

        WebElement nameInput = driver.findElement(By.cssSelector("[placeholder='Name On Card']"));
        nameInput.sendKeys("Fake Name");

        WebElement privateFrame = driver.findElement(By.cssSelector("[name^='__privateStripeFrame']"));
        driver.switchTo().frame(privateFrame);

        WebElement cardNumberInput = driver.findElement(By.name("cardnumber"));
        cardNumberInput.sendKeys("1111 1111 1111 1111");

        driver.switchTo().parentFrame();

        WebElement snackBarInfo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SnackBar")));
        Assert.assertTrue(snackBarInfo.isDisplayed());
    }

    private static void scenario3() {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addToCart = driver.findElement(By.xpath("(//*[@class='basicDetails'])[2]/button"));
        addToCart.click();

        WebElement iframe = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        WebElement payWithDebitCC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CC")));
        payWithDebitCC.click();

        WebElement payButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Pay-Button")));
        payButton.click();

        WebElement snackBarInfo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SnackBar")));
        Assert.assertTrue(snackBarInfo.isDisplayed());
    }

    private static void scenario2() {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addToCart = driver.findElement(By.xpath("(//*[@class='basicDetails'])[2]/button"));
        addToCart.click();

        WebElement iframe = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        WebElement addPromoCode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Apply-Button")));
        addPromoCode.click();

        WebElement promoCodeInput = driver.findElement(By.className("Promo-Code-Value"));
        promoCodeInput.sendKeys("123456789");

        WebElement apply = driver.findElement(By.className("Promo-Apply"));
        apply.click();

        WebElement snackBarInfo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SnackBar")));
        Assert.assertTrue(snackBarInfo.isDisplayed());
    }

    public static void scenario1() {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addToCart = driver.findElement(By.xpath("(//*[@class='basicDetails'])[2]/button"));
        addToCart.click();

        WebElement iframe = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        WebElement cartItemsNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='Cart-Items-Nos'])[last()]")));
        Assert.assertEquals("1", cartItemsNo.getText());

        WebElement removeButton = driver.findElement(By.cssSelector("button.Product-Remove"));
        removeButton.click();

        wait.until(ExpectedConditions.invisibilityOf(removeButton));

        WebElement continueShopping = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Continue-Button Close-Cart']")));
        continueShopping.click();

        driver.switchTo().defaultContent();

        WebElement cartItemsNoHome = driver.findElement(By.xpath("(//*[@id='cart_item_nos'])[2]"));
        Assert.assertEquals("0", cartItemsNoHome.getText());
    }
}


