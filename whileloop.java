package JAVAPROGRAMMING;
public class whileloop {


        public static void main(String[] args) {
            int count = 1;
    
            // While loop continues until count is less than or equal to 5
            while (count <= 5) {
                System.out.println("Count is: " + count);
                count++; // Increment the count to avoid an infinite loop
            }
        }
    }
    