package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberUtil {


    /**
     * @param term
     * @return
     */
    public static boolean isValidMobileKey(String term) {
        Pattern pattern = Pattern.compile("^\\d{1,10}$");
        Matcher matcher = pattern.matcher(term);
        return matcher.matches();
    }
}
