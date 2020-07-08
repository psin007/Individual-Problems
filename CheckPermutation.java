/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview;

import java.util.HashMap;

/**given two strings, write a method to check if one is a permutation of the other
 * @author Pooja
 */
public class CheckPermutation {
    
    public boolean checkPerm(String s1, String s2){
        
        if(s1.length()!= s2.length())
            return false;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s1.toCharArray()){
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c,count+1);
            }
            else{
                map.put(c,1);
            }
        }
        
        //check second string
        for(char c: s2.toCharArray()){
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c,count-1);
                if(map.get(c) == 0){
                    map.remove(c);
                }
            }
            else{
                return false;
            }
        }
        if(map.size() == 0)
            return true;
        else
            return false;
    }
    
    public static void main(String args[]){
        CheckPermutation obj = new CheckPermutation();
        boolean returnValue;
        returnValue = obj.checkPerm("abcdefa","cdefaba");
        System.out.println(returnValue ? "Yes. Permutable":"No. Not Permutable");
    }
}
