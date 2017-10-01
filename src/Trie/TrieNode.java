package Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	Map<Character, TrieNode> children;
	boolean endOfWord;
	
	public TrieNode(){
		children=new HashMap<>();
		endOfWord=false;
	}
	
	
	 
	
	
	
	//make methods here 
	    
	
	public static void main(String[] args) {
		//TODO
		//complete your code here
		String str="abc";
		
		TrieNode root=new TrieNode();
		
		
		add(root,str);
		System.out.println(root.children.keySet());
		System.out.println(root.children.get('a').children.keySet());
		
		
	}
	
	//searching partial and return number of words 
	 public int searchPartial(TrieNode root,String word) {
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
	        return current.children.size();
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
	
	
	 /**
     * Recursive implementation of insert into trie
     */
    public void insertRecursive(TrieNode root,String word) {
        insertRecursive(root, word, 0);
    }


    private void insertRecursive(TrieNode current, String word, int index) {
        if (index == word.length()) {
            //if end of word is reached then mark endOfWord as true on current node
            current.endOfWord = true;
            return;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);

        //if node does not exists in map then create one and put it into map
        if (node == null) {
            node = new TrieNode();
            current.children.put(ch, node);
        }
        insertRecursive(node, word, index + 1);
    }

    /**
     * Iterative implementation of search into trie.
     */
    public boolean search(TrieNode root,String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            //if node does not exist for given char then return false
            if (node == null) {
                return false;
            }
            current = node;
        }
        //return true of current's endOfWord is true else return false.
        return current.endOfWord;
    }

    /**
     * Recursive implementation of search into trie.
     */
    public boolean searchRecursive(TrieNode root,String word) {
        return searchRecursive(root, word, 0);
    }
    private boolean searchRecursive(TrieNode current, String word, int index) {
        if (index == word.length()) {
            //return true of current's endOfWord is true else return false.
            return current.endOfWord;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        //if node does not exist for given char then return false
        if (node == null) {
            return false;
        }
        return searchRecursive(node, word, index + 1);
    }

    /**
     * Delete word from trie.
     */
    public void delete(TrieNode root,String word) {
        delete(root, word, 0); 
    }

    /**
     * Returns true if parent should delete the mapping
     */
    private boolean delete(TrieNode current, String word, int index) {
        if (index == word.length()) {
            //when end of word is reached only delete if currrent.endOfWord is true.
            if (!current.endOfWord) {
                return false;
            }
            current.endOfWord = false;
            //if current has no other mapping then return true
            return current.children.size() == 0;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(node, word, index + 1);

        //if true is returned then delete the mapping of character and trienode reference from map.
        if (shouldDeleteCurrentNode) {
            current.children.remove(ch);
            //return true if no mappings are left in the map.
            return current.children.size() == 0;
        }
        return false;
}
	

}

