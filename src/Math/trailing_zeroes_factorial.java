package Math;

import java.util.Scanner;

public class trailing_zeroes_factorial {
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			long divisor=5;
			long num=s.nextInt();
			long sum=0;
			while(divisor<=num){
				sum +=num/divisor;
				divisor=divisor*5;
//				System.out.println(sum);
//				System.out.println("divisor"+divisor);
				
			}
			
			System.out.println(sum);
			
			
			t--;
		}
	
	}

}
