package Gun09;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilis.BaseStaticDriver;

import java.util.List;

public class proje extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://a.testaddressbook.com/sign_in");

        Actions actions = new Actions(driver);

        WebElement signInEmail = driver.findElement(By.id("session_email"));
        WebElement signInPassword = driver.findElement(By.id("session_password"));
        WebElement signInButton = driver.findElement(By.cssSelector("[data-test='submit']"));

        signInEmail.sendKeys("grup14@gmail.com");
        Bekle(1);
        signInPassword.sendKeys("grup14*");
        Bekle(1);
        signInButton.click();
        Bekle(1);

        WebElement Addresses = driver.findElement(By.linkText("Addresses"));
        Addresses.click();

        Bekle(1);

        WebElement newAddressButton = driver.findElement(By.cssSelector("[data-test='create']"));
        newAddressButton.click();

        Bekle(1);

        WebElement firstNameInput = driver.findElement(By.id("address_first_name"));
        WebElement lastNameInput = driver.findElement(By.id("address_last_name"));
        WebElement firstAddress = driver.findElement(By.id("address_street_address"));
        WebElement secondAddress = driver.findElement(By.id("address_secondary_address"));
        WebElement city = driver.findElement(By.id("address_city"));
        WebElement stateSelect = driver.findElement(By.id("address_state"));
        WebElement zipCode = driver.findElement(By.id("address_zip_code"));
        WebElement countryUnitedStates = driver.findElement(By.id("address_country_us"));
        WebElement birthday = driver.findElement(By.cssSelector("[for='address_birthday']"));
        WebElement age = driver.findElement(By.id("address_age"));
        WebElement website = driver.findElement(By.id("address_website"));
        WebElement phoneNumber = driver.findElement(By.id("address_phone"));
        WebElement selectClimbing = driver.findElement(By.id("address_interest_climb"));
        WebElement selectDancing = driver.findElement(By.id("address_interest_dance"));
        WebElement note = driver.findElement(By.id("address_note"));
        WebElement createAddressButton = driver.findElement(By.cssSelector("[data-test='submit']"));

        firstNameInput.sendKeys("Fernando");
        lastNameInput.sendKeys("Torres");
        Bekle(1);

        firstAddress.sendKeys("Anfield Rd");
        secondAddress.sendKeys("Anfield");
        Bekle(1);

        city.sendKeys("Liverpool");
        Bekle(1);

        Select select = new Select(stateSelect);
        int size = select.getOptions().size();
        int randomIndex = (int) (Math.random() * size);
        select.selectByIndex(randomIndex);
        Bekle(1);

        zipCode.sendKeys("L4 0TH");
        Bekle(1);

        countryUnitedStates.click();
        Bekle(1);

        birthday.click();
        actions.sendKeys("20031984").perform();
        Bekle(1);

        age.sendKeys("36");
        Bekle(1);

        website.sendKeys("https://www.google.com/");
        Bekle(1);

        phoneNumber.sendKeys("8625747878");
        Bekle(1);

        selectClimbing.click();
        Bekle(1);

        selectDancing.click();
        Bekle(1);

        note.sendKeys("Never Back Down");
        createAddressButton.click();

        WebElement firstNameCheck = driver.findElement(By.cssSelector("[data-test='first_name']"));
        WebElement lastNameCheck = driver.findElement(By.cssSelector("[data-test='last_name']"));

        Assert.assertEquals("Fernando", firstNameCheck.getText());
        Assert.assertEquals("Torres", lastNameCheck.getText());

        Bekle(1);

        Addresses = driver.findElement(By.linkText("Addresses"));
        Addresses.click();
        Bekle(1);

        List<WebElement> editButton = driver.findElements(By.linkText("Edit"));
        editButton.get(editButton.size() - 1).click();
        Bekle(1);

        firstNameInput = driver.findElement(By.id("address_first_name"));
        lastNameInput = driver.findElement(By.id("address_last_name"));

        firstNameInput.clear();
        Bekle(1);
        firstNameInput.sendKeys("Peter");

        lastNameInput.clear();
        Bekle(1);
        lastNameInput.sendKeys("Crouch");

        WebElement updateAddressButton = driver.findElement(By.cssSelector("[data-test='submit']"));
        updateAddressButton.click();
        Bekle(1);

        firstNameCheck = driver.findElement(By.cssSelector("[data-test='first_name']"));
        lastNameCheck = driver.findElement(By.cssSelector("[data-test='last_name']"));

        Assert.assertEquals("Peter", firstNameCheck.getText());
        Assert.assertEquals("Crouch", lastNameCheck.getText());

        Addresses = driver.findElement(By.linkText("Addresses"));
        Addresses.click();
        Bekle(1);

        int listSize = driver.findElements(By.cssSelector(".table > tbody > tr")).size();

        List<WebElement> destroy = driver.findElements(By.linkText("Destroy"));
        destroy.get(destroy.size() - 1).click();

        driver.switchTo().alert().accept();

        int lastListSize = driver.findElements(By.cssSelector(".table > tbody > tr")).size();

        Assert.assertEquals(listSize - 1, lastListSize);

        BekleKapat();
    }
}
