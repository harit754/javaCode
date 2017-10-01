import java.util.Arrays;
import java.util.Scanner;

public class leftRotation {
	
	public static void rotate1(int[] arr){
		int l=arr.length;
		int temp=arr[0];
		
//		Arrays.spliterator(arr, 1, l);
//		Arrays.spl
		for(int i=0;i<l-1;i++){
			arr[i]=arr[i+1];
		}
		
		
		arr[l-1]=temp;
	/*	for(int i=0;i<l;i++){
//			arr[i]=s.nextInt();
			System.out.println(arr[i]);
		}
		System.out.println();*/
//		return arr;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int d=s.nextInt();
		
		int[] arr=new int[l];
		for(int i=0;i<l;i++){
			arr[i]=s.nextInt();
		}
		
		while(d>0){
			rotate1(arr);
			d--;
		}
		
		
		for(int i=0;i<l;i++){
//			arr[i]=s.nextInt();
			System.out.println(arr[i]);
		}
		
		
	}

}
