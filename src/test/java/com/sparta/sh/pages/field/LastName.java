package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LastName {

    WebDriver webDriver;

    public LastName(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToLastNameTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[2]/div/label")).getText();
    }

    public String goToLastNameBox() {
        WebElement goToLastNameBox = webDriver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        goToLastNameBox.sendKeys("Halim");
        return goToLastNameBox();
    }
}
