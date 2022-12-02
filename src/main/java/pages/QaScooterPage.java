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
    WebElement accordionHeading;

    public QaScooterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By questionTitle = By.xpath(".//div[contains(text(), 'Вопросы о важном')]");

    private By orderUpButton = By.xpath("(.//button[contains(text(), 'Заказать')])[1]");

    private By orderDownButton = By.xpath("(.//button[contains(text(), 'Заказать')])[2]");

    // block questions about important
    // position #0
    private By questionsAboutImportantHeading0 = By.id("accordion__heading-0");
    private By questionsAboutImportantPanel0 = By.id("accordion__panel-0");

    // position #1
    private By questionsAboutImportantHeading1 = By.id("accordion__heading-1");
    private By questionsAboutImportantPanel1 = By.id("accordion__panel-1");

    // position #2
    private By questionsAboutImportantHeading2 = By.id("accordion__heading-2");
    private By questionsAboutImportantPanel2 = By.id("accordion__panel-2");

    // position #3
    private By questionsAboutImportantHeading3 = By.id("accordion__heading-3");
    private By questionsAboutImportantPanel3 = By.id("accordion__panel-3");

    // position #4
    private By questionsAboutImportantHeading4 = By.id("accordion__heading-4");
    private By questionsAboutImportantPanel4 = By.id("accordion__panel-4");

    // position #5
    private By questionsAboutImportantHeading5 = By.id("accordion__heading-5");
    private By questionsAboutImportantPanel5 = By.id("accordion__panel-5");

    // position #6
    private By questionsAboutImportantHeading6 = By.id("accordion__heading-6");
    private By questionsAboutImportantPanel6 = By.id("accordion__panel-6");

    // position #7
    private By questionsAboutImportantHeading7 = By.id("accordion__heading-7");
    private By questionsAboutImportantPanel7 = By.id("accordion__panel-7");

    public void scrollToQuestionTitle() {
        WebElement element = driver.findElement(questionTitle);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
    }

    public OrderPage clickOrderUpButton() {
        driver.findElement(orderUpButton).click();
        return new OrderPage(driver);
    }

    public OrderPage clickOrderDownButton() {
        driver.findElement(orderDownButton).click();
        return new OrderPage(driver);
    }

//    public String getTextPanel(By heading, By panel) {
//        WebElement accordionHeading = driver.findElement(heading);
//        accordionHeading.click();
//        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(panel));
//        return accordionPanel.getText();
//    }


    public String getTextPanel0() {
        accordionHeading = driver.findElement(questionsAboutImportantHeading0);
        accordionHeading.click();
        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(questionsAboutImportantPanel0));
        return accordionPanel.getText();
    }

    public String getTextPanel1() {
        accordionHeading = driver.findElement(questionsAboutImportantHeading1);
        accordionHeading.click();
        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(questionsAboutImportantPanel1));
        return accordionPanel.getText();
    }

    public String getTextPanel2() {
        accordionHeading = driver.findElement(questionsAboutImportantHeading2);
        accordionHeading.click();
        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(questionsAboutImportantPanel2));
        return accordionPanel.getText();
    }

    public String getTextPanel3() {
        accordionHeading = driver.findElement(questionsAboutImportantHeading3);
        accordionHeading.click();
        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(questionsAboutImportantPanel3));
        return accordionPanel.getText();
    }

    public String getTextPanel4() {
        accordionHeading = driver.findElement(questionsAboutImportantHeading4);
        accordionHeading.click();
        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(questionsAboutImportantPanel4));
        return accordionPanel.getText();
    }

    public String getTextPanel5() {
        accordionHeading = driver.findElement(questionsAboutImportantHeading5);
        accordionHeading.click();
        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(questionsAboutImportantPanel5));
        return accordionPanel.getText();
    }

    public String getTextPanel6() {
        accordionHeading = driver.findElement(questionsAboutImportantHeading6);
        accordionHeading.click();
        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(questionsAboutImportantPanel6));
        return accordionPanel.getText();
    }

    public String getTextPanel7() {
        accordionHeading = driver.findElement(questionsAboutImportantHeading7);
        accordionHeading.click();
        WebElement accordionPanel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(questionsAboutImportantPanel7));
        return accordionPanel.getText();
    }

}