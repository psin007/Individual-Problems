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
    
    String compressedString(String s){
       
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
    
    public static void main(String args[]){
        StringCompression obj = new StringCompression();
        String[] s = {"aabcccccaaa","abc"};
        for(String str: s){
            System.out.println(obj.compressedString(str));
        }
    }
}
