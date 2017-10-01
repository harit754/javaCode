import java.util.Scanner;
// There is a collection of N strings (There can be multiple occurences of a particular string ).
//Each string's length is no more than 20 characters. 
//There are also Q queries. For each query, you are given a string, and you need to find out how many times this string occurs in the given collection of N strings. 
public class sparseArray {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		int N=s.nextInt();
		String[] str=new String[N];
		for(int i=0;i<N;i++){
			str[i]=s.next();
		}
		
		int t=s.nextInt();
		while(t>0){
			int count=0;
			String s1=s.next();
			
			for(int i=0;i<N;i++){
				if(s1.equals(str[i])){
					count++;
				}
			}
			
			System.out.println(count);
			
			t--;
			
			
			
		}
		
		
		
		}

}
