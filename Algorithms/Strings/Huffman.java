/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

/**
 *
 * @author AbhilashKosaraju
 */
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class Huffman {

    // A Huffmannode has required attributes to compute Huffman code  
    static class HuffmanNode {

        int data;
        char c;

        HuffmanNode left;
        HuffmanNode right;
    }

    // The Comparator class implementation is required to pass as the argument to the priority queue
    static class MyComparator implements Comparator<HuffmanNode> {

        public int compare(HuffmanNode x, HuffmanNode y) {
            return x.data - y.data;

        }
    }

    public static void printCode(HuffmanNode root, String s) {

        if (root.left == null
                && root.right == null
                && Character.isLetter(root.c)) {
            // printing out the character and the huffmancodes associated with them
            System.out.println(root.c + ":" + s);
            return;

        }
        // 0 is added to the code when the tree parsed to the left
        // 1 is added to the code when the tree is parsed to the right
        // recursively calling all the sub trees of the generated tree
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // number of characters in the given string 
        int n = 5;
        char[] charArray = {'h', 'u', 'f', 'm', 'a', 'n'};
        int[] charfreq = {1, 1, 2, 1, 1, 1};

        // creating a priority queue q.
        // makes a min-priority queue(min-heap).
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<HuffmanNode>(n, new MyComparator());
        // PriorityQueu contains the nodes of type HuffmanNode
        // which would be sorted internally with the help of Comparator implementation MyComparator
        for (int i = 0; i < n; i++) {

            // creating a huffman node object
            // and adding it to the priority-queue.
            HuffmanNode hn = new HuffmanNode();

            hn.c = charArray[i];
            hn.data = charfreq[i];

            hn.left = null;
            hn.right = null;

            //Huffmannodes are being added to the PriorityQueue
            priorityQueue.add(hn);
        }

        // Root node of type Huffman node
        HuffmanNode root = null;

        //Two minimum values are extracted from the heap until only one element is left out in the queue 
        while (priorityQueue.size() > 1) {

            //Extracting the minimum nodes from heap and polling them in to Priority Queue
            HuffmanNode x = priorityQueue.peek();
            priorityQueue.poll();
            HuffmanNode y = priorityQueue.peek();
            priorityQueue.poll();

            // A new node of type HuffmanNode is created to hold the values of the sum of mins extracted from the heap
            HuffmanNode temp = new HuffmanNode();

            // the sum of the frequency of the two min nodes selected from the heap is assigned to the f node.
            temp.data = x.data + y.data;
            temp.c = '-';

            // assigning value to the left child.
            temp.left = x;

            // assigning value to the right child.
            temp.right = y;

            // assigning the temp node as the root to the selected minimum nodes from the heap.
            root = temp;

            // adding the temp node to the priorityQueue, where it gets sorted acordingly
            priorityQueue.add(temp);
        }

        printCode(root, "");
    }
}
