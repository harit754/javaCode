package Array;
import java.util.Scanner;

public class uniqueNumber_1 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int [] arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=s.nextInt();
		}
		
		int checker=0;
		for(int i=0;i<N;i++){
//			arr[i]=s.nextInt();
			checker =checker | (1<<arr[i]);
		}
		
		for(int i=0;i<N;i++){
//			arr[i]=s.nextInt();
			checker=checker^arr[i];
		}
		for(int i=0;i<N;i++){
//			arr[i]=s.nextInt();
			if((arr[i] & checker)==0){
				System.out.println(arr[i]);
			}
		}
		
	}

}
