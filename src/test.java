import java.util.Arrays;
import java.util.Scanner;

public class test {
	
	public static class stock{
		int price;
		int frequency;
		public stock() {
			// TODO Auto-generated constructor stub
			price=0;
			frequency=0;
		}
		
		
	}
	
	
	public static class sorting{
		public static void quicksort(stock [] arr,int s,int e){
			if(s<e){
				int q=partition2(arr,s,e);
				quicksort(arr, s, q-1);
				quicksort(arr,q+1,e);
//				printArray(arr);
//				printArrayLimit(arr,s,e);
				
				
			}else{
				return;
			}
		}
		

		 public static int partition2(stock[] arr,int s,int e){
				int pivot=arr[s].price;
				int i=e+1;
				for(int j=e;j>=s+1;j--){
					if(arr[j].price>=pivot){
						i--;
						stock temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					//printArray(arr);
				}
				stock temp=arr[i-1];
				arr[i-1]=arr[s];
				arr[s]=temp;
				
//				printArray(arr);
				//System.out.println("byee");
				
				return i-1;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
  public  static int buyMaximumProducts(int n, int k, stock[] a) {
        // Complete this function
    	/*int a[]=new int[n];
    	for(int i=0;i<n;i++){
    		a[i]=arr[i].price;
    	}
	  */
         long sum=0;
        int count=0;
        sorting.quicksort(a, 0, n-1);
        for(stock b:a){
        	System.out.println(b.price);
        	System.out.println(b.frequency);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<a[i].frequency;j++){
                 sum +=a[i].price;
                 System.out.println(sum);
                if(sum<k){
                   
                count++;
                }else{
                    break;
                }
                
                
            }
            if(sum>=k){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        stock obj=new stock();
//        System.out.println(obj.frequency);
        stock[] arr = new stock[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
        	arr[arr_i]=new stock();
            arr[arr_i].price = in.nextInt();
            arr[arr_i].frequency=arr_i+1;
        }
       for(stock b:arr){
    	   System.out.println(b.price);
    	   System.out.println(b.frequency);
       }
        
        
        int k = in.nextInt();
        int result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }}
