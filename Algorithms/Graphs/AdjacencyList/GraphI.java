/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author sowjanya
 */
public interface GraphI {

    /**
     *
     * @return number of vertices
     */
    int V();

    /**
     *
     * @return number of edges
     */
    int E();

    /**
     *
     * @param v the first vertex
     * @param w the second vertex
     */
    void addEdge(int v, int w);

    /**
     *
     * @param v the target vertex
     * @return a iterator to traverse all the adjacent vertices
     */
    Iterable<Integer> adj(int v);

}
