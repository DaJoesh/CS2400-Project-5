//CS 2400 - Project 5 
//By Russell Rickards and Joshua Jenkins
import java.util.*;
public class Graph
{
	private int vert;
	private LinkedList<Integer> adjacencyList[];

	/**creates inititial graph
	 * @param size intended size of the graph.
	 */
	public Graph(int size)
	{
		vert = size;
		adjacencyList = new LinkedList[size];
		for (int i=0; i<size; ++i)
		{
			adjacencyList[i] = new LinkedList();
		}//end for
	}//end Graoh

	/** method to add and edge to the graph
	 * @param v intended index in adjacency list
	 * @param w number to be added to the adjacency list
	 */
	public void addEdge(int v,int w)
	{
		adjacencyList[v].add(w);
	}//end addEdge
	
    /** Does a breadth first traversal of the graph.
	 *	@param s source node in which you would like to start at.
	 */
	public void breadthFirstTraversal(int s)
	{
		int visited[] = new int[vert];
		LinkedList<Integer> list = new LinkedList<Integer>();
		visited[s]=1;
		list.add(s);
		while (list.size() != 0)
		{
			s = list.poll();
			System.out.print(s + " ");
			Iterator<Integer> iter = adjacencyList[s].listIterator();
			while (iter.hasNext())
			{
				int n = iter.next();
				if (visited[n] == 0)
				{
					visited[n] = 1;
					list.add(n);
				}//end if
			}//end while
		}//end while
	}//end breadthFirstTraversal
	
	/** Does depthFirstTraversal of the graph.
	 * @param s - source node in which you would like to start traversing from
	 */
	public void depthFirstTraversal(int s)
    {
        Vector<Integer> visited = new Vector<Integer>(vert);
        for (int i = 0; i < vert; i++)
		{
        	visited.add(0);
		}//end for loop
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while(stack.empty() == false)
        {
        	s = stack.peek();
            stack.pop();     
            if(visited.get(s) == 0)
            {
                System.out.print(s + " ");
                visited.set(s, 1);
            }//end if  
            Iterator<Integer> iter = adjacencyList[s].iterator();     
            while (iter.hasNext())
            {
                int v = iter.next();
                if(visited.get(v) == 0)
				{
                    stack.push(v);
				}//end if   
            }//end while
        }//end while
	}//end depthFirstTraversal
	
}//end Graph (class)