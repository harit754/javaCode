package String;

import java.util.HashMap;
import java.util.Scanner;

public class convert_into_two_charac_string {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		String s = in.next();
		
		int max=0;
		HashMap<Character,Character> map=new HashMap<>();
		
		for(int i=0;i<len;i++){
			map.put(s.charAt(i), s.charAt(i));
		}
		
		int size=map.size();
		char [] arr=new char[size];
		int i=0;
		for(char c:map.values()){
//			System.out.println(c);
			arr[i]=c;
			i++;
		}
		
		for(int j=0;j<size-1;j++){
			for(int k=j+1;k<size;k++){
				char first=arr[j];
				char second=arr[k];
				
//				System.out.println(first);
//				System.out.println(second);
				char nextchar='A';
				char prevchar='A';
				int p;
				for(p=0;p<len;p++){
					if(s.charAt(p)==first){
					nextchar=second;
					prevchar=first;
					break;
					}else if( s.charAt(p)==second){
						nextchar=first;
						prevchar=second;
						break;
						
					}
				}
				int count=0;
				for(int q=p+1;q<len;q++){
					if(s.charAt(q)==prevchar){
						break;
					}
					if(s.charAt(q)==nextchar){
						count++;
						if(nextchar==first){
							nextchar=second;
							prevchar=first;
						}else{
							nextchar=first;
							prevchar=second;
						}
					}
				}
				if(count>max){
					max=count;
				}
				
				System.out.println(count+1);
				
			}
		}
		
		
		if(max!=0){
			System.out.println(max+1);
		}else{
			System.out.println(0);
		}
		
		
	}


}
