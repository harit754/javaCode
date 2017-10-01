package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class twiceCounter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t = s.nextInt();

		while(t>0){

			int n=s.nextInt();
			String [] arr=new String[n];
			for(int i=0;i<n;i++){
				arr[i]=s.next();
			}
			int count=0;
			HashMap<String, Integer> map=new HashMap<>();
			
			for(String str:arr){
				int a=1;
				if(map.containsKey(str)){
					 a=map.get(str)+1;
				}
				map.put(str, a);
			}
			
//			System.out.println(count);
			for(int val:map.values()){
				if(val==2){
					count++;
				}
			}
			System.out.println(count);
			
		
		t--;
		}

	}
	
	
	
}
