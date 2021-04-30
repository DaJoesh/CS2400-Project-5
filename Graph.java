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
    @Override
    public boolean isEdge(int source, int target) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void addEdge(int source, int target) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void neighbors(int vertex) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void removeEdge(int source, int target) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setLabel(int vertex, E newLabel) {
        // TODO Auto-generated method stub
        
    }
}
