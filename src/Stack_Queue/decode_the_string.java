package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class decode_the_string {





	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			String str=s.next();

			Stack<Character> stack=new Stack<>();
			
			String res="";
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==']'){
					while(!stack.isEmpty() && stack.peek()!='['){
						res=stack.pop()+res;
					}
					stack.pop();
					int freq=0;
					if(!stack.isEmpty()){
					freq=stack.pop()-'0';
//					System.out.println(freq);
					}
					
//					System.out.println(res);
					String temp=res;
					for(int j=1;j<freq;j++){
						res =res+temp;
//						System.out.println("rep::"+res);
					}
					
				}else{
					stack.push(str.charAt(i));
				}
			}


			System.out.println(res);


			t--;	
		}
	}

}
