package Recursion;


//not working
public class thePowerSum {
	//initial sum=sqroot2
	static int count=0;
	public static void powerSum(int sqroot,int num,int power,int sum,int temp){
		System.out.println("hi");
		System.out.println(sqroot);
		if(sqroot==0){
			return;
		}
		if(sum==num){
			count++;
			powerSum(sqroot-1,num,power,(int)Math.pow(sqroot-1, power),sqroot-1);
		}
		
//		int temp=sqroot;
		while(sum<num){
			temp--;
			sum +=(int)Math.pow(temp,power);
			System.out.println(sum+"1");
			if(temp==1){
				powerSum(sqroot-1,num,power,(int)Math.pow(sqroot-1, power),sqroot-1);
			}
				return;	
		}
		
		while(sum>num){
			sum -=(int)Math.pow(temp, power);
			System.out.println(sum+"2");
			temp--;
			sum +=(int)Math.pow(temp, power);
			System.out.println(sum+"3");
		}
		
		powerSum(sqroot,num,power,sum,temp);
		
	}
	
	
	public static void main(String[] args) {
		powerSum(10,100,2,100,10);
		System.out.println(count+"count");
	}

}
