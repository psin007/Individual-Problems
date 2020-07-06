/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview;

/**
 *program checks if all characters are unique in given string
 * @author Pooja
 */
public class AllUniqueCharInString {
    
    
    public boolean checkUniqueness (String s){
        return true;
    }
    
    public static void main(String args[]){
        AllUniqueCharInString obj = new AllUniqueCharInString();
        boolean returnValue = obj.checkUniqueness("Pooja");
        String result = (returnValue = true) ? "All unique":"repeating characters";
        System.out.println(result);
                
    } 
}
