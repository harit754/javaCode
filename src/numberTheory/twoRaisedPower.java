package numberTheory;

import java.math.BigInteger;
import java.util.Scanner;
//running 
//using BigInteger

public class twoRaisedPower {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		BigInteger num=new BigInteger("2");
		num=num.pow(n);
		//		long ans=(long)Math.pow(2, 1000);
		System.out.println(num);
		BigInteger sum=BigInteger.valueOf(0);
		
		
//int i=2;
		while(num.compareTo(BigInteger.ZERO)==1){
			sum=sum.add(num.mod(BigInteger.valueOf(10)));
		num=	num.divide(BigInteger.valueOf(10));
		System.out.println("num"+" "+num);
			System.out.println(sum);
//			i--;
		}
		System.out.println(sum);
		 
//i--;
		s.close();
	}
}
