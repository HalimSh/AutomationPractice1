package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Degree {
    WebDriver webDriver;

    public Degree(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToDegreeTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[7]/div/label")).getText();
    }

    public String goToDegreeBox() {
        WebElement goToDegreeBox = webDriver.findElement(By.xpath("/html/body/div/form/div[7]/div/input"));
        goToDegreeBox.sendKeys("Engineering");
        return goToDegreeBox();
    }
}
