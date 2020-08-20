/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Pooja
 */
public class InterviewPractice {
    //reverse string
   public String reverseString(String s){
       if(s == null || s.isEmpty()){
           return s;
       }
       //break string into char array
       char[] chars = s.toCharArray();
       int i = 0;
       int j = s.length()-1; 
       while(i<j){
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
            i++;
            j--;
        }
       return  new String(chars) ;
   }
    public void reverseStringWithBuffer(String s){
        System.out.println("The original string is: "+s);
        String reverseStr = new StringBuffer(s).reverse().toString();
        System.out.println("The new reversed string is :"+reverseStr);
   }
    
   public void reverseRecursively(String str){
       if(str.length() < 2)
           System.out.println(str); 
       else{
            System.out.print(str.charAt(str.length()-1));
             reverseRecursively(str.substring(0,str.length()-1));  
       }
   }
   
   //check palindrome
   public boolean ifPalin(String s){
       if (s.equals(reverseString(s))){
              return true;
       }
       return false;
   }
   
   //Duplicate characters in a String
   public void printDuplicates(String s){
       char[] charArray = s.toCharArray();
       //count duplicates
       Map<Character,Integer> charMap = new HashMap<Character,Integer>();
       for(char c : charArray){
           if(charMap.containsKey(c)){
               charMap.put(c,charMap.get(c)+1);
           }
           else{
               charMap.put(c,1);
           } 
       }
       //Now print out duplicates
       System.out.println("List of duplicate characters in "+s);
       Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
       for(Map.Entry<Character,Integer> entry:entrySet){
           if(entry.getValue() > 1){
               System.out.println(entry.getKey() + " : " + entry.getValue());
           }
       }
   }
   
   //Anagram
   //Make HashMAp of map and compare 
   
   public boolean ifAnagram(String s1, String s2){
   
       boolean anag = false;
       char[] char1 = s1.toCharArray();
       char[] char2 = s2.toCharArray();
       Map<Character,Integer> charMap1 = new HashMap<>();
       Map<Character,Integer> charMap2 = new HashMap<>();
       for(char c: char1){
           if(charMap1.containsKey(c)){
               charMap1.put(c, charMap1.get(c)+1);
           }
           else{
               charMap1.put(c,1);
           }
       }
       
        for(char c: char2){
           if(charMap2.containsKey(c)){
               charMap2.put(c, charMap2.get(c)+1);
           }
           else{
               charMap2.put(c,1);
           }
       }
        
        //Now match if every key and value are same or not
        Set<Map.Entry<Character,Integer>> mapEntrySet1 = charMap1.entrySet();
        Set<Map.Entry<Character,Integer>> mapEntrySet2 = charMap2.entrySet();
        
        int sumKey1 = 0;
        int sumKey2 = 0;
        
        int sumVal1 = 0;
        int sumVal2 = 0;
        for(Map.Entry<Character,Integer> entry: mapEntrySet1){
                sumKey1 += entry.getKey();
                sumVal1 += entry.getValue();
        }
        
         for(Map.Entry<Character,Integer> entry: mapEntrySet2){
                sumKey2 += entry.getKey();
                sumVal2 += entry.getValue();
        }

        if(sumKey1 == sumKey2 && sumVal1 ==sumVal2){
            anag = true;
        }
       
       return anag;
   }
   
   //to print all permutations of a string
   public void printPermutations(String s){
   
   }
   //to check if input only has digits
   public boolean isNumeric(String s){
       boolean num = true;
       for(char c: s.toCharArray()){
           if(!Character.isDigit(c)){
               num = false;
           }
       }
       String replaced = s.replace("1", "9");
       System.out.println();
       return num;
   }
  
   
    public static void main(String[] args) {
        InterviewPractice interviewPractice = new InterviewPractice();
        System.out.println(interviewPractice.reverseString("malayalam is nice"));
       // System.out.println(interviewPractice.ifPalin("Pizza"));
       // interviewPractice.printDuplicates("Programming");
       // System.out.println(interviewPractice.ifAnagram("pooja", "Pooja"));
       // interviewPractice.printPermutations("123");
       interviewPractice.reverseRecursively("Hello");
       System.out.println(interviewPractice.isNumeric("123"));
       
    }
    
}
