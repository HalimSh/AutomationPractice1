package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Address {
    WebDriver webDriver;

    public Address(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToAddressTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[9]/label")).getText();
    }

    public String goToAddressBox() {
        WebElement goToAddressBox = webDriver.findElement(By.xpath("//*[@id=\"inputAddress\"]"));
        goToAddressBox.sendKeys("66 Barrowfield Close");
        return goToAddressBox();
    }
}
