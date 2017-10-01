package GraphTheory;
import java.util.*;

//class graph
public class graph{
	//class vertex
	public class Vertex{
		int v,w;
		public Vertex(int v,int w){
			this.v=v; this.w=w;
		}
		@Override
		public String toString(){
			return "("+v+","+w+")";
		}
	}
	
	List<Vertex> G[];
	public graph(int n){
		G=new LinkedList[n];
		for(int i=0;i<G.length;i++)
			G[i]=new LinkedList<Vertex>();
	}
	boolean isConnected(int u,int v){
		for(Vertex i: G[u])
			if(i.v==v) return true;
		return false;
	}
	void addEdge(int u,int v,int w){
		G[u].add(0,new Vertex(v,w)); 
		G[v].add(0,new Vertex(u,w));
	}
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<G.length;i++)
			result+=i+"=>"+G[i]+"\n";
		return result;
	}
}
