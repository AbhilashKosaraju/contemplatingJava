/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author sowjanya
 */
public class USearch {

    UGraph graph;
    int v;

    boolean[] visited;

    public final static String DFS = "DFS";
    public final static String BFS = "BFS";

    public USearch(UGraph graph, int s) {
        this.graph = graph;
        this.v = graph.V();
        this.visited = new boolean[v];
        for (int i = 0; i < v; ++i) {
            this.visited[i] = false;
        }
        dfs(s);

    }

    public USearch(UGraph graph, int s, String method) {
        this.graph = graph;
        this.v = graph.V();
        this.visited = new boolean[v];
        for (int i = 0; i < v; ++i) {
            this.visited[i] = false;
        }
        if (method.equals(USearch.BFS)) {
            bfs(s);
        } else {
            dfs(s);
        }
    }

    private void dfs(int current) {
        if (visited[current]) {
            return;
        } else {
            visited[current] = true;
            System.out.print(current + " ");

            for (Integer v : graph.adj(current)) {
                dfs(v);
            }
        }
    }

    private void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.add(v);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (Integer w : graph.adj(current)) {
                if (!visited[w]) {
                    visited[w] = true;
                    queue.add(w);
                }
            }
        }

    }

}
