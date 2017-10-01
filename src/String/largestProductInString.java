package String;

//Find the greatest product of K consecutive digits in the N digit number.
public class largestProductInString {
	
	public static int find(int n,int k,String num){
		int max=0;
		
		for(int i=0;i<=n-k;i++ ){
			int sum=1;
			for(int j=i;j<i+k;j++){
				sum=sum*((int)num.charAt(j)-48);
				System.out.println(sum);
			}
			if(sum>max){
				max=sum;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		String str="12345";
		int ans=find(5,2,str);
		System.out.println(ans);
	
	}

}
