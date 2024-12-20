package JAVAPROGRAMMING;

public class Expimp {
    public static void main(String[] args) {
    // Implicit Conversion
    // byte to int (widening conversion)
    byte byteValue = 10;
    int intValue = byteValue;  // byte automatically cast to int
    System.out.println("byte to int: " + intValue);

    //EXPLICIT CONVERSION 
    //target_datatype=(target_datatype)expression;(SYNTAX FOR NARROWING CONVERSION)

    // double to float (narrowing conversion)
    double doubleValue = 9.7866666666;
    float floatValue = (float) doubleValue;  // explicit cast from double to float
    System.out.println("double to float: " + floatValue);
    
    // float to long (narrowing conversion)
    long longValue = (long) floatValue;  // explicit cast from float to long
    System.out.println("float to long: " + longValue);
    
    // int to byte (narrowing conversion)
    int largeIntValue = 130;
    byte byteValue1 = (byte)largeIntValue;  // explicit cast from int to byte
    System.out.println("int to byte: " + byteValue1);  // data loss occurs
}
    }
    

