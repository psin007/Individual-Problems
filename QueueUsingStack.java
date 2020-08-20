package interviewpractice;

public class QueueUsingStack {
		
	Stack s1 ;
	Stack s2;
	
	QueueUsingStack(){
		s1 = new Stack();
		s2 = new Stack();
	}

	public void enqueue(int x) {
		while(s1!=null) {
			s2.push(s1.pop());
		}
		s1.push(x);
		while(s2!=null) {
			s1.push(s2.pop());
		}
		System.out.println(x + "enqueued");
	}
	int deQueue() 
	{ 
		if (s1.isEmpty()) 
		{ 
			System.out.println("Q is Empty"); 
			System.exit(0); 
		} 
		int x = s1.peek(); 
		s1.pop(); 
		return x; 
	} 
	public static void main(String[] args) 
	{
		QueueUsingStack q = new QueueUsingStack();
		q.enqueue(2);
		//q.enqueue(3);
		//q.enqueue(4);
		//System.out.println(q.deQueue());
	}
}