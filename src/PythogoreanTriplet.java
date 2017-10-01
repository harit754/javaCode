import java.util.Scanner;

public class PythogoreanTriplet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int max=-1;
            double b2=0;
            double c2=0;
            double b1=0;
            double c1=0;
            for(double i=1;i<n;i++){
              /*  for(int j=i+1;j<=n;j++){
                    c=(int)Math.sqrt(i*i+j*j);
                    if(i+j+c==n){
                        if(i*j*c>max){
                            max=i*j*c;
                        }else if(i+j+c>n){
                            break;
                        }
                    }
                }*/
//               System.out.println("a"+i);
                b2=((n-i)-i*i/(n-i))/2;
             
//               System.out.println("b"+b2);
                if(b2<=i){
                    b2=0;
                    
                    break;
                }else if(b2%1==0){
                    b1=b2;
                }else{
                	continue;
                }
                
                c2=((n-i)+i*i/(n-i))/2;
//                System.out.println("c"+c2);
                if(c2<=b1){
                    c2=0;
                    continue;
                }else if(c2%1==0){
                    c1=c2;
                }else{
                	continue;
                }
                
                if(i*b1*c1>max){
                max=(int)(i*b1*c1);    
                }
                
//                 System.out.println("max"+max);
                
                
            }
            System.out.println(max);
        }
    }

}
