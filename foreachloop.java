package JAVAPROGRAMMING;

/*For-Each Loop Syntax:
for (data_type var1:var2)////////SYNTAX OF FOR EACH LOOP
for (int num : numbers) is the for-each loop syntax.
The num variable represents each element in the array as the loop iterates.
The : operator is used to specify the collection or array to loop through (numbers in this case).*/

public class foreachloop {
    
        public static void main(String[] args) {
            // Declare and initialize an array of integers
            int[] numbers = {1, 2, 3, 4, 5};
    
            // Using for-each loop to iterate over the array
            System.out.println("Using for-each loop to print numbers:");
            for (int num : numbers) {
                System.out.println(num);
            }
        }
    }
    
    

