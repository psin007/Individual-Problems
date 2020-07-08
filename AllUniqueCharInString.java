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
    
    public static void main(String args[]){
        AllUniqueCharInString obj = new AllUniqueCharInString();
        boolean returnValue = obj.checkUniqueness("abcdefg");
        String result = (returnValue == true) ? "All unique":"repeating characters";
        System.out.println(result);
        
                
    } 
}
