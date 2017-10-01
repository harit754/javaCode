package Algos;

public class seive_of_ethanthoses {
	
	public static void main(String[] args) {
		int max=1000;
		//seive array ___all true
		boolean[] seive=new boolean[max+1];
		for(int i=0;i<=max;i++){
			seive[i]=true;
			
		}

		seive[0]=seive[1]=false;
		//trace array
		for(int i=2;i<=max;i++){
			if(seive[i]==true){
				for(int j=2;i*j<=max;j++){
					seive[i*j]=false;
				}
			}
		}
		System.out.println(seive[997]);
		
	}
	

}
