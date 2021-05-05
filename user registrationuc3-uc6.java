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
  
    
    public static void main(String[] args)
    {
        String email = "yugeshece2018@gmail.com";
        if (isValid(email))
            System.out.print("Yes");
        else
            System.out.print("No");
 }   
}
public class validpassword {
 
    public static void main(String args[]) {
        String password1 = "yugesh07@";
 
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        boolean validPassword = isValidPassword(password1,regex);
        System.out.println("Java2blog@ is valid password:" +validPassword);
 }
 public static boolean isValidPassword(String password,String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }