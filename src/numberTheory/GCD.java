package numberTheory;

import java.util.Scanner;

public class GCD
{
	//by division method reference:http://www.guideforschool.com/2469030-java-program-to-find-the-gcd-of-two-numbers-division-method/
	public static int gcd(int n1,int n2){
		//remainder
		int r;

		while(n2 != 0)
		{
			r = n1 % n2;
			n1 = n2;
			n2 = r;
		}
		return n1;
	}
	public static void main(String args[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First no : ");
		int n1=sc.nextInt();
		System.out.print("Enter the Second no : ");
		int n2=sc.nextInt();
		
		int ans=gcd(n1,n2);
		System.out.println(ans);
		
		
		sc.close();
	}
}
