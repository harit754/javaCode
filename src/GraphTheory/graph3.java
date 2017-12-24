package GraphTheory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//adjacency list
//InTeger TYPE Vertexes----->simple graph

public class graph3 {
	

	int V;
	
	//array of linked list
	List<Integer> l[];
	
	//n--->no of vertexes
	graph3(int v){
		V=v;
		l=new LinkedList[v];
		for(int i=0;i<v;i++){
			l[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int u,int v,boolean bidir){
		l[u].add(v);
		if(bidir){
			l[v].add(u);
		}
	}
	
	//overRide function
	public String toString(){
		String res="";
		for(int i=0;i<V;i++){
			res += i+":";
			for(int a:l[i]){
				res +=" "+a;
			}
//			System.out.println();
			res += "\n";
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		graph3 g=new graph3(3);
		g.addEdge(0,2,true);
		g.addEdge(0, 1, true);
		
		System.out.println(g);
		
//		List<Integer> list=new LinkedList<>();
		
	}
	
	
	
}
