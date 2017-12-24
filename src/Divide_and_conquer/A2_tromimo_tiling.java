package Divide_and_conquer;

public class A2_tromimo_tiling {
	
	
	
	
	//debugging
	public static void main(String[] args) {
		int n=4;
		int arr[][]=new int[4][4];
		
		arr[0][1]=1; //hole
		
		
		solve(arr,0,1,0,3,0,3);
//		System.out.println("testing"+(100/2-1));
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
	}

	public static int counter=2;
	private static void solve(int[][] arr, int x, int y, int i, int j, int p, int q) {
		
		int n=j-i+1;//size of current matrix
		System.out.println("n"+n);
		if(x<n/2 && y<n/2){
			System.out.println("case1");
			arr[i+n/2][p+n/2-1]=counter;
			arr[i+n/2-1][p+n/2]=counter;
			arr[i+n/2][p+n/2]=counter;
			counter++;
			
			/*System.out.println("matrix forming");
			for(int u=0;u<n;u++){
				for(int v=0;v<n;v++){
					System.out.print(" "+arr[u][v]);
				}
				System.out.println();
			}
			*/
			if((j-i)==1){
				arr[i+n/2][p+n/2-1]=counter;
				arr[i+n/2-1][p+n/2]=counter;
				arr[i+n/2][p+n/2]=counter;
				counter++;
				return;
				
			}
			
			solve(arr,x,y,i,n/2-1,p,n/2-1);
			solve(arr,n/2-1,n/2,i,n/2-1,n/2,q);
			solve(arr,n/2,n/2-1,n/2,j,p,n/2-1);
			solve(arr,n/2,n/2,n/2,j,n/2,q);
			
			
		}else if(x<n/2 && y>=n/2){
			System.out.println("case2");
			arr[i+n/2-1][p+n/2-1]=counter;
			arr[i+n/2][p+n/2-1]=counter;
			arr[i+n/2][p+n/2]=counter;
			counter++;
			
			if((j-i)==1){
				arr[i+n/2-1][p+n/2-1]=counter;
				arr[i+n/2][p+n/2-1]=counter;
				arr[i+n/2][p+n/2]=counter;
				counter++;
				return;
				
			}
			
			solve(arr,n/2-1,n/2-1,i,n/2-1,p,n/2-1);
			solve(arr,x,y,i,n/2-1,n/2,q);
			solve(arr,n/2,n/2-1,n/2,j,p,n/2-1);
			solve(arr,n/2,n/2,n/2,j,n/2,q);
			
			
		}else if(x>=n/2 && y<n/2){
			System.out.println("case3");
			arr[i+n/2-1][p+n/2-1]=counter;
			arr[i+n/2-1][p+n/2]=counter;
			arr[i+n/2][p+n/2]=counter;
			counter++;
			
			if((j-i)==1){
				arr[i+n/2-1][p+n/2-1]=counter;
				arr[i+n/2-1][p+n/2]=counter;
				arr[i+n/2][p+n/2]=counter;
				counter++;
				return;
				
			}
			
			solve(arr,n/2-1,n/2-1,i,n/2-1,p,n/2-1);
			solve(arr,n/2,n/2,i,n/2-1,n/2,q);
			solve(arr,x,y,n/2,j,p,n/2-1);
			solve(arr,n/2,n/2,n/2,j,n/2,q);
			
			
		}else{
			System.out.println("case4");
			arr[i+n/2-1][p+n/2-1]=counter;
			arr[i+n/2-1][p+n/2]=counter;
			arr[i+n/2][p+n/2-1]=counter;
			counter++;
			
			if((j-i)==1){
				arr[i+n/2-1][p+n/2-1]=counter;
				arr[i+n/2-1][p+n/2]=counter;
				arr[i+n/2][p+n/2-1]=counter;
				counter++;
				return;
				
			}
			
			solve(arr,n/2-1,n/2-1,i,n/2-1,p,n/2-1);
			solve(arr,n/2,n/2,i,n/2-1,n/2,q);
			solve(arr,n/2,n/2-1,n/2,j,p,n/2-1);
			solve(arr,x,y,n/2,j,n/2,q);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
