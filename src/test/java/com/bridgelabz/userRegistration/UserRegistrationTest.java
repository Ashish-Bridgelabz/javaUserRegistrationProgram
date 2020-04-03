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
}


