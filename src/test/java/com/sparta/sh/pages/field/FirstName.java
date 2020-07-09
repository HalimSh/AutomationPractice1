package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.*;

public class FirstName {

    WebDriver webDriver;

    public FirstName(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToFirstNameTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[1]/div/label")).getText();
    }

    public String goToFirstNameBox() {
        WebElement goToFirstNameBox = webDriver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        goToFirstNameBox.sendKeys("Shariar");
        return goToFirstNameBox();
    }
}
