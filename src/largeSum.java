import java.math.BigInteger;
import java.util.Scanner;

public class largeSum {
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		BigInteger sum=BigInteger.valueOf(0);
//		System.out.println(sum);
		
		
		
//		System.out.println(sum.add(BigInteger.valueOf(1522)));
		
		BigInteger a=new BigInteger("0");
//		System.out.println(a);
		
//		sum=sum.add(a);
//		System.out.println(sum);
		String str;
		while(n>0){
			str=s.next();
			a=new BigInteger(str);
			sum=sum.add(a);
			n--;
		}
		
		String str1=	sum.toString();
		String ans="";
		for(int i=0;i<10;i++){
			ans=ans+str1.charAt(i);
		}
		System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String input;
		while(n>0){
			input=s.nextLine();
			BigInteger a=new BigInteger(input);
			
//			String str="";
			sum=sum.add(a);
			
		n--;
		}
	*/
	
		
		
	}

}
