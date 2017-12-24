package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class sum_of_left_leaves {






	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}



	public static int sum(TreeNode root){

		if(root==null || root.left==null && root.right==null){
			return 0;
		}
		
		int res=0;
		
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty()){
			TreeNode current=q.remove();
			
			//condition of leaf
			if(current.left!=null && current.left.left==null && current.left.right==null){
				res+=current.left.val;
			}
			//add into queue
			if(current.left!=null){
				q.add(current.left);
			}
			if(current.right!=null){
				q.add(current.right);
			}
		}
		return res;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}