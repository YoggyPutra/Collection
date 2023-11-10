/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting_searching;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(40);
        list.add(7);
        list.add(59);
        list.add(4);

        System.out.println("Original ArrayList:");
        System.out.println(list);

        selectionSort(list);

        System.out.println("\nSorted ArrayList:");
        System.out.println(list);
    }

    // Selection sort function for ArrayList
    static void selectionSort(ArrayList<Integer> list) {
        int n = list.size();

        // Traverse through all list elements
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted list
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}


    

