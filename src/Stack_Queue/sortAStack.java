package Stack_Queue;
import java.util.Stack;

//ans comes in decreasing order and we want in increasing order
public class sortAStack {


	public static void sortStack(Stack<Integer> stack){
		Stack<Integer> s1=new Stack<>();
		
		// Write your code here	
		
int l=stack.size();

for(int j=0;j<l;j++){
		while(stack.size()>1){
			int a1=stack.pop();
			int a2=stack.pop();
			if(a1>a2){
				s1.push(a1);
				stack.push(a2);

			}else{
				s1.push(a2);
				stack.push(a1);

			}
		}
		
		s1.push(stack.pop());
		for(int i=0;i<l;i++){
			stack.push(s1.pop());
		}
		
}























	}
	
	public static void main(String[] args) throws Exception{
		
		
		Stack<Integer> stack=new Stack<>();
		stack.push(5000);
		stack.push(10210);
		stack.push(4);
		stack.push(10);
		stack.push(0);
		
		sortStack(stack);
		
		System.out.println(stack.pop());
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
