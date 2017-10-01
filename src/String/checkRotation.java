package String;

//easy by ankur
public class checkRotation {
	
	public static int checkRot(String original ,String rotated) {
		/*
		int l=original.length();
		int count=0;
		int n=0;
		while(n<l){
			for(int i=0;i<l;i++){
			}
			String str=original.substring(1)+original.charAt(0);
			System.out.println(str);
			if(str.equals(rotated)){
				count++;
				n++;
			}else{
				n++;
				count++;
			}
		}
		return count;
	*/
		int length=original.length();
	return check(original,rotated,0,length);
	}
	
	
  public static int check(String orig,String rot,int count,int length){
	  if(count==length){
		  return 0;
	  }
		String str=orig.substring(1)+orig.charAt(0);
//		System.out.println(str);
		if(str.equals(rot)){
			count++;
//			System.out.println(count);
			return count;
		}else{
			count++;
//		System.out.println(count);
			return check(str,rot,count,length);
		}
  }
  
  
  public static boolean checkRotationByK(String str1, String str2, int k){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
	  int l=str1.length();
	String str11=str1.substring(0,l-k);
	String str12=str1.substring(l-k);
	
	String str13=str1.substring(0, l-k-1);
	String str14=str1.substring(l-k-1);
	
	String str3=str12+str11;
	String str4=str14+str13;
	
	if(str3.equals(str2)){
		return true;
	}else if(str4.equals(str2)){
		return true;
	}else{
		return false;
	}

	}
  
/*  baabbsbbahsahbahshhbhsjjjj
  jbaabbsbbahsahbahshhbhsjjj
  1
  */
	
	public static void main(String[] args) {
		boolean ans=checkRotationByK("baabbsbbahsahbahshhbhsjjjj","jbaabbsbbahsahbahshhbhsjjj",1);
	System.out.println(ans);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
