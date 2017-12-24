package GraphTheory;

import java.util.Iterator;
import java.util.LinkedList;

//coding blocks
public class graph4 {

	int v;
	
	LinkedList<Integer> [] adjlist;
	
	public graph4(int v){
		this.v=v;
		adjlist=new LinkedList[v];
	}
	
	//add an edge to the graph
	public void addEdge(int u,int v,boolean bidir){
		adjlist[u].addLast(v);
		//if map is bi directional
		if(bidir){
			adjlist[v].addLast(u);
		}
	}
	
	public void printAdjList(){
		for(int i=0;i<v;i++){
			System.out.println(i+"--->");
			Iterator<Integer> itr=adjlist[i].iterator();
			while(itr.hasNext()){
				
			}
		}
	}
	
}
