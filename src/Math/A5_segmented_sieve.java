package Math;

import java.util.ArrayList;
import java.util.Scanner;

public class A5_segmented_sieve {
	

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			long a=s.nextInt();
			long b=s.nextInt();
			ArrayList<Long> ans=segmented_seive(a,b);
			System.out.println(ans);
			t--;
		}
	}
	
	
	
	
	public static ArrayList<Integer> sieve(int n) {
	    
	    int sieve[]=new int[n+1];
	    for(int i=0;i<=n;i++){
	    	sieve[i]=1;  //initailly all are primes ,say
	    }
	    sieve[0]=0;  //not prime
	    sieve[1]=0;
	    for(int i=2;i<Math.sqrt(n);i++){
	    	if(sieve[i]==1){
	    		for(int j=2;i*j<=n;j++){
	    			sieve[i*j]=0;  //multiple of i's are not prime
	    		}
	    	}
	    }
	    ArrayList<Integer> ans=new ArrayList<>();
	    
	    for(int i=2;i<=n;i++){
	    	if(sieve[i]==1){
	    		ans.add(i);
	    	}
	    	
	    }
	    
	    return ans;
	    
	}
	
	
	
	//segmented sieve for large numbers
	public static ArrayList<Long> segmented_seive(long a,long b){
		//range is small
		int range=(int) Math.abs(b-a);
		//this array sieve conatins original numbers in range
		int sieve2[]=new int[range+2];
		for(int i=1;i<=range;i++){
			sieve2[i]=1;   //initially all are primes
			
		}
		
		//list contains prime number till squareroot of b
		ArrayList<Integer> list=sieve((int)Math.sqrt(b));
		
		//same process as we have done in sieve 
		//see notebook for revision
		int l=list.size();
		 for(int i=0;i<l;i++){
			 int prime=list.get(i);
			 int index=1;
			 for(long j=a;j<=b;j++){
				 if(j%prime==0){
					 sieve2[index]=0;
					
				 }
				 index++;
			 }
			 
		 }
		    ArrayList<Long> ans=new ArrayList<>();
		    long j=a;
		    for(int i=1;i<=range;i++){
		    	if(sieve2[i]==1){
		    		ans.add(j);
		    	}
		    	j++;
		    	
		    }
		    
		    return ans;
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
