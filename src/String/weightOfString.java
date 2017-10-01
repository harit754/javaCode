package String;
//running
public class weightOfString {
	
	public static int weight(String str){
		
		if(str.length()==0){
			return 0;
		}
		int a=str.charAt(0);
//		System.out.println(a);
		if(a==1+96 || a==5+96||a==9+96||a==15+96||a==21+96){
//			System.out.println("y");
			return weight(str.substring(1));
			
		}
		else{
			return weight(str.substring(1)) +(a-96);
		}
		
	}
	
	
	public static void main(String[] args) {
		/*int s='u';
		System.out.println(s-96);
		
		String str="abcd";
		System.out.println(str.substring(1));*/
		int ans=weight("aff");
		System.out.println(ans);
	}

}
