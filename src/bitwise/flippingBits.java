package bitwise;

import java.util.Scanner;
//running

public class flippingBits {
	
	public static int flipsCount(int x,int y){
		int a=x^y;
		String str=Integer.toBinaryString(a);
		int count=0;
		int l=str.length();
		for(int i=0;i<l;i++){
			if(str.charAt(i)=='1'){
				count++;
			}
		}
		return count;
		
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(flipsCount(1,2));
		 Scanner s=new Scanner(System.in);
	}

}
