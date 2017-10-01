package DP;

import java.util.Scanner;

public class coin_change_problem {


	//n--size of coins array
	//storage
	public static int coinsNeeded(int [] coins,int amount,int n,int [] storage){
		if(amount==0){
			storage[amount]=0;
			return storage[amount];
		}

		int ans=Integer.MAX_VALUE;
		//ith coin
		for(int i=0;i<n;i++){

			if(amount-coins[i] >=0){
				int smallAns=0;
				if(storage[amount-coins[i]]!=0){
					 smallAns= storage[amount-coins[i]];
				}else{
					smallAns=coinsNeeded(coins,amount-coins[i],n,storage);
				}
				
				if((smallAns+1)<ans){
					ans=smallAns+1;
				}
			}
		}
		return ans;
	}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int amount =s.nextInt();
		int n=s.nextInt();
		int [] coins={1,2,3};
		int[] storage=new int[amount+1];

		int ans=coinsNeeded(coins,amount,n,storage);
		System.out.println(ans);


	}

}
