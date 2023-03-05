import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MainPage;
import pages.OrderPage;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class TestOrder {

    private WebDriver driver;
    private MainPage mainPage;
    private OrderPage orderPage;


    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String date;
    private final String comment;

    public TestOrder(String name, String surname, String address, String phone, String date, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.date = date;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Серёжа", "Мамкинпрограммист", "г.Москва ул.Цоя д.19 кв.19", "+79104873802", "09.03.2023", "И побыстрее там"},
                {"Ваня", "Шпала", "г.Москва ул.Пушкина д.21 кв.7", "+79102738032", "21.03.2023", "Не торопитесь"},
        };
    }

    @Before
    public void setUp () {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        orderPage = new OrderPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");

    }

    @Test
    public void upOrderTwoSteps () {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.clickUpOrderButton();
        orderPage.nameInput(name);
        orderPage.surNameInput(surname);
        orderPage.addressInput(address);
        orderPage.phoneInput(phone);
        orderPage.metroStationClick();
        orderPage.metroStationChange();
        orderPage.clickButtonNext();
        orderPage.dateInput(date);
        orderPage.closeDateInput();
        orderPage.rentalPeriodClick();
        orderPage.rentalPeriodChoiceThreeDays();
        orderPage.colourChoiceBlack();
        orderPage.commentInput(comment);
        orderPage.finalOrderBtnClick();
        orderPage.confirmOrderBtnClick();
    }

    @Test
    public void downOrderButtonFullSteps () {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.clickDownOrderButton();
        orderPage.nameInput(name);
        orderPage.surNameInput(surname);
        orderPage.addressInput(address);
        orderPage.phoneInput(phone);
        orderPage.metroStationClick();
        orderPage.metroStationChange();
        orderPage.clickButtonNext();
        orderPage.dateInput(date);
        orderPage.closeDateInput();
        orderPage.rentalPeriodClick();
        orderPage.rentalPeriodChoiceOneDay();
        orderPage.colourChoiceGrey();
        orderPage.commentInput(comment);
        orderPage.finalOrderBtnClick();
        orderPage.confirmOrderBtnClick();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
