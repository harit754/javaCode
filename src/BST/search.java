package BST;


public class search {


	public static class BinaryTreeNode{

		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;

		public BinaryTreeNode(int data) {
			// TODO Auto-generated constructor stub
			this.data=data;
			left=null;
			right=null;
		}
	}



	public static boolean searching(BinaryTreeNode root,int x){

		if(root==null){
			return false;
		}
		
		if(root.data==x){
			return true;
		}
		if(root.data>x){
			return searching(root.left,x);
		}else{
			return  searching(root.right,x);
		}
		
			 
			
		
//		return false;

	}


public static void main(String[] args) {
	BinaryTreeNode root=new BinaryTreeNode(50);
	root.left=new BinaryTreeNode(25);
	root.right=new BinaryTreeNode(75);
	
	boolean ans=searching(root,50);
	System.out.println(ans);
}
















}



