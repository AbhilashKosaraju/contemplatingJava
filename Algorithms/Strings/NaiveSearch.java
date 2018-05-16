/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sowjanya
 */
public class NaiveSearch {

    void search(String text, String pattern) {

        String Text = text.toUpperCase();
        String Pattern = pattern.toUpperCase();
        int t = text.length();
        int p = Pattern.length();
        if (t < p) {
            System.out.println("The string length of the pattern is longer than the Text string. \n Cannot be compared.");
        }
        for (int i = 0; i <= t - p; i++) {
            int j;
            for (j = 0; j < p; j++) {
                if (Text.charAt(i + j) != Pattern.charAt(j)) {
                    break;
                }
            }
            if (j == p) {
                System.out.println("Pattern found in the text at index" + i);
                break;
            } else if ((i + j) > t) {
                System.out.println(j);
                System.out.println(" The given string length exceeds the text string length");
            } else {
                System.out.println("The exact pattern not found starting from the index" + i);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        NaiveSearch search = new NaiveSearch();
        System.out.println("Enter the Text string to be searched in");
        String text = reader.readLine();
        System.out.println("Enter the pattern to be matched");
        String pattern = reader.readLine();

        System.out.println("\n Pattern Matching Result \n ----------------------");
        search.search(text, pattern);

    }
}
