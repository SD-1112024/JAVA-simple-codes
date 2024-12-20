package JAVAPROGRAMMING;
public class Explicit {

    //target_datatype=(target_datatype)expression;(SYNTAX FOR NARROWING CONVERSION)
    
        public static void main(String[] args) {

            // int to byte (narrowing conversion)
            int largeIntValue = 140;
            byte byteValue = (byte) largeIntValue;  // explicit cast from int to byte
            System.out.println("int to byte: " + byteValue);  // data loss occurs


            // double to float (narrowing conversion)
            double doubleValue = 9.7866666666;
            float floatValue = (float) doubleValue;  // explicit cast from double to float
            System.out.println("double to float: " + floatValue);
            
            // float to long (narrowing conversion)
            long longValue = (long) floatValue;  // explicit cast from float to long
            System.out.println("float to long: " + longValue);
            
            // long to int (narrowing conversion)
            int intValue = (int) longValue;  // explicit cast from long to int
            System.out.println("long to int: " + intValue);
            
            
        }
    }
    


