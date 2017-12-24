package Math;

import java.util.ArrayList;

public class B4_reaaranging_array {

	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(4);
		arr.add(0);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arrange(arr);
	}
	

	public static void arrange(ArrayList<Integer> arr) {
		
		int l=arr.size();
		int i=10;
		while(i<=l){
			i=i*10;
		}
//		System.out.println("i "+i);
		
		for(int j=0;j<l;j++){
			
			arr.set(j, i*(arr.get(arr.get(j))%i)+arr.get(j));
			
		}
		
		for(int j=0;j<l;j++){
			arr.set(j, arr.get(j)/i);
		}
		
		/*for(int j=0;j<l;j++){
			System.out.println(arr.get(j));
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int l=arr.size();
		int i=0;
		int temp1=arr.get(i);
//		System.out.println(temp1);
//		System.out.println(arr.indexOf(1));
		while(i<l){
			System.out.println("i "+i);
			System.out.println(temp1);
			int index1=arr.indexOf(temp1);
			int index2=arr.indexOf(index1);
			System.out.println("index1 "+index1+" index2 "+index2);
		int temp2=	arr.get(index2);
		System.out.println(temp2);
		arr.set(index2, temp1);
		temp1=temp2;
		i++;
		}
		
		for(int j=0;j<l;j++){
			System.out.println(arr.get(j));
		}
		
	*/}

}
