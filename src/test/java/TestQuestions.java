import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import pages.MainPage;
import static org.junit.Assert.assertEquals;


public class TestQuestions {
    private WebDriver driver;
    private MainPage mainPage;


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");


    }


    @Test
    public void matchAnswerAndQuestionOne() {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.scrollToImportantQuestionHeader();
        mainPage.clickQuestion(mainPage.questionOne);
        String actualAnswer = driver.findElement(mainPage.answerOne).getText();
        String expectedAnswer = MainPage.answersForFAQ[0];
        assertEquals(expectedAnswer, actualAnswer);

    }


    @Test
    public void matchAnswerAndQuestionTwo() {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.scrollToImportantQuestionHeader();
        mainPage.clickQuestion(mainPage.questionTwo);
        String actualAnswer = driver.findElement(mainPage.answerTwo).getText();
        String expectedAnswer = MainPage.answersForFAQ[1];
        assertEquals(expectedAnswer, actualAnswer);

    }

    @Test
    public void matchAnswerAndQuestionThree() {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.scrollToImportantQuestionHeader();
        mainPage.clickQuestion(mainPage.questionThree);
        String actualAnswer = driver.findElement(mainPage.answerThree).getText();
        String expectedAnswer = MainPage.answersForFAQ[2];
        assertEquals(expectedAnswer, actualAnswer);

    }

    @Test
    public void matchAnswerAndQuestionFour() {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.scrollToImportantQuestionHeader();
        mainPage.clickQuestion(mainPage.questionFour);
        String actualAnswer = driver.findElement(mainPage.answerFour).getText();
        String expectedAnswer = MainPage.answersForFAQ[3];
        assertEquals(expectedAnswer, actualAnswer);

    }

    @Test
    public void matchAnswerAndQuestionFive() {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.scrollToImportantQuestionHeader();
        mainPage.clickQuestion(mainPage.questionFive);
        String actualAnswer = driver.findElement(mainPage.answerFive).getText();
        String expectedAnswer = MainPage.answersForFAQ[4];
        assertEquals(expectedAnswer, actualAnswer);

    }

    @Test
    public void matchAnswerAndQuestionSix() {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.scrollToImportantQuestionHeader();
        mainPage.clickQuestion(mainPage.questionSix);
        String actualAnswer = driver.findElement(mainPage.answerSix).getText();
        String expectedAnswer = MainPage.answersForFAQ[5];
        assertEquals(expectedAnswer, actualAnswer);

    }


    @Test
    public void matchAnswerAndQuestionSeven() {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.scrollToImportantQuestionHeader();
        mainPage.clickQuestion(mainPage.questionSeven);
        String actualAnswer = driver.findElement(mainPage.answerSeven).getText();
        String expectedAnswer = MainPage.answersForFAQ[6];
        assertEquals(expectedAnswer, actualAnswer);

    }

    @Test
    public void matchAnswerAndQuestionEight() {
        mainPage.closeCookieAlert(mainPage.cookieAlert);
        mainPage.scrollToImportantQuestionHeader();
        mainPage.clickQuestion(mainPage.questionEight);
        String actualAnswer = driver.findElement(mainPage.answerEight).getText();
        String expectedAnswer = MainPage.answersForFAQ[7];
        assertEquals(expectedAnswer, actualAnswer);

    }


    @After
    public void tearDown() {
        driver.quit();
    }

}
