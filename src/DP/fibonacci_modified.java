package DP;

import java.math.BigInteger;
import java.util.Scanner;

public class fibonacci_modified {
	
	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s=new Scanner(System.in);
        BigInteger t1=BigInteger.valueOf(s.nextLong());
//        int t2=s.nextInt();
        BigInteger t2=BigInteger.valueOf(s.nextLong());
        int n=s.nextInt();
        
        BigInteger temp=BigInteger.valueOf(0);
        for(int i=3;i<=n;i++){
            temp=t1.add(t2.multiply(t2));
            t1=t2;
            t2=temp;
        }
        System.out.println(temp);
        
        
        
        
        
        
        
        
      
        
    }

}
