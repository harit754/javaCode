package Math;

public class B3_gcd {
	
	
	
	
	public static void main(String[] args) {
		
		int ans=gcd(6,9);
		System.out.println(ans);
		
	}
	
	public static int gcd(int a,int b){
		//notebook
		if(a==0 || b==0){
			return 1;
		}
		if(a==b){
			return a;
		}
		if(a>b){
			return gcd(a-b,b);
		}else{
			return gcd(a,b-a);
		}
	}
	
	//if m>n then this will work
	//euclid recursive
	public static int gcd2(int n,int m){
		if(m%n==0){
			return n;
		}
		return gcd2(m%n,m);
	}
	
	//iterative version 
	public static int euclid(int n,int m){
		while(m%n!=0){
			int r=m%n;
			n=r;
			m=n;
		}
		return m;
	}
	
	

}
