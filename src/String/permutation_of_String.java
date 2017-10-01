package String;

import java.util.ArrayList;
import java.util.Scanner;

public class permutation_of_String {
	
	
	//
	static ArrayList<String> list=new ArrayList<>();
	public static void perm(String str,int n,String str1){
		if(str.length()==n){
			list.add(str);
			return;
		}
		for(int i=0;i<n;i++){
			perm(str+str1.charAt(i),n,str1);
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			while(t>0){
				String str1=s.next();
				int l=str1.length();
				perm("",l,str1);
				
				for(String str:list){
					System.out.println(str);
				}
				
				t--;
			}
	}

}
