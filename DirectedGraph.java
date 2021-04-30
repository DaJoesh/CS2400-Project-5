import java.util.Iterator;
/**
   A class that implements the ADT directed graph.
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class DirectedGraph<T> implements GraphInterface<T>
{
	private DictionaryInterface<T, VertexInterface<T>> vertices;
	private int edgeCount;
	
	public DirectedGraph()
	{
		vertices = new LinkedDictionary<>();
		edgeCount = 0;
	} // end default constructor

	public T getLabel(int vertex)
    {
        return labels[vertex];
    }

    public boolean isEdge(int source, int target) 
    {
        return edges[source][target];
    }

    public void addEdge(int source, int target)
    {
        edges[source][target] = true;
    }

    public int[] neighbors(int vertex) 
    {  
        int count = 0;
        int[] answer;
        for(int i=0; i<labels.length; i++)
            {
                if(edges[vertex][i])
                    count++;
            }
        answer = new int[count];
        count = 0;
        for(int i=0; i<labels.length; i++)
        {
            if(edges[vertex][i])
                answer[count++] = i;
        }
        return answer;
    }

    public void removeEdge(int source, int target) 
    {
        edges[source][target] = false;
        
    }

    public void setLabel(int vertex, T newLabel) 
    {
        labels[vertex] = newLabel;
    }

    public int size()
    {
        return labels.length;
    }
} // end DirectedGraph
