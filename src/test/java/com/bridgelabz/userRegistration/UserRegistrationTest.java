package com.bridgelabz.userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    //TEST CASE FOR VALIDATE FIRST NAME
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validFirstName("Ash");
        Assert.assertEquals(true, result);
    }
    @Test
    //TEST CASE FOR VALIDATE LAST NAME
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validLasttName("Kum");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        //TEST CASE FOR VALIDATE EMAILID
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validEmailId("asas49@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        //TEST CASE FOR VALIDATE MOBILE NUMBER
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validMobileNumber("91 9123423829");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLengthPassword_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validLengthPassword("asdHdjsiw");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenUpperCase_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.atLeastOneUpperCase("asH1234");
        Assert.assertEquals(true,result);
    }

}



