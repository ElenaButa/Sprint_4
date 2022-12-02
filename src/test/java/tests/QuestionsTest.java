package tests;

import pages.QaScooterPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class QuestionsTest extends BaseTest {
    //Вопросы о важном на главной странице

    @Test
    public void questionAboutPayment() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                qaScooterPage.getTextPanel0());
    }

    @Test
    public void questionOfQuantity() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься " +
                        "с друзьями, можете просто сделать несколько заказов — один за другим.",
                qaScooterPage.getTextPanel1());
    }

    @Test
    public void questionAboutRentalTime() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в " +
                        "течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                qaScooterPage.getTextPanel2());
    }

    @Test
    public void questionAboutOrderingToday() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                qaScooterPage.getTextPanel3());
    }

    @Test
    public void questionAboutLeaseExtension() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку " +
                        "по красивому номеру 1010.",
                qaScooterPage.getTextPanel4());
    }

    @Test
    public void questionAboutCharging() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток " +
                        "— даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                qaScooterPage.getTextPanel5());
    }

    @Test
    public void questionAboutOrderCancellation() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки " +
                        "тоже не попросим. Все же свои.",
                qaScooterPage.getTextPanel6());
    }

    @Test
    public void questionAboutLocation() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                qaScooterPage.getTextPanel7());
    }
}