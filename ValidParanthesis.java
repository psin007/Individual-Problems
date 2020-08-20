package interviewpractice;
import java.util.Stack;
public class ValidParanthesis {

	boolean testValid(String str) {
		if(str.length() < 1 )
			return true;
		Stack<Character> stack = new Stack<>();

		for(Character ch:str.toCharArray()) {
			if(ch == '{' || ch == '[' || ch == '(') 
				stack.push(ch);
			else if(!stack.isEmpty()){
				boolean match = matchParanthesis(stack.pop(),ch);
				if(!match) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		if(stack.isEmpty())
			return true;
		else 
			return false;
	}
	
	public boolean matchParanthesis(Character open, Character close) {
		if(open == '(' && close == ')')
			return true;
		else if(open == '{' && close == '}')
			return true;
		else if(open == '[' && close == ']')
			return true;
		else 
			return false;
	}
}


