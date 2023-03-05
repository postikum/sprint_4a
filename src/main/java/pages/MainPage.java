package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class MainPage {
    private final WebDriver driver;

    //questions

    public static final String [] answersForFAQ = {
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    };

    public final By cookieAlert = By.xpath("//*[@id='rcc-confirm-button']");

    //Локатор Вопроса 1 "Сколько это стоит? И как оплатить?"
    public final By questionOne = By.xpath(".//div[@id='accordion__heading-0']");

    //Локатор Вопроса 2 "Хочу сразу несколько самокатов! Так можно?"
    public final By questionTwo = By.xpath(".//div[@id='accordion__heading-1']");

    //Локатор Вопроса 3 "Как рассчитывается время аренды?"
    public final By questionThree = By.xpath(".//div[@id='accordion__heading-2']");

    //Локатор Вопроса 4 "Можно ли заказать самокат прямо на сегодня?"
    public final By questionFour = By.xpath(".//div[@id='accordion__heading-3']");

    //Локатор Вопроса 5 "Можно ли продлить заказ или вернуть самокат раньше?"
    public final By questionFive = By.xpath(".//div[@id='accordion__heading-4']");

    //Локатор Вопроса 6 "Вы привозите зарядку вместе с самокатом?"
    public final By questionSix = By.xpath(".//div[@id='accordion__heading-5']");

    //Локатор Вопроса 7 "Можно ли отменить заказ?"
    public final By questionSeven = By.xpath(".//div[@id='accordion__heading-6']");

    //Локатор Вопроса 8 "Я жизу за МКАДом, привезёте?"
    public final By questionEight = By.xpath(".//div[@id='accordion__heading-7']");

    //Локатор ответа на вопрос 1
    public final By answerOne = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]/p");

    //Локатор ответа на вопрос 2
    public final By answerTwo = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/div[2]/p");

    //Локатор ответа на вопрос 3
    public final By answerThree = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]/div[2]/p");

    //Локатор ответа на вопрос 4
    public final By answerFour = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]/div[2]/p");

    //Локатор ответа на вопрос 5
    public final By answerFive = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]/div[2]/p");

    //Локатор ответа на вопрос 6
    public final By answerSix = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]/div[2]/p");

    //Локатор ответа на вопрос 7
    public final By answerSeven = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]/div[2]/p");

    //Локатор ответа на вопрос 8
    public final By answerEight = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]/div[2]/p");

    private final By upOrderButton = By.className("Button_Button__ra12g");
    private final By downOrderButton = By.xpath("//button[contains(text(), 'Заказать')][last()]");



    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickQuestion(By questionLocator) {
        driver.findElement(questionLocator).click();
    }

    public void scrollToImportantQuestionHeader(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void closeCookieAlert(By questionLocator) {
        driver.findElement(questionLocator).click();
    }

    public void clickUpOrderButton() {
        driver.findElement(upOrderButton).click();
    }

    public void clickDownOrderButton() {
        driver.findElement(downOrderButton).click();
    }
}
