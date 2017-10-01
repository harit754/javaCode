package round_428;

import java.util.Scanner;

//import javax.swing.plaf.synth.SynthSeparatorUI;

public class prob1 {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int k=s.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		
		
//		int max=8;
		int count=0;  //days counter
		int sum=0;    //total candies given
		int rem=0;   //rem candies after giving to her brother
		for(int i=0;i<n;i++){
			if(sum<k){
				if(arr[i]+rem<8){
					sum +=arr[i]+rem;
					rem=0;
//					System.out.println(arr[i]+rem);
					count++;
				}else{
					sum +=8;
					count++;
					rem=arr[i]+rem-8;
//					System.out.println(8);
				} 
				
			}else{
				break;
			}
			
		}
		if(sum<k){
			System.out.println(-1);
		}else{
			System.out.println(count);
		}
		
		
	}

}
