
public class ForLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== FOR LOOP EXERCISES ===\n");

        // TODO 1: Basic For Loop
        System.out.println("TODO 1: Print 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // TODO 2: Even Numbers
        System.out.println("TODO 2: Even numbers 2 to 20");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // TODO 3: Countdown
        System.out.println("TODO 3: Countdown 10 to 1");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // TODO 4: Skip Count
        System.out.println("TODO 4: Multiples of 5 (5 to 50)");
        for (int i = 5; i <= 50; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();

        // TODO 5: Array Processing
        System.out.println("TODO 5: Print array elements");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // TODO 6: Sum Calculation
        System.out.println("TODO 6: Sum of 1 to 100");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        System.out.println();

        // TODO 7: Factorial
        System.out.println("TODO 7: Factorial of 6");
        int factorial = 1;
        for (int i = 1; i <= 6; i++) {
            factorial *= i;
        }
        System.out.println("6! = " + factorial);
        System.out.println();

        // TODO 8: String Iteration
        System.out.println("TODO 8: Print each character in 'HELLO'");
        String word = "HELLO";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        System.out.println();

        // TODO 9: Multiplication Table
        System.out.println("TODO 9: Multiplication table for 7");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
        System.out.println();

        // TODO 10: Nested For Loops
        System.out.println("TODO 10: 4x4 grid of asterisks");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // TODO 11: Array Sum
        System.out.println("TODO 11: Sum of array elements");
        int[] values = {15, 25, 35, 45, 55};
        int arraySum = 0;
        for (int i = 0; i < values.length; i++) {
            arraySum += values[i];
        }
        System.out.println("Array sum: " + arraySum);
        System.out.println();

        // TODO 12: Find Maximum
        System.out.println("TODO 12: Find maximum in array");
        int[] data = {23, 67, 45, 89, 12, 78, 34};
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println();

        // TODO 13: Reverse Array Print
        System.out.println("TODO 13: Print array in reverse");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }
        System.out.println();

        // TODO 14: Pattern Printing
        System.out.println("TODO 14: Star pattern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

