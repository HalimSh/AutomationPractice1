package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostCode {
    WebDriver webDriver;

    public PostCode(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToPostCodeTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[13]/div/label")).getText();
    }

    public String goToPostCodeBox() {
        WebElement goToPostCodeBox = webDriver.findElement(By.xpath("//*[@id=\"inputPostcode\"]"));
        goToPostCodeBox.sendKeys("N9 0HA");
        return goToPostCodeBox();
    }
}
