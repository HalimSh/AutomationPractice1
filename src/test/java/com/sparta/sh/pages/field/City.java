package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class City {
    WebDriver webDriver;

    public City(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToCityTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[11]/label")).getText();
    }

    public String goToCityBox() {
        WebElement goToCityBox = webDriver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
        goToCityBox.sendKeys("London");
        return goToCityBox();
    }
}
