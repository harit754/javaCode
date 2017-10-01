package GraphTheory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class graph2 {




	public static void addEdge(ArrayList<Integer> [] adj,int u,int v){
		adj[u].add(v);
		//directed graph
		
	}


	
	
	
	//Idea is to check adjacency list and find how many edges are there from each vertex and 
	//return the total number of edge
	
	
	public static void sumOfDependencies(ArrayList<Integer> [] adj){
		int sum=0;
		for(int i=0;i<adj.length;i++){
			sum +=adj[i].size();
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		ArrayList<Integer> adj[]=new ArrayList[v];

		for(int i=0;i<v;i++){

			adj[i]=new ArrayList<>();
		}
		for(int i=0;i<e;i++){
			addEdge(adj,s.nextInt(),s.nextInt());
		}
		
		/*addEdge(adj,1,3);
		addEdge(adj,1,4);
		addEdge(adj,2,4);
		addEdge(adj,3,4);*/
		/*addEdge(adj,2,3);
		addEdge(adj,2,3);
		addEdge(adj,2,3);*/
		

		sumOfDependencies(adj);
	}

}
