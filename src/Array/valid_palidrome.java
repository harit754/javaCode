package Array;

public class valid_palidrome {
	
	
	
	
	
	
	public static boolean valid(String str){
		int i=0;
		int j=str.length()-1;
		int count=0;
		boolean check1=true;
		boolean check2=true;
		while(i<j){
			System.out.println(i);
			if(str.charAt(i)!=str.charAt(j)){
				count++;
				System.out.println("count"+"-->"+count);
				if(str.charAt(i)==str.charAt(j-1)){
//					j--;
				check1=	valid(str.substring(i,j));
				}else if(str.charAt(j)==str.charAt(i+1)){
					check2=	valid(str.substring(i+1,j+1));
				}else{
					return false;
				}
			}
			i++;
			j--;
			
		}
		if(count<1 || check1 || check2){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		boolean ans=valid("ebcbbececabbacecbbcbe");
		System.out.println(ans);
	}

}
