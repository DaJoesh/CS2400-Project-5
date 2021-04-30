package GraphPackage;
//CS 2400 - Project 5
//By Russell Rickards and Joshua Jenkins
public class Graph<T> implements GraphInterface<T>
{
    private boolean[][] edges; // edges[i][j] is true of there is a vertex from i to j
    private T[] labels; //labels[i] contains the label for vertex i

    public Graph(int n)
    {
        edges = new boolean [n][n]; // All values initially false
        labels = (T[]) new Object[n]; // All values are intitially full
    }

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
}
