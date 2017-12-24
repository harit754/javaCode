package String;

import java.util.Scanner;

public class count_substrings_codechef {
	
	
	
	
	public static int counter=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
//		 count(str);
		int n= count_ones(str);
		System.out.println((n*(n+1))/2);
		
	
	}

	
	private static void count(String str) {
		if(str.length()==1){
			return;
		}
		// TODO Auto-generated method stub
		int l=str.length();
		int i=0;
//		int m=0;
		int j=l-1;
//		int n=l-1;
		
			if(str.charAt(i)=='1' && str.charAt(j)=='1'){
				counter++;
				System.out.println(counter);
				System.out.println(str +"-->"+i+","+j);
				count(str.substring(i+1,j+1));
				count(str.substring(i, j));
				
			}else if(str.charAt(i)=='0' && str.charAt(j)=='0'){
				count(str.substring(i+1, j));
			}else if(str.charAt(j)=='0'){
				count(str.substring(i, j));
			}else if(str.charAt(i)=='0'){
				count(str.substring(i+1, j+1));
			}
		
			
		}
	
	public static int count_ones(String str){
		int l=str.length();
		int ans=0;
		for(int i=0;i<l;i++){
			if(str.charAt(i)=='1'){
				ans++;
			}
		}
		return ans;
		
	}
		
	

}
