package com.sparta.sh.pages;


import com.sparta.sh.pages.field.Age;
import com.sparta.sh.pages.field.FirstName;
import com.sparta.sh.pages.field.LastName;
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
}

//First name, Last Name, Age, DOB, Gender, Degree, University, Address, Address 2, City, County,
//Postcode, Email, Skills, Phone, LinkedIn, CV, Streams, Agree, Rate
