 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting_searching;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author ASUS
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(40);
        number.add(7);
        number.add(59);
        number.add(4);
        System.out.println(number);
        
        selectionSort(number); // using Selection sort algorithm
        System.out.println(number);
        searching(number, 40); // using collection searching
        binarySearch(number, 4); // using binary search algorithm
    }
    private static void sorting(ArrayList<Integer> number) {
        System.out.println("sorting using colection...");
        Collections.sort(number);
        System.out.println("Sorted ArrayList: " + number);
    }
    
    public static void searching(ArrayList<Integer> obj, int value) {
        System.out.println("searching for "+value+" using collection...");
        int index = Collections.binarySearch(obj, value);
        if (index >= 0) {
            System.out.println(value + " found at index " + (index));
        } else {
            System.out.println(value + " not found in the ArrayList");
        }

    }
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
    
    public static void binarySearch(ArrayList<Integer> list, int value) {
        int left = 0;
        int right = list.size() - 1;
        boolean condition = false;
         System.out.println("searching for "+value+" using binary sort...");
        while (left <= right) {
            int index = left + (right - left) / 2;

            if (list.get(index) == value) {
                condition = true;
                System.out.println(value + " was found at index: " + (index));
                break;
            } else if (list.get(index) < value) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        }
        if (!condition) {
            System.out.println(value + " not found :(");
        }
    }
}
