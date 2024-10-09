import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This class demonstrates reading integer inputs from the user, 
 * storing them in a LinkedList, and sorting the list in ascending order.
 */

public class SortedLinkedList {

    /**
     * Main method to execute the program.
     * It reads integers from the user, adds them to a LinkedList,
     * and then sorts the list in ascending order.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a LinkedList to hold the integers
        LinkedList<Integer> numbersList = new LinkedList<>();
        
        // Initialize Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a list of integers (enter 'q' to stop):");
        
        // Read input until the user types 'q'
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // Add integer to the list
                numbersList.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    // Stop input when user enters 'q'
                    break;
                } else {
                    System.out.println("Please enter a valid integer or 'q' to quit.");
                }
            }
        }
        
        // Sort the LinkedList in ascending order
        Collections.sort(numbersList);
        
        // Print the sorted list
        System.out.println("Sorted List: " + numbersList);
        
        // Close the scanner to prevent resource leakage
        scanner.close();
    }
}

