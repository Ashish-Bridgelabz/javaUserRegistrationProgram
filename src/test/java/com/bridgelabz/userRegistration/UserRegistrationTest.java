package com.bridgelabz.userRegistration;

import org.junit.Assert;
import org.junit.Test;

//TEST CASE FOR VALIDATE FIRST NAME
public class UserRegistrationTest {
    @Test
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
    //TEST CASE FOR VALIDATE EMAILID
    public void givenEmailId_WhenProper_ShouldReturnTrue() {

        UserRegistration validator = new UserRegistration();
        boolean result = validator.validEmailId("asas49@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    //TEST CASE FOR VALIDATE MOBILE NUMBER
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {

        UserRegistration validator = new UserRegistration();
        boolean result = validator.validMobileNumber("91 9123423829");
        Assert.assertEquals(true, result);
    }

    @Test
    //TEST CASE FOR MINIMUM 8 CHARACTERS
    public void givenLengthPassword_WhenProper_ShouldReturnTrue() {

        UserRegistration validator = new UserRegistration();
        boolean result = validator.validLengthPassword("asdHdjsiw");
        Assert.assertEquals(true, result);
    }

    @Test
    //TEST CASE FOR ATLIST 1 UPPER CASE
    public void givenUpperCase_WhenProper_ShouldReturnTrue() {

        UserRegistration validator = new UserRegistration();
        boolean result = validator.atLeastOneUpperCase("asHIshbridge");
        Assert.assertEquals(true, result);
    }

    @Test
    //TEST CASE FOR ATLIST 1 NUMERICE VALUE
    public void givenNumericValue_WhenProper_ShouldReturnTrue() {

        UserRegistration validator = new UserRegistration();
        boolean result = validator.atleastOneNumericValue("Ashish123");
        Assert.assertEquals(true, result);
    }

    @Test
    // TEST CASE FOR VALIDDATING PASSWORD FOR EXACTLY ONE SPECIAL CHARACTERT
    public void givenSpecialCharacter_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.exactlyOneSpecialCharacter("rahulRaj5@rahul");
        Assert.assertEquals(true,result);
    }
}


