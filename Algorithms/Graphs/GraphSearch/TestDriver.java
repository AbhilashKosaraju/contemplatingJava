/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author sowjanya
 */
public class TestDriver {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter the size of the graph i.e the number of vertices in the graph");
//        int size = scan.nextInt();
        UGraph ugraph = new UGraph(8);
        DGraph dgraph = new DGraph(8);
//        int count = 0;
//        System.out.println("The Space for the adjacency list has beem allocated. Now please enter the edges between the vertices");
//        while (count < size) {
//            int src = scan.nextInt();
//            int dest = scan.nextInt();
//            ugraph.addEdge(src, dest);
//            dgraph.addEdge(src, dest);
//            count++;
//        }
        ugraph.addEdge(5, 6);
        ugraph.addEdge(4, 6);
        ugraph.addEdge(3, 7);
        ugraph.addEdge(6, 7);
        ugraph.addEdge(5, 7);
        ugraph.addEdge(1, 4);
        ugraph.addEdge(2, 4);
        ugraph.addEdge(2, 3);
        ugraph.addEdge(4, 7);

        dgraph.addEdge(5, 6);
        dgraph.addEdge(4, 6);
        dgraph.addEdge(3, 7);
        dgraph.addEdge(6, 7);
        dgraph.addEdge(5, 7);
        dgraph.addEdge(1, 4);
        dgraph.addEdge(2, 4);
        dgraph.addEdge(2, 3);
        dgraph.addEdge(4, 7);

        System.out.println("Here are the elements of bag in the undirected graph ");
        for (int i = 0; i < 8; i++) {
            for (Integer l : ugraph.adj(i)) {

                System.out.println(i + "->" + l);
            }
            System.out.println("--------");
        }

        System.out.println("Here are the elements of bag in the directed graph ");
        for (int i = 0; i < 8; i++) {
            for (Integer l : dgraph.adj(i)) {
                System.out.println(i + "->" + l);
            }
            System.out.println("---------");
        }

        System.out.println("\n The DFS traversal for Undirected Graph");
        USearch search = new USearch(ugraph, 1);
        System.out.println("\n The BFS traversal for Undirected Graph");
        USearch bfs = new USearch(ugraph, 1, USearch.BFS);

        System.out.println(" \n The DFS traversal for Directed Graph");
        Dsearch dsearch = new Dsearch(dgraph, 1);
        System.out.println(" \n The BFS traversal for Directed Graph");
        Dsearch bfss = new Dsearch(dgraph, 1, USearch.BFS);

    }
}
