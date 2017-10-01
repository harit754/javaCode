package Array;

import java.util.Scanner;

public class latticePaths {


	static int sum1=0;
	static int sum2=0;
	
	public static int count(int[][] arr,int i,int j,int n,int m){

		if(i==n && j==m){
			System.out.println(sum1+sum2);
			return 1;
		}
		if(j<2){
			System.out.println("col");
			sum1=sum1+ count(arr,i,j+1,n,m);
			
		}
		if(i<2){
			System.out.println("row");
			sum2=sum2+ count(arr,i+1,j,n,m);
		}

		return sum1;
	}








	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int m=s.nextInt();
		int[][] arr=new int[n+1][m+1];
		System.out.println(arr[1][2]);
				arr[n][m]=10;
				int ans=count(arr,0,0,n,m);
				System.out.println(ans);


	}

}
