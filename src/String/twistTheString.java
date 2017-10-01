package String;

public class twistTheString {

	public static String twist(String input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		String str="";
		int l=input.length();
		int count=0;
		int i=0;
		int a;
//		char c;
		
		while(i<l-1){
			count=1;
//			System.out.println("hi");
		for(;i<l-1;i++){
			if(input.charAt(i)==input.charAt(i+1)){
				count++;
//				System.out.println("ho");
			}else{
//				System.out.println("hu");
				i++;
				break;
			}
		}
		System.out.println(i);
		a=(input.charAt(i-1)-97+count)%26+97;
		
//		c=(char) a;
//		System.out.println(c);
		str=str+input.charAt(i-1)+(char)a;
		
		}
		return str;

	}
	
	public static void main(String[] args) {
	String str=	twist("yyy");
	System.out.println(str);
	}

}
