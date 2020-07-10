package com.sparta.sh.pages.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailAddress {
    WebDriver webDriver;

    public EmailAddress(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String goToEmailAddressTitle() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[14]/div/label")).getText();
    }

    public String goToEmailAddressBox() {
        WebElement goToEmailAddressBox = webDriver.findElement(By.xpath("//*[@id=\"inputemailaddress\"]"));
        goToEmailAddressBox.sendKeys("halim197201@yahoo.com");
        return goToEmailAddressBox();
    }
}
