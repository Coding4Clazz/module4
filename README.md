# module4
Module 4 Project

 * This class demonstrates reading integer inputs from the user, 
 * storing them in a LinkedList, and sorting the list in ascending order.

 * In my provided code, there are few examples of code reuse in action. 

The first is reuse as it related to libraries/frameworks.  In use is pre-built functionality from the Collections Framework/Scanner class to handle inputs.  This is a scalable alternative to writing a custom implementation.  Examples include:

	⁃	LinkedList<Integer> numbersList = new LinkedList<>();
	⁃	 Reuses the LinkedList class from the Java Collections Framework
	⁃	Collections.sort(numbersList;
	⁃	 Reuses the Collections.sort method to sort the list instead of writing a sorting algorithm


The second can be attributed to the code structure itself.  The code functionality can be encapsulated into reusable methods/classes so that others may call these components without rewriting (similar to the logic in the first example above).  In this same vein, this could (in theory) be used within a generic class or multiple different classes the same input handling/functionality is required via inheritance.

A third example would be the methods that are reused.  The following methods provided by Java classes are used in the code:

	⁃	scanner.hasNextInt() 
	⁃	Reuses the hasNextInt() method to check if the next token is an integer.
	⁃	scanner.nextInt() 
	⁃	Reuses the nextInt() method to retrieve the next integer.
	⁃	input.equalsIgnoreCase("q")
	⁃	Reuses the equalsIgnoreCase() method to compare strings regardless of case.

Two more examples I’d call out are loop reuse and the reuse of the scanner object.  

Loops reuse code implicitly, as the same block of code is called repeatedly pending a condition is met/input etc.  In my provided code while (scanner.hasNext())  reuses the code that handles each subsequent user input.  Looking at the scanner object, it is not reinitiated for every input.
