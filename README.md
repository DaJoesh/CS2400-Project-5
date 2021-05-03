# CS2400-Project-5
# By Joshua Jenkins and Russell Rickards
#
# ---In GraphDriver---
#
# Creating a graph:
# - "Graph g = new Graph(int size);"
#   -size = how big you want the graph. NOTE: size will be read as starting from 0 instead of 1 (i.e. 0,1,2,3 is a size of 4).
#
# Adding an edge:
# - "g.addEdge(int x, int v);"
#   -adds v to x's list (creates vertex).
#   -HAS TO BE ADDED IN ORDER IN ORDER FOR IT TO WORK. SEE OUR EXAMPLES FIRST.
#
# Breadth first traversal:
# - "g.breadthFirstTraversal(int source);"
#   -source = source node.
#
# Depth first traversal:
# - "g.depthFirstTraversal(int source);" 
#   -source = source node.