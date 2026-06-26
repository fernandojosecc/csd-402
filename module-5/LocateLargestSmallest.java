/**
 * Fernando Contreras
 * Assignment 5.2: Locate Largest and Smallest in 2D Arrays
 * June 26, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This program defines four overloaded methods that locate
 * the largest and smallest elements in a 2D array of either double or int
 * type. Each method returns a one-dimensional array containing the row
 * and column index of the target element. A test program demonstrates
 * each method with clearly displayed output.
 */

public class LocateLargestSmallest {

    // --- Locate Largest ---

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0];
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0];
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // --- Locate Smallest ---

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // --- Helper: print 2D double array ---

    public static void printArray(double[][] array) {
        for (double[] row : array) {
            System.out.print("  [ ");
            for (double val : row) System.out.printf("%-8.1f", val);
            System.out.println("]");
        }
    }

    // --- Helper: print 2D int array ---

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.print("  [ ");
            for (int val : row) System.out.printf("%-8d", val);
            System.out.println("]");
        }
    }

    // --- Test Program ---

    public static void main(String[] args) {

        // Double 2D array
        double[][] doubleArray = {
            {3.5, 7.2, 1.1},
            {9.8, 2.4, 6.6},
            {4.0, 8.3, 5.5}
        };

        System.out.println("========================================");
        System.out.println("  Double 2D Array:");
        printArray(doubleArray);

        int[] dLargest  = locateLargest(doubleArray);
        int[] dSmallest = locateSmallest(doubleArray);

        System.out.printf("  Largest  Value: %.1f  --> Row %d, Col %d%n",
            doubleArray[dLargest[0]][dLargest[1]],
            dLargest[0], dLargest[1]);
        System.out.printf("  Smallest Value: %.1f  --> Row %d, Col %d%n",
            doubleArray[dSmallest[0]][dSmallest[1]],
            dSmallest[0], dSmallest[1]);

        System.out.println();

        // Int 2D array
        int[][] intArray = {
            {42, 15, 78, 33},
            {91, 6,  55, 20},
            {13, 67, 38, 99}
        };

        System.out.println("========================================");
        System.out.println("  Int 2D Array:");
        printArray(intArray);

        int[] iLargest  = locateLargest(intArray);
        int[] iSmallest = locateSmallest(intArray);

        System.out.printf("  Largest  Value: %d  --> Row %d, Col %d%n",
            intArray[iLargest[0]][iLargest[1]],
            iLargest[0], iLargest[1]);
        System.out.printf("  Smallest Value: %d   --> Row %d, Col %d%n",
            intArray[iSmallest[0]][iSmallest[1]],
            iSmallest[0], iSmallest[1]);

        System.out.println("========================================");
    }
}