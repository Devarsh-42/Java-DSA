import java.util.Arrays;
import java.util.Collections;
public class Shorting {
    // Bubble Sort algorithm for Ascending order.
    public static void bubbleSort(int num[]) {
        int swap = 0; // Variable to count the number of swaps

        // Outer loop controls the number of times the entire array is traversed
        for (int turn = 0; turn < num.length - 1; turn++) {
            // Inner loop iterates through the unsorted portion of the array
            for (int i = 0; i < num.length - 1 - turn; i++) {
                // Compare adjacent elements and swap them if they are in the wrong order
                if (num[i] > num[i + 1]) {
                    // Swap:
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    swap++;
                }
            }

            // If no swaps occurred in a pass, the array is already sorted
            if (swap == 0) {
                break;
            }
        }

        System.out.println(swap); // Output the total number of swaps performed
    }


    //Function for Printing an array:
    public static void Print(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
    }

    // Selection Sort Descending order.
    public static void selectionSort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int maxPos = i; // Assuming current position as maximum

            // Inner loop finds the index of the maximum element in the unsorted portion
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] > num[maxPos]) { // '>' for decreasing order, '<' for increasing order
                    maxPos = j;
                }
            }

            // Swap:
            int temp = num[maxPos];
            num[maxPos] = num[i];
            num[i] = temp;
        }
    }

    //Insertion Short:
    public static void insertionSort(int num[]) {
        for (int i = 1; i < num.length; i++) {
            int curr = num[i]; // Current Element
            int prev = i - 1; // Previous Element

            // Find the correct position to insert the current element
            while (prev >= 0 && num[prev] < curr) {
                // If previous element is greater than current element, shift the previous element backward
                num[prev + 1] = num[prev]; // For Ascending: num[prev] > curr
                prev--;
            }

            // Insertion:
            num[prev + 1] = curr;
        }
    }

    public static void CountingSort(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            largest = Math.max(largest,num[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<num.length; i++){//Frequency Array:
            count[num[i]]++;
        }
        //Sorting:
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                num[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String arg[]) {
        int num[] = {5, 3, 4, 7, 2, 6, 1};
        System.out.println("Bubble Sort:");
        bubbleSort(num);//Time Complexity : O(n^2)
        Print(num);
        System.out.println("\nSelection Sort: ");
        selectionSort(num);//Time Complexity : O(n^2)
        Print(num);
        System.out.println("\nInsertion Sort: ");
        insertionSort(num);//Time Complexity : O(n^2) , but less swaps
        Print(num);
        System.out.println("\nBy Inbuilt Sort: ");
        Arrays.sort(num);
        System.out.println("By Inbuilt Sort between specified index: ");
        Arrays.sort(num,0,3);//Comment out all other(Above) Function bcoz then it will already be sorted
        Print(num);
        //Inbuilt Array:
        //System.out.println("For Reverse Sorting/Descending order of array by inbuilt array: ");
        //Arrays.sort( num,Collections.reverseOrder());//Use Integer num[] instEd of int num[]
        System.out.println("\nCounting Sort: ");
        CountingSort(num);
        Print(num);
    }
}

