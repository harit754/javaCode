package Array;

import java.util.Scanner;

public class multiplyTwoPoly {
	
	public static int[] multiply(int[] a1,int[] a2){
		int l1=a1.length;
		int l2=a2.length;
		int l3=(l1-1)+(l2-1)+1;
		int [] ans=new int[l3];
		
		for(int i=0;i<l3;i++){
			for(int j=0;j<l2;j++){
				int k=i-j;
				if(k<l1 && k>=0){
					ans[i]+=a2[j]*a1[k];
				}
				
			}
		}
//		System.out.println(ans[0]);
		for(int i=0;i<l3;i++){
			System.out.println(ans[i]);
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int l1=s.nextInt();
			int l2=s.nextInt();
			
			int [] a1=new int[l1];
			int [] a2=new int[l2];
			
			for(int i=0;i<l1;i++){
				a1[i]=s.nextInt();
			}
			for(int i=0;i<l2;i++){
				a2[i]=s.nextInt();
			}
			int [] ans=multiply(a1,a2);
			for(int a:ans){
				System.out.print(a);
				System.out.print(" ");
			
		}
			
			t--;
		}
	}

}
