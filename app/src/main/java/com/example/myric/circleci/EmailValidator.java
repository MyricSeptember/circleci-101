package com.example.myric.circleci;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by MSeptember on 2018/01/23.
 */

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
