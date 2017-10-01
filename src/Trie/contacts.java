package Trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class contacts {

	public static class TrieNode {
		Map<Character, TrieNode> children;
		boolean endOfWord;

		public TrieNode(){
			children=new HashMap<>();
			endOfWord=false;
		}

	}
	
	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		TrieNode root=new TrieNode();
		while(t>0){
			String str=s.next();
			if(str.equals("add")){
				add(root,s.next());
			}else{
				int ans=searchPartial(root,s.next());
				System.out.println(ans);
			}
			
			t--;
		}
		
	}
	
	
	 public static int count=0;
	 public static int searchPartial(TrieNode root,String word) {
		 count=0;
	        TrieNode current = root;
	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);
	            TrieNode node = current.children.get(ch);
	            //if node does not exist for given char then return false
	            if (node == null) {
	                return 0;
	            }
	            current = node;
	        }
	        //return true of current's endOfWord is true else return false.
	      
	         iterateTrie(current);
	         return count;
	    }


	
	public static void iterateTrie(TrieNode current) {
		// TODO Auto-generated method stub
		if(current!=null){
			if(current.endOfWord==true){
				count++;
			}
		}
		
//		int nChild=current.children.size();
		for(TrieNode temp:current.children.values()){
			if(temp!=null){
				
				iterateTrie(temp);
			}
			
		}
//		return count;
	}



	private static void add(TrieNode root, String str) {
		int l=str.length();
		TrieNode current=root;
		for(int i=0;i<l;i++){
			//if current contains this ith charactor or not
			
			//if contains just update the current node
			//else add ith character and update the current node
			if(current.children.containsKey(str.charAt(i))){
				current=current.children.get(str.charAt(i));
				
			}else{
				current.children.put(str.charAt(i), new TrieNode());
				current=current.children.get(str.charAt(i));
			}
			
			
		}
		current.endOfWord=true;
	}

}
