package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT = "//div[@class=\\\"_5k_5\\\"]/span/span";
    public static final String XPATH_DAY = XPATH_SELECT +"/select[1]";
    public static final String XPATH_MONTH = XPATH_SELECT  +"/select[2]";
    public static final String XPATH_YEAR = XPATH_SELECT  +"/select[3]";
    public static final String XPATH_WAIT_FOR = "//select[1]";


    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        while(!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("8");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByValue("2");

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(22);
    }
}
