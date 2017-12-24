package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class bracket_balancing {
	
	//self algo
	//1. if string is odd return -1
	//2. if their is opening bracket we put it into the stack
	//3. when we encounter closing bracket we pop element from the stack
	//4. if stack is empty while popping then we make reversals
	//5. finally size of stack gives opening brackets /2 ---->is the answer
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			
			String str=s.next();
			if(str.length()%2==0){
			Stack<Character> stack=new Stack<>();
			
			int reversals=0;
			
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='{'){
					stack.push('{');
					
				}else{
					if(stack.isEmpty()){
						reversals++;
						stack.push('{');
					}else{
						stack.pop();
					}
				}
			}
			
			reversals +=stack.size()/2;
			System.out.println(reversals);
			}else{
				System.out.println(-1);
			}
			t--;
			
		}
		
		
	}

}
