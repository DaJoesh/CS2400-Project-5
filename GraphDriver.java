public class GraphDriver
{
    	public static void main(String args[])
	{
		Graph bfs = new Graph(4);

		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);

		System.out.println("Breadth First Traversal: ");

		bfs.breadthFirstTraversal(2);

		Graph dfs = new Graph(5);
         
        dfs.addEdge(1, 0);
        dfs.addEdge(0, 2);
        dfs.addEdge(2, 1);
        dfs.addEdge(0, 3);
        dfs.addEdge(1, 4);
             
        System.out.println("Depth First Traversal: ");
        dfs.depthFirstTraversal(0);
    }
}