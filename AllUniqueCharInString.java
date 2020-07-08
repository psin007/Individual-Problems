/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview;

import java.util.HashMap;

/**
 *program checks if all characters are unique in given string
 * @author Pooja
 */
public class AllUniqueCharInString {
    
    //my solution
    public boolean checkUniqueness (String s){
       HashMap<Character,Integer> hash = new HashMap<>();
       for( char c: s.toCharArray()){
           if(hash.containsKey(c)){
            return false;
           }
           else{
               hash.put(c,1);
           }
       }
        return true;
    }
    
    //book solution #1
    boolean isUniqueChars(String str){
        
        if(str.length() > 128){//un extended ascii string set
            return false;
        }
        boolean[] char_set = new boolean[128];
            for(int i  = 0; i < str.length(); i++){
                int val = str.charAt(i);
                if(char_set[val]){
                    return false;
                }
                char_set[val] = true;
            }
        
        return true;
    }
    
    
    
    public static void main(String args[]){
        AllUniqueCharInString obj = new AllUniqueCharInString();
        boolean returnValue;
        // returnValue = obj.checkUniqueness("abcdefg");
        returnValue = obj.isUniqueChars("abcdegc");
        String result = (returnValue == true) ? "All unique":"repeating characters";
        System.out.println(result);
        
                
    } 
}
