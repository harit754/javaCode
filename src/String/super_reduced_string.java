package String;

import java.util.Scanner;

public class super_reduced_string {
	
	public static String reduce1(String str){
		
		int l=str.length();
		if(l==0 || l==1){
			return str;
		}
		for(int i=0;i<l-2;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				
				return reduce1(str.substring(0, i)+str.substring(i+2));
			}
		}
		if(str.charAt(l-2)==str.charAt(l-1)){
			return str.substring(0, l-2);
		}
		return str;
	}

   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = reduce1(s);
        System.out.println(result);
    }}
