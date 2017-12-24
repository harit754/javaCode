package Math;

public class A3_DECBINARY {
	
	
	
	
	
	
	public static void main(String[] args) {
		String s=findDigitsInBinary(0);
		System.out.println(s);
	}
	public static String findDigitsInBinary(int n) {
		if(n==0){
			return "0";
		}
		String str="";
		while(n>0){
			
			str +=(n%2==0)?('0'):('1');
			n=n/2;
			
		}
		//reverse the string
		String str2="";
		int l=str.length();
		for(int i=0;i<l;i++){
			str2+=str.charAt(l-1-i);
		}
		return str2;
	}

}
