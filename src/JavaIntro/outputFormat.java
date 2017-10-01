package JavaIntro;

import java.util.Scanner;

public class outputFormat {
	
	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             //Complete this line
             int length=s1.length();
             System.out.print(s1);
             for(int j=0;j<15-length;j++){
            	 System.out.print(" ");
             }
             
             int no=0;
            int x1=x;
             while(x>0){
            	 no++;
            	 x=x/10;
             }
             for(int k=0;k<3-no;k++){
            	 System.out.print("0");
             }
             
             System.out.println(x1);
         }
         System.out.println("================================");

 }

}
