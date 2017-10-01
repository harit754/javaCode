package String;
//running
public class openingmsg {

	public static void resetArray(int[] arr){
		int l=arr.length;
		for(int i=0;i<l;i++){
			arr[i]=0;
		}
	}

	public static void getOpenMessageCount(int noOfMesages, int noOfClicks, int[] msgClick) {
		//write your code here
		int[] check=new int[noOfMesages];
		for(int i=0;i<noOfClicks;i++){
			if(msgClick[i]==-1){
				resetArray(check);
				System.out.println(0);
			}else{
				int msgNO=msgClick[i];
				if(check[msgNO-1]==1){
					check[msgNO-1]=0;
				}else{
					check[msgNO-1]=1;
				}

				int ans=count1s(check);
				System.out.println(ans);
			}

		}



	}

	private static int count1s(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		int l=arr.length;
		for(int i=0;i<l;i++){
			if(arr[i]==1){
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		int test[]={1,2,3,2,-1};
		getOpenMessageCount(3,5,test);

	}

}
