/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview;

import java.util.HashMap;

/**
 *
 * @author Pooja
 */
public class PalindromePermutation {
    
    boolean checkPalindromePerm(String phrase){
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: phrase.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
                if((map.get(c))%2 == 0){
                    map.remove(c);
                }
            }
            else{
                map.put(c,1);
            }
        }
        if(map.size() > 1)
            return false;
        else
            return true;
    }
    
    public static void main(String args[]){
        PalindromePermutation obj = new PalindromePermutation();
        boolean returnValue;
        String[] phrase = {"tactcoa","civil","malayalam","aab","acb"};
        for(String s: phrase){
            returnValue = obj.checkPalindromePerm(s);
            System.out.println(s + " is " + (returnValue == true ? "a palindrome permutation":" not a palindrome permuation"));
        }
    }
}
