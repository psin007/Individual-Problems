/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview;

/**
 *
 * @author Pooja
 */
public class StringCompression {
    
    String compressedStringVPoor(String s){
       
        int count = 1,index = 0, i = 0;
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
            sb.append(s.charAt(i));
            while(flag && i+1 < s.length()){
                if(s.charAt(i) == s.charAt(i+1)){
                    count++;
                    i++;
                }
                else{
                    flag = false;
                }
            }
            
            sb.append(count);
            count = 1;
            flag = true;
            i++;
        }
        String newS = sb.toString();
        return s.length() > newS.length() ? newS :s;
        
    }
    
    String compressedString(String s){
       
        int count = 0,index = 0, i = 0;
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for(i = 0; i < s.length(); i++){
              count ++;
              if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                  sb.append(s.charAt(i));
                  sb.append(count);
                  count = 0;
              }
        }
        String newS = sb.toString();
        return s.length() > newS.length() ? newS :s;
        
    }
    
    //Below function is particularly useful when there are not various repeating characters
    //Also we can create string builder with length which is better but 2 for loops here rather than one in above case
    String compressStringWithTradeoff(String str){
        int compressedLength = finalCompressedLength(str);
        if(str.length() < compressedLength)
            return str;
        StringBuilder sb = new StringBuilder(compressedLength);
        int countConsecutive = 0;
        for(int i = 0; i < str.length(); i++){
            countConsecutive++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return sb.toString();
    }   
    
    int finalCompressedLength(String str){
        int finalLength = 0;
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
            //if(i+1 > str.length() || str.charAt(i) != str.charAt(i+1)){
                finalLength += 1 + String.valueOf(count).length();
                count = 0;
            }
        }
        return finalLength;
    }
    
    public static void main(String args[]){
        StringCompression obj = new StringCompression();
        String[] s = {"aabcccccaaa","abc"};
        for(String str: s){
            System.out.println(obj.compressStringWithTradeoff(str));
        }
    }
}
