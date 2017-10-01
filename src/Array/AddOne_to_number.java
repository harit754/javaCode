package Array;

import java.util.ArrayList;

public class AddOne_to_number {
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    
		   int l=a.size();
		   int add=1;
		   for(int i=l-1;i>0;i--){
			  int ele=a.get(i)+add;
			  if(ele>9){
				  a.set(i, ele%10);
				  add=ele/10;
			  }else{
				  a.set(i, ele);
				  return a;
			  }
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
		   }
		   
		   int ele=a.get(0)+add;
			  if(ele>9){
				  a.set(0, ele%10);
				  a.add(0, ele/10);
//				  add=ele/10;
			  }else{
				  a.set(0, ele);
				  return a;
			  }
			   
		   
		   
		   
		   
		   
		   return a;
		}

	
	
	
	public static void removeZero(ArrayList<Integer> list){
		while(list.get(0)==0){
			list.remove(0);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(0);
		list.add(9);
		list.add(9);
		
		removeZero(list);
		System.out.println(list);
//		ArrayList<Integer> ans= plusOne(list);
		
//		System.out.println(ans);
	}
}
