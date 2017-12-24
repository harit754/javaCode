package Math;

public class B1_excel_column_number {
	
	
	
	
	public static void main(String[] args) {
		int ans=titleToNumber("AAC");
		System.out.println(ans);
	}

	public static int titleToNumber(String str) {
		int length=str.length();
		int number=0;
		int temp=1;
		for(int i=length-1;i>=0;i--){
			number=number+(str.charAt(i)-'A'+1)*temp;
			temp=temp*26;
		}
		return number;
	}
}
