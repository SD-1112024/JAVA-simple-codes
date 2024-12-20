package JAVAPROGRAMMING;

public class ShiftOperatorExample {


    public static void main(String[] args) {
        int a = 8;  // 8 in binary is 1000

        // Left Shift Operator <<
        System.out.println("Left Shift (a << 2): " + (a << 2));  // 8 << 2 = 32 (binary 1000 becomes 100000)

        // Right Shift Operator >>
        System.out.println("Right Shift (a >> 2): " + (a >> 2)); // 8 >> 2 = 2 (binary 1000 becomes 10)

        // Unsigned Right Shift Operator >>>
        int b = -2;  // -16 in binary (32-bit) is 11111111111111111111111111110000
        System.out.println("Unsigned Right Shift (b >>> 2): " + (b >>> 2));  // -16 >>> 2 will shift bits to right, filling 0s on the left
    }
}

