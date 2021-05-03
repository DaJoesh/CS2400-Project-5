//CS2400-Project-5
//By: Russell Rickards and Joshua Jenkins
public class GraphDriver
{
    	public static void main(String args[])
	{
		int start;
		//EXAMPLE FOR BFS:
		//**********************************
		Graph bfs = new Graph(5);
		start = 3;
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);
		bfs.addEdge(3, 4);
		bfs.addEdge(4, 2);

		System.out.println("Breadth First Traversal starting at " + start + ": ");

		bfs.breadthFirstTraversal(start);

		System.out.println("\n");

		//EXAMPLE FOR DFS:
		//**********************************
		Graph dfs = new Graph(5);
        start = 4; 
        dfs.addEdge(1, 0);
        dfs.addEdge(0, 2);
        dfs.addEdge(2, 1);
        dfs.addEdge(0, 3);
        dfs.addEdge(1, 4);
		dfs.addEdge(4, 2);
             
        System.out.println("Depth First Traversal starting at " + start + ": ");
        dfs.depthFirstTraversal(start);
    }
}