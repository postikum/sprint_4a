package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class OrderPage {
    private final WebDriver driver;
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public final By buttonNext = By.xpath("/html/body/div/div/div[2]/div[3]/button");
    public final By firstNameField = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input");
    public final By lastNameField = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input");
    public final By addressField = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");
    public final By phoneField = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input");
    public final By metroStationField = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");
    public final By parkKulturyStation = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[13]/button");
    public final By DateField = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div/input");
    public final By rentalPeriodField = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]");
    public final By rentalPeriodChoiceOneDay = By.xpath(".//div[@class='Dropdown-menu']/div[1]");
    public final By rentalPeriodChoiceThreeDays = By.xpath(".//div[@class='Dropdown-menu']/div[3]");
    public final By emptyField = By.xpath("/html/body/div/div");
    public final By colourChoiceBlack = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[1]/input");
    public final By colourChoiceGrey = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[2]/input");
    public final By commentField = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/input");
    public final By finalOrderButton = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");
    //public final By confirmOrderButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    public final By confirmOrderButton = By.xpath(".//div[contains(@class,'Order_Buttons')]/button[text()='Да']");



    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }

    public void nameInput(String name) {
        driver.findElement(firstNameField).sendKeys(name);
    }

    public void surNameInput(String surname) {
        driver.findElement(lastNameField).sendKeys(surname);
    }

    public void addressInput(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void phoneInput(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }
    public void metroStationClick() {
        driver.findElement(metroStationField).click();
    }
    public void metroStationChange() {
        driver.findElement(parkKulturyStation).click();
    }
    public void dateInput(String date) {
        driver.findElement(DateField).sendKeys(date);
    }
    public void closeDateInput() {
        driver.findElement(emptyField).click();
    }
    public void rentalPeriodClick() {
        driver.findElement(rentalPeriodField).click();
    }
    public void rentalPeriodChoiceOneDay() {
        driver.findElement(rentalPeriodChoiceOneDay).click();
    }
    public void rentalPeriodChoiceThreeDays() {
        driver.findElement(rentalPeriodChoiceThreeDays).click();
    }
    public void colourChoiceBlack() {
        driver.findElement(colourChoiceBlack).click();
    }
    public void colourChoiceGrey() {
        driver.findElement(colourChoiceGrey).click();
    }
    public void commentInput(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }
    public void finalOrderBtnClick() {
        driver.findElement(finalOrderButton).click();
    }
    public void confirmOrderBtnClick() {
        driver.findElement(confirmOrderButton).click();
    }
}

