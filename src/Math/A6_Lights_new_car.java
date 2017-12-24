package Math;

import java.util.Scanner;

public class A6_Lights_new_car {
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			String str1=s.next();
			String str2=s.next();
			
			long mod=1000000007;
			long x=convertToInt(str1,mod);
			long y=convertToInt(str2,mod);
			
			
			
			
			//now simple doing calculation using fast exponentiaition method
			
			long ans=power_fast(x, y,mod);
			
			System.out.println(ans);
			t--;
			
		}
	}

	private static long power_fast(long x, long y, long mod) {
		// TODO Auto-generated method stub
		//base case
		if(y==0){
			return 1;
		}
		
		long smallAns=power_fast(x,y/2,mod);
//		System.out.println("before::"+smallAns);
		smallAns %=mod;
//		System.out.println("after::"+smallAns);
		smallAns=(smallAns*smallAns)%mod;
		
		
		if(y%2==0){
			return smallAns;
		}
		return (x*smallAns)%mod;
	}

	private static long convertToInt(String str1,long m) {
		// TODO Auto-generated method stub
		long ans=0;
		for(int i=0;i<str1.length();i++){
			ans=(ans*10)%m+(str1.charAt(i)-'0');
			ans %=m;
		}
		return ans;
	}

}
