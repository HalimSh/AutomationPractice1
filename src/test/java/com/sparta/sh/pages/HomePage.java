package com.sparta.sh.pages;


import com.sparta.sh.pages.field.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void goToHomePage() {
        webDriver.manage().window().maximize();
        webDriver.get("http://localhost:9292/");
    }


    public FirstName goToFirstName() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[1]/div/label")).getText();
        return new FirstName(webDriver);
    }

    public LastName goToLastName() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[2]/div/label")).getText();
        return new LastName(webDriver);
    }

    public Age goToAge() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[3]/div/label")).getText();
        return new Age(webDriver);
    }

    public Degree goToDegree() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[7]/div/label")).getText();
        return new Degree(webDriver);
    }

    public Address goToAddress() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[9]/div/label")).getText();
        return new Address(webDriver);
    }

    public AddressTwo goToAddressTwo() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[10]/div/label")).getText();
        return new AddressTwo(webDriver);
    }

    public City goToCity() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[11]/div/label")).getText();
        return new City(webDriver);
    }

    public PostCode goToPostCode() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[13]/div/label")).getText();
        return new PostCode(webDriver);
    }

    public EmailAddress goToEmailAddress() {
        webDriver.findElement(By.xpath("/html/body/div/form/div[14]/div/label")).getText();
        return new EmailAddress(webDriver);
    }
}

//Skills, Phone, LinkedIn, CV, Streams, Agree, Rate
