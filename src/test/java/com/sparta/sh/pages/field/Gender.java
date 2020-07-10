package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gender {
    WebDriver webDriver;

    public Gender(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToCityTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[5]/label")).getText();
    }

    public void goToCityBox() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[5]/label")).click();
    }
}