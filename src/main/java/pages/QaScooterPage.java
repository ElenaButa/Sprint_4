package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QaScooterPage {
    //Вопросы о важном
    //Кноки заказать вверху и внизу
    private WebDriver driver;

    public QaScooterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToQuestionTitle() {
        WebElement element = driver.findElement(questionTitle);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
    }


    private By questionTitle = By.xpath(".//div[contains(text(), 'Вопросы о важном')]");

    private By orderUpButton = By.xpath("(.//button[contains(text(), 'Заказать')])[1]");

    private By orderDownButton = By.xpath("(.//button[contains(text(), 'Заказать')])[2]");

    public OrderPage clickOrderUpButton() {
        driver.findElement(orderUpButton).click();
        return new OrderPage(driver);
    }

    public OrderPage clickOrderDownButton() {
        driver.findElement(orderDownButton).click();
        return new OrderPage(driver);
    }


    public String getTextPanel(By heading, By panel) {
        WebElement accordionHeading = driver.findElement(heading);
        accordionHeading.click();
        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(panel));
        return accordionPanel.getText();
    }
}