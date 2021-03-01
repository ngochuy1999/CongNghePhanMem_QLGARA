/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class checkEmail {
        public static boolean testEmail(String email)
    {
        String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailtest=Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher=emailtest.matcher(email);
        return matcher.find();

    }
}
