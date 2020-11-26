/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview;

/**
 *write a method to replace all spaces in a string with %20. YOu may assume that the string has sufficient space at the end to hold 
 * the additional characters. and that you are given true length of string
 * @author Pooja
 */
public class URLify {
    
    void replaceSpace(String s){
        StringBuilder newSentence = new StringBuilder();
        for(char c: s.trim().toCharArray()){
            if(c == ' '){
                newSentence.append("%20");
            }
            else{
                newSentence.append(c);
            }
        }
        System.out.println(newSentence.toString());
    }
    
    public String replaceSpaces(char[] chars, int len) {
		if (chars == null) {
			return "";
		}
		int spaceCount = 0;
		int index = 0;
		// first loop, count empty spaces
		for (int i = 0; i < len; i++) {
			if (chars[i] == ' ') {
				spaceCount++;
			}
		}
	    //why index = len + spaceCount *2; because in between trueLength, lets say there are 2 spaces, now we need 4 extra spaces at end as 2 spaces are alreday included 
	    //between truelength. As noticed, we need 3* extra space for every space but as seen, 1 space is already included between true length, now we need to add only 2wice for every 
	    //spaceCount
		index = len + spaceCount * 2 ;
		// second loop, replace spaces from the end
		for (int i = len - 1; i >= 0; i--) {
			if (chars[i] == ' ') {
				chars[index] = '0';
				chars[index - 1] = '2';
				chars[index - 2] = '%';
				index -= 3;
			} else {
				chars[index] = chars[i];
				index--;
			}
		}
		return new String(chars).trim();
	}
    
    public static void main(String args[]){
        URLify obj = new URLify();
        obj.replaceSpace("Mr John  Smith"); 
        
        char[] chars = "Mr John Smith       ".toCharArray();
	System.out.println(obj.replaceSpaces(chars, 13));
    }
}
