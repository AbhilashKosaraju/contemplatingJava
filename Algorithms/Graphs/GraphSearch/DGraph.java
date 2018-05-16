/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import edu.princeton.cs.algs4.Bag;

/**
 *
 * @author sowjanya
 */
public class DGraph implements GraphI {

    private int v;
    private Bag<Integer>[] adj;

    public DGraph(int v) {
        this.v = v;
        adj = new Bag[v];
        for (int i = 0; i < adj.length; ++i) {
            adj[i] = new Bag<Integer>();
        }
    }

    @Override
    public int V() {
        return this.v;
    }

    @Override
    public int E() {
        int num = 0;
        for (int i = 0; i < adj.length; ++i) {
            num += adj[i].size();
        }
        return num;
    }

    @Override
    public void addEdge(int v, int w) {
        adj[v].add(w);

    }

    @Override
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}
