package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DateOfBirth {

    WebDriver webDriver;

    public DateOfBirth(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToDateOfBirthTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[4]/div/label")).getText();
    }

    public String goToDateOfBirthBox() {
        WebElement goToDateOfBirthBox = webDriver.findElement(By.xpath("/html/body/div/form/div[4]/div/input"));
        goToDateOfBirthBox.sendKeys("21/12/1997");
        return goToDateOfBirthBox();
    }
}
