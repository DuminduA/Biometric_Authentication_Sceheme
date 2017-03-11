/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometric.authentication;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dumindu
 */
public class Cipher {

    public Cipher() {
    }
    public static void main(String[] args) {
        
        Cipher c =new Cipher();
        System.out.println(c.encrypt("1.0"));
        System.out.println(c.decrypt(c.encrypt("1.0")));
    }
    
    public String encrypt(String element){
        
        // encrpt method
        //take the number and add 256 to it and then  the number of places to 
        //decimal point from the beginning will add the end and take the hexadecimal of it to store..
         
        List<String> element_list = new ArrayList<String>();
        element_list = Arrays.asList(element.split("\\."));
        int lengthToDecimalPoint = element_list.get(0).length();
        
        for(String x:element_list){
        System.out.print(x);
        }
        
        int number = Integer.parseInt(element_list.get(0)+ element_list.get(1)+
                Integer.toString(lengthToDecimalPoint));
        
        
        
       return Integer.toHexString(number);
    }
    
    public String decrypt(String element){
    
    
            int number = Integer.parseInt(element,16);
            
            String conv_number = String.valueOf(number);
            List<String> element_list = new ArrayList<>(Arrays.asList(conv_number.split("")));
           
        
        int lengthToDecimalPoint = Integer.parseInt(element_list.get(conv_number.length()-1));
        //System.out.println(lengthToDecimalPoint + "  "+element_list.size());
        element_list.add(lengthToDecimalPoint, ".");
        
        element_list.remove(conv_number.length());
        
        String decrypted="";
        for(String s: element_list){
        
            decrypted = decrypted + s;
        
        }
    
    //System.out.println(decrypted);
    return decrypted;
    
    
    
    
    }
    
    
}
