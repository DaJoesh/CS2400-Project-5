//CS 2400 - Project 5
//By Russell Rickards and Joshua Jenkins
public class Graph<T>
{
    private boolean[][] edges; // edges[i][j] is true of there is a vertex from i to j
    private T[] labels; //labels[i] contains the label for vertex i
    public Graph(int n)
    {
        edges = new boolean [n][n]; // All values initially false
        labels = (T[]) new Object[n]; // All values are intitially full
    }
}
