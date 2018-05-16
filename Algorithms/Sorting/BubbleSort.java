/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author sowjanya
 */
class BubbleSort {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        System.out.println(n);
        for (int i = 0; i <= n; i++) {
            System.out.println("This is the outer loop number " + i);
            boolean status = true;

            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("This is the inner loop number " + j);
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    status = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (status) {
                System.out.println("It seems array has been sorted already");
                break;
            }
        }

    }

    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
