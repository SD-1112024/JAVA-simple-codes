package JAVAPROGRAMMING;
import java.util.Scanner;
public class readstringwitoufunc {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to enter characters
        System.out.println("Enter a string (character by character), type '.' to end:");

        // Defining a character array to store the string
        char[] input = new char[100];
        int index = 0;
        
        // Loop to read characters one by one
        while (true) {
            char ch = scanner.next().charAt(0);  // Reading one character at a time

            // Stop when a '.' is entered
            if (ch == '.') {
                break;
            }

            // Store the character in the array
            input[index] = ch;
            index++;
        }

        // Display the characters as a string
        System.out.print("You entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(input[i]);
        }
        
        System.out.println();  // For a new line
        scanner.close();
    }
}



