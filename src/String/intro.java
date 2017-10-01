package String;

import java.util.Scanner;

public class intro {
	
	//given samll character string
	public static boolean lexicographicalCheck(String str1,String str2){
		if(str1.length()<=str2.length()){
			int l=str1.length();
			for(int i=0;i<l;i++){
				if(str1.charAt(i)>str2.charAt(i)){
					return true;
				}else if(str1.charAt(i)<str2.charAt(i)){
					return false;
				}
			}
		}else{
		
			int l=str2.length();
			for(int i=0;i<l;i++){
				if(str1.charAt(i)>str2.charAt(i)){
					return true;
				}else if(str1.charAt(i)<str2.charAt(i)){
					return false;
				}
			}
		}
		
		return false;
		
	}
	//given small character string
	public static String capitalize(String str){
		String str1="";
    int ans  = (int)str.charAt(0) -32	;	
    str1=str1+(char)ans;
    str1=str1+str.substring(1);
    return str1;
		
	}

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        /* Enter your code here. Print output to STDOUT. */
        int l1=A.length();
        int l2=B.length();
        int sum=l1+l2;
        System.out.println(sum);
        
       boolean ans= lexicographicalCheck(A,B);
       if(ans){
    	   System.out.println("Yes");
       }else{
    	   System.out.println("No");
       }
       
      System.out.print(capitalize(A));
      System.out.println(" "+capitalize(B));
        
        
        
    }}
