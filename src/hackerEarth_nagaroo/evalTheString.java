package hackerEarth_nagaroo;

import java.util.ArrayList;
import java.util.Scanner;

public class evalTheString {
	
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int t = s.nextInt()+10;
	        
	        while(t>0){
	        	String str=s.nextLine();
	        	
	        	ArrayList<Character> list=new ArrayList<>();
	        	int l=str.length();
	        	for(int i=0;i<l;i++){
	        		if(str.charAt(i)==' '){
	        			System.out.println("skip");
	        		}else{
	        			list.add(str.charAt(i));
	        		}
	        	}
	        	
	        	for(char c:list){
	        		System.out.println(c);
	        	}
	        	
	        	//divide
	        	while(list.contains('/')){
	        		int index=list.indexOf('/');
	        		int ans=0;
	        		if(list.get(index+1)=='0'){
	        			System.out.println("Division by zero encountered");
	        			return;
	        		}
	        		if(list.get(index+1)=='-'){
	        			 ans=(list.get(index-1)-48)/(list.get(index+2)-48);
	        			 list.remove(index+2);
	        			 list.remove(index+1);
		 	        		list.remove(index);
		 	        		list.remove(index-1);
		 	        		list.add(index-1, '-');
		 	        		list.add(index, (char)(ans+48));
		 	        		System.out.println("hi1");
	        		}else{
	        			 ans=(list.get(index-1)-48)/(list.get(index+1)-48);
	        			 list.remove(index+1);
	 	        		list.remove(index);
	 	        		list.remove(index-1);
	 	        		list.add(index-1, (char)(ans+48));
	 	        		System.out.println("hi2");
	        		}
	        		System.out.println(list.get(index-1));
	        		
	        		
	        	}
	        	while(list.contains('*')){
	        		int index=list.indexOf('*');
	        		int ans=0;
	        		if(list.get(index+1)=='-'){
	        			 ans=(list.get(index-1)-48)*(list.get(index+2)-48);
	        			 list.remove(index+2);
	        			 list.remove(index+1);
		 	        		list.remove(index);
		 	        		list.remove(index-1);
		 	        		list.add(index-1, '-');
		 	        		list.add(index, (char)(ans+48));
		 	        		System.out.println("hi1");
	        		}else{
	        			 ans=(list.get(index-1)-48)*(list.get(index+1)-48);
	        			 list.remove(index+1);
	 	        		list.remove(index);
	 	        		list.remove(index-1);
	 	        		list.add(index-1, (char)(ans+48));
	 	        		System.out.println("hi2");
	        		}
	        		System.out.println(list.get(index-1));
	        		
	        		
	        	}
	        	
	        	while(list.contains('+')){
	        		int index=list.indexOf('+');
	        		int ans=0;
	        		if(list.get(index+1)=='-'){
	        			 ans=(list.get(index-1)-48)-(list.get(index+2)-48);
	        			 list.remove(index+2);
	        			 list.remove(index+1);
		 	        		list.remove(index);
		 	        		list.remove(index-1);
		 	        		if(ans>0){
		 	        			list.add(index-1,(char)(ans+48));
		 	        		}else{
		 	        			list.add(index-1, '-');
			 	        		list.add(index, (char)(ans+48));
		 	        		}
		 	        		
		 	        		System.out.println("hi1");
	        		}else{
	        			 ans=(list.get(index-1)-48)+(list.get(index+1)-48);
	        			 list.remove(index+1);
	 	        		list.remove(index);
	 	        		list.remove(index-1);
	 	        		list.add(index-1, (char)(ans+48));
	 	        		System.out.println("hi2");
	        		}
	        		System.out.println(list.get(index-1));
	        		
	        		
	        	}
	        	
	        	while(list.contains('-')){
	        		int index=list.indexOf('-');
	        		int ans=0;
	        		if(list.get(index+1)=='-'){
	        			 ans=(list.get(index-1)-48)+(list.get(index+2)-48);
	        			 list.remove(index+2);
	        			 list.remove(index+1);
		 	        		list.remove(index);
		 	        		list.remove(index-1);
		 	        		list.add(index-1, (char)(ans+48));
//		 	        		list.add(index, );
		 	        		System.out.println("hi1");
	        		}else{
	        			 ans=(list.get(index-1)-48)-(list.get(index+1)-48);
	        			 list.remove(index+1);
	 	        		list.remove(index);
	 	        		list.remove(index-1);
	 	        		if(ans>0){
	 	        			list.add(index-1, (char)(ans+48));
	 	        		}else{
	 	        			list.add(index-1, '-');
	 	        			list.add(index, (char)(ans+48));
	 	        		}
	 	        		
	 	        		System.out.println("hi2");
	        		}
	        		System.out.println(list.get(index-1));
	        		
	        		
	        	}
//	        	System.out.println(list.get(0));
	        	for(char c:list){
	        		System.out.println(c);
	        	}
	        	
	        	t--;
	        }
	        
	        
	}

}
