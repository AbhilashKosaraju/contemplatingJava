/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author sowjanya
 */
public class Countingsort {

    void sort (char arr[]) {
        int n = arr.length;
        int range = (int) arr[0];
        char c = ' ';
        for (int i = 1; i < n; i++) {
            if ((int) arr[i] > range) {
                range = (int) arr[i];
                c = arr[i];
            }
        }
        System.out.println("The range of the input string with the character '" + c + "'is:" + " " + range);
        // The output character array that will have sorted arr
        char output[] = new char[n];

        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        Integer count[] = new Integer[range + 1];
        Integer count2[]= new Integer[range + 1];
        Arrays.fill(count,0);
        Arrays.fill(count2, 0);

        // store count of each character
        for (int i = 0; i < n; ++i) {
            ++count[arr[i]];
        }

        for (int i = 0; i <= range; i++) {
            count2[i]=count[i];
        }
        // Change count[i] so that count[i] now contains actual position of this character in output array
        for (int i = 1; i <= range; ++i) {
            count[i] += count[i - 1];
        }
        // Build the output character array
        for (int i = 0; i < n; ++i) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }
        for (int i = 0; i < range + 1; ++i) {
            if (count2[i] > 0) {
                System.out.println("Frequency is "+count2[i] + "Character is " + (char) Arrays.asList(count2).indexOf(count2[i]));
                count2[i] = 0;
            }
        }

    }

    // Driver method
    public static void main(String args[]) throws IOException {
        Countingsort ob = new Countingsort();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the character string");
        String input = reader.readLine();
        char carr[] = input.toCharArray();
        ob.sort(carr);
        System.out.print("Sorted character array is : ");
        for (int i = 0; i < carr.length; ++i) {
            System.out.print(carr[i]);
        }
        System.out.println(" ");
    }
}
