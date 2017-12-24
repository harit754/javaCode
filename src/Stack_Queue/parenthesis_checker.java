package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis_checker {





	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			String str=s.next();

			Stack<Character> stack=new Stack<>();
			boolean bal=true;
			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				if(c=='(' || c=='{' || c=='['){
					stack.push(c);
				}else{
					if(!stack.isEmpty()){
						if(c==')' && stack.peek()=='('){
							stack.pop();
						}else if(c=='}' && stack.peek()=='{'){
							stack.pop();
						}else if(c==']' && stack.peek()=='['){
							stack.pop();
						}else{
							System.out.println("not balanced");
							bal=false;
							break;
						}
					}else{
						System.out.println("not balanced");
						bal=false;
						break;
					}
				}
			}
			if(bal && stack.isEmpty()){
				System.out.println("balanced");
			}else if(bal){
				System.out.println("not balanced");
			}

			t--;
		}
	}

}
