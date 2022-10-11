package Gun11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilis.BaseStaticDriver;

public class deneme extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement firstNumberInput = driver.findElement(By.id("number1Field"));
        WebElement secondNumberInput = driver.findElement(By.id("number2Field"));
        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        WebElement answerInput = driver.findElement(By.id("numberAnswerField"));
        WebElement integerOnlyButton = driver.findElement(By.id("integerSelect"));
        Select operation = new Select(driver.findElement(By.id("selectOperationDropdown")));

        integerOnlyButton.click();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                operation.selectByIndex(i);

                int firstNumber = (int) (Math.random() * 100);
                int secondNumber = (int) (Math.random() * 100);

                String actualNumber = returnTotal(i,firstNumber,secondNumber);

                firstNumberInput.sendKeys(String.valueOf(firstNumber));
                secondNumberInput.sendKeys(String.valueOf(secondNumber));
                calculateButton.click();

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));

                System.out.println("Actual : " + actualNumber);
                System.out.println("Expected : " + answerInput.getAttribute("value"));

                Assert.assertEquals(actualNumber,answerInput.getAttribute("value"));

                firstNumberInput.clear();
                secondNumberInput.clear();


            }

        }

        BekleKapat();

    }

    public static String returnTotal(int type, int number1, int number2){

        String total = "";

        if (type == 0){
            total = String.valueOf(number1+number2);
        } else if (type == 1) {
            total = String.valueOf(number1-number2);
        }else if (type == 2) {
            total = String.valueOf(number1*number2);
        }else if (type == 3) {
            total = String.valueOf(number1/number2);
        }else {
            total = String.valueOf(number1) + number2;
        }
        return total;
    }
    }
