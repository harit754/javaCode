package Recursion;

import java.util.Scanner;

public class findPosition {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    
	    while(t>0){
	        int n=s.nextInt();
	        int i=0;
	        while(Math.pow(2,i)<=n){
	            i++;
	            
	            
	        }
	        System.out.println((int)Math.pow(2, i-1));
	        
	        
	        
	        
	        t--;
	    }
	    
		//code
	}

}
