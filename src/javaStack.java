import java.util.Scanner;
import java.util.Stack;

public class javaStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
			//Complete the code
			
			Stack<Character> stack = new Stack<Character>();

			int length=input.length();

			for(int i=0;i<length;i++){


				if(input.charAt(i)=='(' || input.charAt(i)=='{'|| input.charAt(i)=='['){

					stack.push(input.charAt(i));
				}else{
				char c=	stack.pop();
				
				if(input.charAt(i)==')' && c=='('){
					
					//np
				    }else  if(input.charAt(i)==']' && c=='['){
						
						//np
					    }else  if(input.charAt(i)=='}' && c=='{'){
							
							//np
						    }else{
				    	System.out.println("false");
				    	break;
				    }
				
                /*if(input.charAt(i)==']' && c=='['){
					
					//np
				    }else{
				    	System.out.println("false");
				    	break;
				    }
                
                 
                 if(input.charAt(i)=='}' && c=='{'){
					
					//np
				    }else{
				    	System.out.println("false");
				    	break;
				    }
				*/
				
				}
				

			}
			
			
			if(stack.isEmpty()){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		






		}
	}

}
