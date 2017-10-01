package String;

public class compressTheString {
	public static String compress(String str) {
		
		// Write your code here
		str=str+" ";
		String str1="";
		int l=str.length();
		int count=0;
		for(int i=0;i<l-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				count++;
				System.out.println(str1);
				
			}else{/*
				str1=str1+str.charAt(i);
				str1=str1+count;
				count=1;*/
				int add=count+1;
				if(add==1){
					str1=str1+str.charAt(i);
					count=0;
				}else{
					str1=str1+str.charAt(i)+add;
					count=0;
				}
			}
			
		}
		
				return str1;

/*
		String s=str+" ";
		String str1="";
		int count=0;
		for(int i=0;i<s.length()-1;i++){
			
		}*/
		
	
	}
	
	public static void main(String[] args) {
		String str="aasaaaaabbbbccccccccccccccccdeeeee";
		String ans=compress(str);
		System.out.println(ans);
	}

}
