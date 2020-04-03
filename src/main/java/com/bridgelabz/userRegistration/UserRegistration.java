package com.bridgelabz.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validFirstName(String firstName) {
        //PATTERN FOR VALID FIRST NAME
        String patternValidName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternValidName);
        Matcher m = p.matcher(firstName);
        return m.matches();
    }
}