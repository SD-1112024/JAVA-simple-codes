package JAVAPROGRAMMING;

public class implicit {
        public static void main(String[] args) {
            // byte to int (widening conversion)
            byte byteValue = 10;
            int intValue = byteValue;  // byte automatically cast to int
            System.out.println("byte to int: " + intValue);
            
            // int to long (widening conversion)
            long longValue = intValue;  // int automatically cast to long
            System.out.println("int to long: " + longValue);
            
            // long to float (widening conversion)
            float floatValue = longValue;  // long automatically cast to float
            System.out.println("long to float: " + floatValue);
            
            // float to double (widening conversion)
            double doubleValue = floatValue;  // float automatically cast to double
            System.out.println("float to double: " + doubleValue);
        }
    }
    

