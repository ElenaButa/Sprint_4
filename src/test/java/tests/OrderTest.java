package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.*;
import pages.testData.OrderData;
import pages.testData.User;

public class OrderTest extends BaseTest {
    //Заказ с верхней кнопки заказать для Миши и Оли
    //Заказ с нижней кнопки заказать  для Миши и Оли

    @Test
    public void fullOrderTestOnUpButtonDataForMisha() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        OrderPage orderPage = qaScooterPage.clickOrderUpButton();
        User user = new User("Миша", "Иванов", "Сургут", "Сокольники", "12345678901");
        OrderData orderData = new OrderData("27.12.2022", "трое суток", "заказ");
        orderTestData(orderPage, user, orderData);
    }

    @Test
    public void fullOrderTestOnDownButtonDataForMisha() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        OrderPage orderPage = qaScooterPage.clickOrderDownButton();
        User user = new User("Миша", "Иванов", "Сургут", "Сокольники", "12345678901");
        OrderData orderData = new OrderData("27.12.2022", "трое суток", "заказ");
        orderTestData(orderPage, user, orderData);
    }

    @Test
    public void fullOrderTestOnUpButtonDataForOlya() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        OrderPage orderPage = qaScooterPage.clickOrderUpButton();
        User user = new User("Оля", "Иванова", "Москва", "Черкизовская", "12345678901");
        OrderData orderData = new OrderData("28.12.2022", "двое суток", "жду");
        orderTestData(orderPage, user, orderData);
    }

    @Test
    public void fullOrderTestOnDownButtonDataForOlya() {
        QaScooterPage qaScooterPage = new QaScooterPage(driver);
        qaScooterPage.scrollToQuestionTitle();
        OrderPage orderPage = qaScooterPage.clickOrderDownButton();
        User user = new User("Оля", "Иванова", "Москва", "Черкизовская", "12345678901");
        OrderData orderData = new OrderData("28.12.2022", "двое суток", "жду");
        orderTestData(orderPage, user, orderData);
    }

    private void orderTestData(OrderPage orderPage, User user, OrderData orderData) {
        orderPage.fillOrderPage(user.name, user.secondName, user.address, user.station, user.phone);
        OrderRentPage orderRentPage = orderPage.clickNextButton();
        orderRentPage.fillOrderRentPage(orderData.date, orderData.period, orderData.comment);
        OrderBox orderBox = orderRentPage.clickOrderButton();
        SuccessBox successBox = orderBox.clickYesButton();
        Assert.assertEquals("Заказ оформлен", successBox.getTitle());
    }

 }