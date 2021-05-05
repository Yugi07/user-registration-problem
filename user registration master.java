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
}
class  validusername{
  
  
    public static boolean isValidUsername(String name)
    {
  
      
        String regex = "^[A-Za-z]\\w{5,29}$";
  
      
        Pattern p = Pattern.compile(regex);
  

        if (name == null) {
            return false;
        }
  
        
        Matcher m = p.matcher(name);
  
        return m.matches();
    }
  
   
    public static void main(String[] args)
    {
  
        
        String str1 = "yugesh";
        System.out.println(isValidUsername(str1));
   }
}
class validusername{
     
public static boolean isValid(String s)
{
     
    
    Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
 

    Matcher m = p.matcher(s);
    return (m.find() && m.group().equals(s));

public static void main(String[] args)
{
    String s = "9750893423";
     
    if (isValid(s))
        System.out.println("Valid Number");    
    else
        System.out.println("Invalid Number");  
  }
}  