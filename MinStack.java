package interviewpractice;

import java.util.Stack;

public class MinStack {

	Stack<Integer> stack;
	Stack<Integer> minStack;
	
	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}
	
	public void push(int x) {
		int min = x;
		if(!minStack.isEmpty() && min > minStack.peek()) {
			min = minStack.peek();
		}
		stack.push(x);
		minStack.push(min);
	}
	
	public void pop() {
		stack.pop();
		minStack.pop();
	}
	
	public int top() {
		return stack.peek();
	}
	
	public int getMin() {
		return minStack.peek();
	}
	
}
