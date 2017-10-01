package bitwise;


//running
public class lonelyInteger {
	 private static int lonelyInt(int[] arr) {
		 int l=arr.length;
		 
		 for(int i=0;i<l;i++){
			 int count=0;
			 for(int j=0;j<l;j++){
				/* int a=arr[i];
				 int b=arr[j];*/
				int check= arr[i]^arr[j];
				 if(check==0){
					 count++;
				 }
			 }
			 if(count==1){
				 return arr[i];
			 }
			 
		 }
		 
		 return 0;
	    }
	 
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
		 int[] arr={1,4,9,2,4,1,2};
		 int ans=lonelyInt(arr);
		 System.out.println(ans);
		
		 
	}

}
