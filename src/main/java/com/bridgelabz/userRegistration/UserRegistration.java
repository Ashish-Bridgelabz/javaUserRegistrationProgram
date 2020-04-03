package com.bridgelabz.userRegistration;

import java.util.Scanner;
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

    public boolean validLasttName(String lastName) {

        //PATTERN FOR VALID LAST NAME
        String patternValidName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternValidName);
        Matcher m = p.matcher(lastName);
        return m.matches();
    }

    public boolean validEmailId(String emialId) {
        //PATTERN FOR VALID EMAILID
        String patternValidEmailId = "^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$";
        Pattern p = Pattern.compile(patternValidEmailId);
        Matcher m = p.matcher(emialId);
        return m.matches();
    }
}
