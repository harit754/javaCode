package Array;

import java.util.Scanner;


//question may be not understandabe
//link::https://www.hackerrank.com/contests/projecteuler/challenges/euler018/copy-from/1302456483
public class maximumPathSum {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
             int l=s.nextInt();
            int [][] arr=new int[l][l];
//            System.out.println(arr[0][2]);
            for(int i=0;i<l;i++){
                for(int j=0;j<=i;j++){
//                	System.out.println("hi");
                    arr[i][j]=s.nextInt();
                }
            }
            
            int sum=0;
            int j=0;
            int max=0;
            sum=sum+arr[0][0];
            for(int i=1;i<l;i++){
                if(arr[i][j]>arr[i][j+1]){
                    
                    sum=sum+arr[i][j];
            }else{
                    sum=sum+arr[i][j+1];
                    j++;
                }
        }
            System.out.println(sum);
            t--;
    }
}

}
