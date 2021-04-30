public interface GraphInterface<T>
{

    public boolean isEdge(int source, int target);

    public void addEdge(int source, int target);

    public void getLabel(int vertex);

    public void neighbors(int vertex);

    public void removeEdge(int source, int target);

    public void setLabel(int vertex, T newLabel);

}