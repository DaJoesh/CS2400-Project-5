//CS 2400 - Project 5 
//By Russell Rickards and Joshua Jenkins
import java.util.*;
public class Graph
{
	private int V;
	private LinkedList<Integer> adj[];

	public Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
		{
			adj[i] = new LinkedList();
		}
	}

	public void addEdge(int v,int w)
	{
		adj[v].add(w);
	}

	public void breadthFirstTraversal(int s)
	{
		int visited[] = new int[V];
		LinkedList<Integer> list = new LinkedList<Integer>();
		visited[s]=1;
		list.add(s);
		while (list.size() != 0)
		{
			s = list.poll();
			System.out.print(s + " ");
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
			{
				int n = i.next();
				if (visited[n] == 0)
				{
					visited[n] = 1;
					list.add(n);
				}
			}
		}
	}

	public void depthFirstTraversal(int s)
    {
        Vector<Boolean> visited = new Vector<Boolean>(V);
        for (int i = 0; i < V; i++)
		{
        	visited.add(false);
		}
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while(stack.empty() == false)
        {
        	s = stack.peek();
            stack.pop();     
            if(visited.get(s) == false)
            {
                System.out.print(s + " ");
                visited.set(s, true);
            }
                 
            Iterator<Integer> itr = adj[s].iterator();
                 
            while (itr.hasNext())
            {
                int v = itr.next();
                if(!visited.get(v))
				{
                    stack.push(v);
				}
                 
            }
        }
	}
}