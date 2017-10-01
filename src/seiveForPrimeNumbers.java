import java.util.ArrayList;

public class seiveForPrimeNumbers {
	
	public static ArrayList<Integer> seive(int n){
		ArrayList<Integer> primes=new ArrayList<>();
		boolean [] touched=new boolean[n+1];
		
		//touching two's only
		primes.add(2);
		for(int i=2;i<=n;i+=2){
			touched[i]=true;
		}
		
		//loop goes to sqroot of n
		for(int i=3;i<=Math.sqrt(n);i++){
			if(!touched[i]){
				//optimised here
				for(int j=i*i;j<=n;j=j+i*2){
					touched[j]=true;
				}
				
				
			}
			
		}
		//those not touched --->added to the arraylist--->are prime numbers
		for(int i=2;i<=n;i++){
			if(!touched[i]){
				primes.add(i);
				System.out.println(i);
			}
		}
		
		return primes;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list=seive(1000000);
//		System.out.println(list.get(2));
		
		int l=list.size();
		long sum=0;
		for(int i=0;i<l;i++){
			sum +=list.get(i);
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}

}
