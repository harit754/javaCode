import java.util.Scanner;

public class multiplesOf2or3 {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			long n = in.nextLong();
			n=n-1;


			long n1=0;
			long n2=0;
			long n3=0;

			n1=n/3;
			n1=(3*n1*(n1+1))>>1;
			System.out.println(n1);

			n2=n/5;
			n2=(5*n2*(n2+1))>>1;

			System.out.println(n2);
			n3=n/15;
			n3=(15*n3*(n3+1))>>1;
			System.out.println(n3);

			System.out.println(n1+n2-n3);
		}

	}

}
