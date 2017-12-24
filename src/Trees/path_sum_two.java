package Trees;

import BST.search.BinaryTreeNode;

public class path_sum_two {
	
	
	
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
		
	}
	
	//null 0 case should be false 
	//TODO
	
	
public static boolean hasPathSum(Node root, int sum) {
        
        if(sum==0 && root==null){
            return true;
        }
        if(root==null){
            return false;
        }
       if( hasPathSum(root.left,sum-root.data) || hasPathSum(root.right,sum-root.data)){
           return true;
       }else{
           return false;
       }
}   



	public static void find(Node root,int sum,int ans){
		/*while(ans<sum){
			if(root!=null){
				ans +=root.data;
			}
			
			if(ans<=sum){
				System.out.println(root.data);
			}
			root=root.left;
			
			
		}
*/
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	public static void main(String[] args) {
		
		Node root=new Node(5);
//		root.data=5;
		root.left=new Node(4);
		root.right=new Node(6);
		
		
		boolean ans=hasPathSum(root,0);
		System.out.println(ans);
		
	}

}
