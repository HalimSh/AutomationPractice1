package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Age {

    WebDriver webDriver;

    public Age(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToAgeTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[3]/div/label")).getText();
    }

    public int goToAgeBox() {
        WebElement goToAgeBox = webDriver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        goToAgeBox.sendKeys("22");
        return goToAgeBox();
    }
}
