package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class A1_stock_span_problem {
	
	/*
	public static class node{
		int data;
		int index;
		public node(int data,int node){
			this.data=data;
			this.index=index;
		}
	}*/
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int n=s.nextInt();
			int prices[]=new int[n];
			for(int i=0;i<n;i++){
				prices[i]=s.nextInt();
			}
			
			Stack<Integer> stack=new Stack<>();
			
			int span[]=new int[n];
			
			for(int i=0;i<n;i++){
				boolean done=false;
				while(!stack.isEmpty() && !done){
					if(prices[i]>=prices[stack.peek()]){
						stack.pop();
					}else{
						done=true;
					}
				}
				
				int h=0;
				if(stack.isEmpty()){
					h=-1;
				}else{
					h=stack.peek();
				}
				
				span[i]=i-h;
				stack.push(i);
				
				
			}
			
			for(int i=0;i<n;i++){
				System.out.print(span[i]+" ");
			}
			
			
			
			t--;
		}
		
	}

}
