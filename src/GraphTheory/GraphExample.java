package GraphTheory;

public class GraphExample {
	public static void main(String[] args) {
		graph g=new graph(10);
		g.addEdge(0, 2, 10);
		g.addEdge(0, 5, 15);
		g.addEdge(2, 5, 10);
		g.addEdge(9, 3, 16);
		
		System.out.println(g);
		System.out.println(g.isConnected(9,3));
	}
}