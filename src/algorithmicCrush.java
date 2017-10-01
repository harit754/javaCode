import java.util.Scanner;
import java.util.Stack;

public class algorithmicCrush {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int t=s.nextInt();
		long [] arr=new long[N];
		for(int i=0;i<N;i++){
			arr[i]=0;
		}
		long max=0;
		while(t>0){
			int start=s.nextInt();
			int end =s.nextInt();
			int k=s.nextInt();
			
			for(int i=start-1;i<end;i++){
				arr[i]=arr[i]+k;
				 if(arr[i]>max){
					   max=arr[i];
				   }
			}
			t--;
		}
		for(int i=0;i<N;i++){
		   if(arr[i]>max){
			   max=arr[i];
		   }
		}
		System.out.println(max);
	}
}



























