package bitwise;

public class fastest_multiplication {
	
	public static String karatsuba(String a,String b){
		
		
		
		
		//ac
		String s1=karatsuba(a.substring(0, a.length()/2), b.substring(0, b.length()/2));
		//bd
		String s2=karatsuba(a.substring(a.length()/2), b.substring(b.length()/2));
		
		//ad
		String s3=karatsuba(a.substring(0,a.length()/2), b.substring(b.length()/2));
		//bc
		String s4=karatsuba(a.substring(a.length()/2), b.substring(0,b.length()/2));
		
		//add these strings
	}
	
	
	
	
	
	public static int multi(int a,int b){
		int imul=0;
		for(int i=0;i<16;i++){
			if(((1<<i)&a)!=0){
				imul +=b<<i;
			}
		}
		return imul;
	}
	
	public static void main(String[] args) {
		int ans=multi(5,10);
		System.out.println(ans);
	}

}
