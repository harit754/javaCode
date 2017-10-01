package Recursion;

import java.util.Scanner;

public class recursiveDigitSum {
	
	public static String superDigit(String str){
		if(str.length()==1){
			return str;
		}
		int l=str.length();
		String str2="";
		int sum=0;
		for(int i=0;i<l;i++){
			sum=sum+str.charAt(i)-48;
		}
		str2=str2+sum;
		return superDigit(str2);
		
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String n=s.next();
		int k=s.nextInt();
		
		String str="";
		for(int i=0;i<k;i++){
			str=str+n;		
			}
		
		String ans=superDigit(str);
		System.out.println(ans);
		
	}
	

}
