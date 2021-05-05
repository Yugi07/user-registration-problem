package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
  
class validemail
{
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-z]{1}[a-zA-Z0-9.+_-]+@[a-zA-Z0-9.]+[a-zA-z]{2,3}$";
                            
                            
                           
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
  