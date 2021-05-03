//CS 2400 - Project 5 
//By Russell Rickards and Joshua Jenkins
import java.util.*;
public class Graph
{
	private int vert;
	private LinkedList<Integer> adj[];

	public Graph(int v)
	{
		vert = v;
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
		int visited[] = new int[vert];
		LinkedList<Integer> list = new LinkedList<Integer>();
		visited[s]=1;
		list.add(s);
		while (list.size() != 0)
		{
			s = list.poll();
			System.out.print(s + " ");
			Iterator<Integer> iter = adj[s].listIterator();
			while (iter.hasNext())
			{
				int n = iter.next();
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
        Vector<Integer> visited = new Vector<Integer>(vert);
        for (int i = 0; i < vert; i++)
		{
        	visited.add(0);
		}
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
            }
                 
            Iterator<Integer> iter = adj[s].iterator();
                 
            while (iter.hasNext())
            {
                int v = iter.next();
                if(visited.get(v) == 0)
				{
                    stack.push(v);
				}
                 
            }
        }
	}

}