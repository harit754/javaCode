package DP;

public class Longest_common_subsequence {
	
	public static int LCS(int l,int m,String a,String b,int [][] storage){
		if(l==0||m==0){
			storage[l][m]=0;
			return storage[l][m];
		}
		
		if(storage[l][m]>0){
			return storage[l][m];
		}
		
		if(a.charAt(l-1)==b.charAt(m-1)){
			storage[l][m]= 1+LCS(l-1,m-1,a,b,storage);
		}else{
			storage[l][m]=Math.max(LCS(l-1,m,a,b,storage), LCS(l,m-1,a,b,storage));
		}
		return storage[l][m];
	}
	
	
	public static void main(String[] args) {
		/*String a="abcsde";
		String b="bcda";
		int l=6;
		int m=4;
		int [][] storage=new int[l+1][m+1];
	int ans=	LCS(l,m,a,b,storage);
	System.out.println(ans);*/
	
	
	
	
	
	
	
	String c="sunday";
	String d="saturday";
	int l=c.length();
	int m=d.length();
	int [][] storage=new int[l+1][m+1];
	int common=LCS(l,m,c,d,storage);
//	int l2=d.length();
	
	
	
	int diff=m-common;
	System.out.println(diff);
	
	
	
	}

}
