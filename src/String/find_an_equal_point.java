package String;

//not running
public class find_an_equal_point {
	
	public static void find(String str){
		int i=0;
		int j=str.length()-1;
		int countOpening=0;
		int countClosing=0;
		while(i<j){
			while(str.charAt(i)!='(' && i<j){
				
				i++;
			}
			countOpening++;
			
			
			while(str.charAt(j)!=')' && i<j){
				
				j--;
			
			}
			countClosing++;
			
			i++;
			j--;
			
			System.out.println(j);
			
		}
		System.out.println(j+1);
		
	}
	
	
	public static void main(String[] args) {
		String str=")((()())";
		find(str);
	}

}
