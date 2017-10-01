package String;

public class similarSubstrings {
	
	//check given substring is similar or not ..similar means starting char and last char are same 
	public static boolean checkSimilar(String str){
		return (str.charAt(0)==str.charAt(str.length()-1));
	}
	
	//count no of subtrings are similar
	public static int substringWithSameStartEnd(String input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		int length=input.length();
		int count=0;
		
		//starting point of a substring 
		for(int i=0;i<length;i++){
			//end point of a substring
			for(int j=i+1;j<=length;j++){
				if(checkSimilar(input.substring(i, j))==true){
					count++;
				}
			}
		}
		
		return count;
		

	}
	
	public static void main(String[] args) {
		int ans=substringWithSameStartEnd("aba");
		System.out.println(ans);
		
		
		
		
		boolean ans2=checkSimilar("abc");
		System.out.println(ans2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
