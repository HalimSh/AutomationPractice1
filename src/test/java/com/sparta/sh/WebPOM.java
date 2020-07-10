package com.sparta.sh;

import com.sparta.sh.pages.HomePage;
import com.sparta.sh.pages.field.*;
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
    Degree degree = new Degree(webDriver);
    Address address = new Address(webDriver);
    AddressTwo addresstwo = new AddressTwo(webDriver);
    City city = new City(webDriver);
    PostCode postCode = new PostCode(webDriver);
    EmailAddress emailAddress = new EmailAddress(webDriver);

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

    @Test
    public void getDegreeTitle() {
        Degree degree = homePage.goToDegree();
        Assert.assertEquals("Degree *", degree.goToDegreeTitle());
    }

    @Test
    public void setDegreeBox() {
        Assert.assertEquals("Engineering", degree.goToDegreeBox());
    }

    @Test
    public void getAddressTitle() {
        Address address = homePage.goToAddress();
        Assert.assertEquals("Address *", address.goToAddressTitle());
    }

    @Test
    public void setAddressBox() {
        Assert.assertEquals("66 Barrowfield Close", address.goToAddressBox());
    }

    @Test
    public void getAddressTwoTitle() {
        AddressTwo addressTwo = homePage.goToAddressTwo();
        Assert.assertEquals("Address 2", addressTwo.goToAddressTwoTitle());
    }

    @Test
    public void setAddressTwoBox() {
        Assert.assertEquals("Enfield", addresstwo.goToAddressTwoBox());
    }

    @Test
    public void getCityTitle() {
        City city = homePage.goToCity();
        Assert.assertEquals("City *", city.goToCityTitle());
    }

    @Test
    public void setCityBox() {
        Assert.assertEquals("London", city.goToCityBox());
    }

    @Test
    public void getPostCodeTitle() {
        PostCode postCode = homePage.goToPostCode();
        Assert.assertEquals("Postcode *", postCode.goToPostCodeTitle();
    }

    @Test
    public void setPostCodeBox() {
        Assert.assertEquals("N9 0HA", postCode.goToPostCodeBox());
    }

    @Test
    public void getEmailAddressTitle() {
        EmailAddress emailAddress = homePage.goToEmailAddress();
        Assert.assertEquals("Email address *", emailAddress.goToEmailAddressTitle();
    }

    @Test
    public void setEmailAddressBox() {
        Assert.assertEquals("Halim197201@yahoo.com", emailAddress.goToEmailAddressBox());
    }


}
