//CS2400-Project-5
//By: Russell Rickards and Joshua Jenkins
public interface GraphInterface
{
    /** method to add and edge to the graph
	 * @param v intended index in adjacency list
	 * @param w number to be added to the adjacency list
	 */
    public void addEdge(int source, int target);

    /** Does a breadth first traversal of the graph.
	 *	@param s source node in which you would like to start at.
	 */
    public void depthFirstTraversal(int s);

    /** Does depthFirstTraversal of the graph.
	 * @param s - source node in which you would like to start traversing from
	 */
    public void breadthFirstTraversal(int s);

}