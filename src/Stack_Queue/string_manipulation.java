package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class string_manipulation {
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int n=s.nextInt();
			String arr[]=new String[n];
			
			Stack<String> stack=new Stack<>();
			for(int i=0;i<n;i++){
				arr[i]=s.next();
				
					if(!stack.isEmpty() && stack.peek().equals(arr[i])){
						stack.pop();
					}else{
						stack.push(arr[i]);
					}
				
				
			}
			
			System.out.println(stack.size());
			t--;
		}
	}

}
