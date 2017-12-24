package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class A4_number_in_power {
	
	
	
	
	public static void main(String[] args) {
		boolean a= isPower(1024000000);
		System.out.println(a);
	}
	
	
	 public static boolean isPower(int n) {
		 ArrayList<Integer> list=primeFactors(n);
		 int l=list.size();
		 System.out.println(list);
		 /*System.out.println("l:"+l);
		 int p=1;  //product of all factors
		 for(int i=0;i<l;i++){
			 System.out.println(p);
			 p=p*list.get(i);
		 }
		 System.out.println("value of n "+n +" p :"+p);
		 n=n/p;
		 System.out.println(n);
		 System.out.println("be");
		 while(n>0){
			 n=n/p;
			 System.out.println("hi");
			 if(n==1){
				 return true;
			 }
		 }
		 return false;*/
		 
		 
		 HashMap<Integer, Integer> map=new HashMap<>();
		 for(int i=0;i<l;i++){
			 if(map.containsKey(list.get(i))){
				 int val=map.get(list.get(i));
				 map.put(list.get(i), val+1);
			 }else{
				 map.put(list.get(i), 1);
			 }
		 }
		 System.out.println(map);
//		 int arr[]=new int[5];
//		 arr[0]=0;
		 int check=0;
		 for(int a:map.values()){
			 if(check==0){
				 check=a;
				 if(check==1){
					 return false;
				 }
			 }else if(check==1){
				 return false;
				 
			 }else{
				 if(a!=check){
					 return false;
				 }
			 }
			 }
		 
		 return true;
		 
	 }
	
	    // A function to print all prime factors
	    // of a given number n
	    public static ArrayList<Integer> primeFactors(int n)
	    {
	        // Print the number of 2s that divide n
	    	ArrayList<Integer> list=new ArrayList<>();
	        while (n%2==0)
	        {
//	            System.out.print(2 + " ");
	        	list.add(2);
	            n /= 2;
	        }
	 
	        // n must be odd at this point.  So we can
	        // skip one element (Note i = i +2)
	        for (int i = 3; i <= Math.sqrt(n); i+= 2)
	        {
	            // While i divides n, print i and divide n
	            while (n%i == 0)
	            {
//	                System.out.print(i + " ");
	            	list.add(i);
	                n /= i;
	            }
	        }
	 
	        // This condition is to handle the case whien
	        // n is a prime number greater than 2
	        if (n > 2){
//	            System.out.print(n);
	        	list.add(n);
	        }
	        
	        return list;
	    }



}
