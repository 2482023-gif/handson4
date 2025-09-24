
public class WhileLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== WHILE LOOP EXERCISES ===\n");

        // TODO 1: Count from 1 to 10
        System.out.println("TODO 1: Count 1 to 10");
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // TODO 2: Count Down from 10 to 1
        System.out.println("TODO 2: Count down 10 to 1");
        int countdown = 10;
        while (countdown >= 1) {
            System.out.print(countdown + " ");
            countdown--;
        }
        System.out.println();

        // TODO 3: Even Numbers
        System.out.println("TODO 3: Even numbers 2 to 20");
        int evenNum = 2;
        while (evenNum <= 20) {
            System.out.print(evenNum + " ");
            evenNum += 2;
        }
        System.out.println();

        // TODO 4: Sum of Numbers
        System.out.println("TODO 4: Sum of 1 to 100");
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
        System.out.println();

        // TODO 5: Factorial Calculation
        System.out.println("TODO 5: Factorial of 5");
        int n = 5;
        int factorial = 1;
        int counter = 1;
        while (counter <= n) {
            factorial *= counter;
            counter++;
        }
        System.out.println("5! = " + factorial);
        System.out.println();

        // TODO 6: Find First Multiple
        System.out.println("TODO 6: First multiple of 3 and 7");
        int number = 1;
        while (true) {
            if (number % 3 == 0 && number % 7 == 0) {
                System.out.println("First multiple of 3 and 7: " + number);
                break;
            }
            number++;
        }
        System.out.println();

        // TODO 7: String Character Count
        System.out.println("TODO 7: Count vowels in 'programming'");
        String text = "programming";
        int index = 0;
        int vowelCount = 0;
        while (index < text.length()) {
            char c = text.charAt(index);
            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
            index++;
        }
        System.out.println("Vowel count: " + vowelCount);
        System.out.println();

        // TODO 8: Power Calculation
        System.out.println("TODO 8: Calculate 2^8");
        int base = 2;
        int exponent = 8;
        int result = 1;
        int exp = 0;
        while (exp < exponent) {
            result *= base;
            exp++;
        }
        System.out.println("2^8 = " + result);
        System.out.println();

        // TODO 9: Digit Sum
        System.out.println("TODO 9: Sum of digits in 12345");
        int num = 12345;
        int digitSum = 0;
        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + digitSum);
        System.out.println();

        // TODO 10: Number Guessing Simulation
        System.out.println("TODO 10: Find target number 47");
        int target = 47;
        int guess = 1;
        int attempts = 0;
        while (guess != target) {
            guess++;
            attempts++;
        }
        System.out.println("Found " + target + " in " + attempts + " attempts");
    }
}

