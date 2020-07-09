package com.sparta.sh;

import com.sparta.sh.pages.HomePage;
import com.sparta.sh.pages.field.Age;
import com.sparta.sh.pages.field.FirstName;
import com.sparta.sh.pages.field.LastName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPOM {

    WebDriver webDriver = new ChromeDriver();
    HomePage homePage = new HomePage(webDriver);
    FirstName firstName = new FirstName(webDriver);
    LastName lastName = new LastName(webDriver);
    Age age = new Age(webDriver);

    @Test
    public void openPage() {
    homePage.goToHomePage();
    }

    @Test
    public void getFirstNameTitle() {
    FirstName firstName = homePage.goToFirstName();
    Assert.assertEquals("First Name *", firstName.goToFirstNameTitle());
}

@Test
    public void setFirstNameBox() {
    Assert.assertEquals("Shariar", firstName.goToFirstNameBox());
}

    @Test
    public void getLastNameTitle() {
        LastName lastName = homePage.goToLastName();
        Assert.assertEquals("Last Name *", lastName.goToLastNameTitle());
    }

    @Test
    public void setLastNameBox() {
        Assert.assertEquals("Halim", lastName.goToLastNameBox());
    }

    @Test
    public void getAgeTitle() {
        Age age = homePage.goToAge();
        Assert.assertEquals("Age *", age.goToAgeTitle());
    }

    @Test
    public void setAgeBox() {
        Assert.assertEquals(22, age.goToAgeBox());
    }

}
