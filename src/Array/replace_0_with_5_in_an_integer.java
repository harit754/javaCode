package Array;

import java.util.ArrayList;

public class replace_0_with_5_in_an_integer {
	
	public static void convertFive(int n){
	    String str=""+n;
//	    int l=str.length();
	    
	  String str1=  str.replace('0', '5');
	    System.out.println(str1);
//add code here.
}
	
	
	
	public static void main(String[] args) {
		convertFive(5002);
	
	}

}
