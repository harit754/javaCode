package Math;

import java.util.ArrayList;
import java.util.Collections;

public class all_factors {
	

	public static ArrayList<Integer> allFactors(int a) {
	    ArrayList<Integer> list=new ArrayList<>();
	    
	    double end= Math.sqrt(a);
	    for(int i=1;i<=end;i++){
	        if(a%i==0){
	            list.add(i);
	            if(i!=end){
	            	list.add(a/i);
	            }
	        }
	    }
	    Collections.sort(list);
	    return list;
	}
	
	public static void main(String[] args) {
	ArrayList<Integer> ans=	allFactors(38808);
	
	System.out.println(ans);
	}


}
