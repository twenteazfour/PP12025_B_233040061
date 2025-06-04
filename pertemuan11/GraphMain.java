package Tugas_P10;

public class GraphMain {
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		System.out.println();
		
		graph.addEdge(0, 1); 
		graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 3);
		System.out.println();
	}

}
