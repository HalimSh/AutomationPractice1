package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressTwo {
    WebDriver webDriver;

    public AddressTwo(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToAddressTwoTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[9]/label")).getText();
    }

    public String goToAddressTwoBox() {
        WebElement goToAddressTwoBox = webDriver.findElement(By.xpath("//*[@id=\"inputAddress2\"]"));
        goToAddressTwoBox.sendKeys("Enfield");
        return goToAddressTwoBox();
    }
}
