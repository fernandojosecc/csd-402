/**
 * Fernando Contreras
 * Assignment 4.2: Overloaded Average Methods
 * June 20, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This program demonstrates method overloading by defining
 * four average() methods that each accept a different array type
 * (short, int, long, double). A test program invokes each method,
 * displays the original array elements, and prints the calculated average.
 */

public class AverageOverload {

    // --- Overloaded Methods ---

    public static short average(short[] array) {
        long sum = 0;
        for (short val : array) sum += val;
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        long sum = 0;
        for (int val : array) sum += val;
        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long val : array) sum += val;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double val : array) sum += val;
        return sum / array.length;
    }

    // --- Helper: print array elements nicely ---

    public static void printArray(Object arr) {
        System.out.print("  Elements: [ ");
        if (arr instanceof short[] a)
            for (short v : a) System.out.print(v + " ");
        else if (arr instanceof int[] a)
            for (int v : a) System.out.print(v + " ");
        else if (arr instanceof long[] a)
            for (long v : a) System.out.print(v + " ");
        else if (arr instanceof double[] a)
            for (double v : a) System.out.print(v + " ");
        System.out.println("]");
    }

    // --- Test Program ---

    public static void main(String[] args) {

        // Short array - 3 elements
        short[] shortArray = {10, 20, 30};
        System.out.println("=== Short Array ===");
        printArray(shortArray);
        System.out.println("  Average: " + average(shortArray));

        System.out.println();

        // Int array - 5 elements
        int[] intArray = {100, 200, 300, 400, 500};
        System.out.println("=== Int Array ===");
        printArray(intArray);
        System.out.println("  Average: " + average(intArray));

        System.out.println();

        // Long array - 4 elements
        long[] longArray = {1000000L, 2000000L, 3000000L, 4000000L};
        System.out.println("=== Long Array ===");
        printArray(longArray);
        System.out.println("  Average: " + average(longArray));

        System.out.println();

        // Double array - 6 elements
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};
        System.out.println("=== Double Array ===");
        printArray(doubleArray);
        System.out.printf("  Average: %.2f%n", average(doubleArray));
    }
}