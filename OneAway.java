/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview;

/**
 *There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * @author Pooja
 */
public class OneAway {
    
    boolean checkOneAway(String p1, String p2){
        if(Math.abs(p1.length() - p2.length()) > 1)
            return false;
        
        String shortStr = "";
        String longStr = "";
        boolean lenEqual = false;
        if(p1.length() == p2.length()){
            lenEqual = true;
        }
        longStr = p1.length() > p2.length()?p1:p2;
        shortStr = p1.length() > p2.length() ? p2:p1;
        
        int count=0,i=0,j=0;
        
        while(i < shortStr.length() && j < longStr.length()){
            if(shortStr.charAt(i) != longStr.charAt(j)){
                if(count >=1){
                    return false;
                }
                count++;
                if(lenEqual)
                    i++; // only if len is equal and not matching, increase the index
            }
            else //matching
                i++;
            j++; //longer one index will increase regardless
              
        }
        //below is same code as while one but more readable 
//        while(i < shortStr.length() && j < longStr.length()){
//            if(count > 1)
//                return false;
//            else if(shortStr.charAt(i) == longStr.charAt(j)){
//                i++;
//                j++;
//            }
//            else if (lenEqual){
//                i++;
//                j++;
//                count++;
//            }
//            else{
//                j++;
//                count++;
//            }
//        }
//        
//        if(count > 1)
//            return false;
        return true;
    }
    
    
    public static void main(String args[]){
       OneAway obj = new OneAway();
       String[] s1 = {"pale","pales","pale","pale"};
       String[] s2 = {"ple","pale","bale","bake"};
       boolean returnValue;
       int i =0,j=0;
       while(i < s1.length && j < s2.length){
                returnValue = obj.checkOneAway(s1[i],s2[j]);
                System.out.println(s1[i] + " and " + s2[j] + " are " + (returnValue == true ? "one away" : "not one away"));
                i++;
                j++;
       }
    }
}
