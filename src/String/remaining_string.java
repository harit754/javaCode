package String;

import java.util.Scanner;

public class remaining_string {
	
	public static void main(String[] args) {

		//code
		
		Scanner in=new Scanner(System.in);
		  int t = in.nextInt();
    
while(t>0){
    String str=in.next();
    String c=in.next();
    char c1=c.charAt(0);
    
    int n=in.nextInt();
    
    int count=0;
    int l=str.length();
    for(int i=0;i<l;i++){
        if(str.charAt(i)==c1){
            count++;
        }
        if(count==n){
            System.out.println(str.substring(i+1));
            break;
        }
    }
    
    
    
    t--;
}
	
	}

}
