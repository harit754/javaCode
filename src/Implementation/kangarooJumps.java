package Implementation;

import java.util.Scanner;

public class kangarooJumps {
	
	public static String find(int x1, int v1, int x2, int v2){
		//Assume x1 is looser and its speed v1
		if(x1>x2){
			System.out.println("x1"+" "+x1+"x2 ::"+x2);
			return "NO";
		}
		if(x1==x2){
			return "YES";
		}
		System.out.println("x1"+" "+x1+"x2 ::"+x2);
	return	find(x1+v1,v1,x2+v2,v2);
	}
	
	
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	        // Complete this function
		if((x1>x2 && v1>v2) || (x2>x1 && v2>v1)){
			return "NO";
		}
		
//		int looser,winner;
		if(x1<x2){
			//x1 is looser
			return find(x1,v1,x2,v2);
			
		}else{
		//x2 is looser
			return find(x2,v2,x1,v1);
		}
		
		
		
		
		
	    }
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }


}
