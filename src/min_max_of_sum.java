import java.util.Scanner;

public class min_max_of_sum {
	 public static void main(String[] args) {
		 
//	        System.out.println(min);
		 
	        Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        for(int arr_i=0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        long min=Long.parseUnsignedLong("4000000000");
//	        System.out.println(min);
	        long max=0;
	        long sum=0;
	        for(int i=0;i<5;i++){
	        	sum+=arr[i];
	        }
	        
	        for(int i=0;i<5;i++){
//	        	sum+=arr[i];
	        	long temp=sum-arr[i];
	        	if(temp<min){
	        		min=temp;
	        	}
	        	if(temp>max){
	        		max=temp;
	        	}
	        }
	        
	        System.out.print(min);
	        System.out.print(" ");
	        System.out.println(max);
	    }

}
