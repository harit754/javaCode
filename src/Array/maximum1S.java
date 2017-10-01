package Array;
//running
public class maximum1S {
	public static int max1(int arr[][])
	{
		int count[]=new int[arr.length];
		for(int k=0;k<count.length;k++){
			count[k]=0;
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==1){
					count[i]++;
				}
			}
			
		}
		int max=count[0];
		int index=0;
		for(int l=1;l<count.length;l++){
			if(max<count[l]){
				max=count[l];
				index=l;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[][] arr={
				{1,0,0},
				{1,1,0}
		};
		System.out.println(max1(arr));
	}

}
