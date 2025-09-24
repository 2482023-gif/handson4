
public class DoWhileLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== DO-WHILE LOOP EXERCISES ===\n");

        // TODO 1: Basic Do-While Count
        System.out.println("TODO 1: Count 1 to 5");
        int count = 1;
        do {
            System.out.print(count + " ");
            count++;
        } while (count <= 5);
        System.out.println();

        // TODO 2: Menu Simulation
        System.out.println("TODO 2: Menu simulation");
        int choice = 1;
        do {
            System.out.println("Menu: 1. Start  2. Exit");
            choice = 2; // langsung exit untuk simulasi
        } while (choice != 2);
        System.out.println("Exited menu.");
        System.out.println();

        // TODO 3: Input Validation Simulation
        System.out.println("TODO 3: Input validation simulation");
        int inputValue = -1; // Start with invalid
        int attempts = 0;
        do {
            attempts++;
            if (attempts == 2) {
                inputValue = 7; // valid setelah percobaan kedua
            }
            System.out.println("Attempt " + attempts + ": input = " + inputValue);
        } while (inputValue < 1 || inputValue > 10);
        System.out.println("Valid input accepted: " + inputValue);
        System.out.println();

        // TODO 4: At Least Once Execution
        System.out.println("TODO 4: Executes even when condition is false");
        boolean condition = false;
        do {
            System.out.println("This runs even though condition is false!");
        } while (condition);
        System.out.println();

        // TODO 5: Sum Until Zero
        System.out.println("TODO 5: Sum until zero");
        int[] numbers = {5, 3, 8, 2, 0, 7, 1};
        int index = 0;
        int sum = 0;
        do {
            sum += numbers[index];
            index++;
        } while (numbers[index - 1] != 0 && index < numbers.length);
        System.out.println("Sum until zero: " + sum);
        System.out.println();

        // TODO 6: Reverse Number
        System.out.println("TODO 6: Reverse number 12345");
        int number = 12345;
        int reversed = 0;
        do {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        } while (number > 0);
        System.out.println("Reversed: " + reversed);
        System.out.println();

        // TODO 7: Find Character
        System.out.println("TODO 7: Find 'a' in 'programming'");
        String text = "programming";
        int charIndex = 0;
        char target = 'a';
        do {
            if (text.charAt(charIndex) == target) {
                break;
            }
            charIndex++;
        } while (charIndex < text.length());
        System.out.println("Found 'a' at index: " + charIndex);
        System.out.println();

        // TODO 8: Countdown Timer
        System.out.println("TODO 8: Countdown timer");
        int timer = 5;
        do {
            System.out.println(timer);
            timer--;
        } while (timer > 0);
        System.out.println("Go!");
        System.out.println();

        // TODO 9: Password Attempts
        System.out.println("TODO 9: Password attempts simulation");
        String correctPassword = "secret123";
        String enteredPassword = "wrong"; // Start with wrong password
        int attemptCount = 0;
        int maxAttempts = 3;
        do {
            attemptCount++;
            System.out.println("Attempt " + attemptCount + ": entered = " + enteredPassword);
            if (attemptCount == 3) {
                enteredPassword = correctPassword; // berhasil di percobaan ke-3
            }
        } while (!enteredPassword.equals(correctPassword) && attemptCount < maxAttempts);
        if (enteredPassword.equals(correctPassword)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied. Max attempts reached.");
        }
        System.out.println();

        // TODO 10: Game Level Completion
        System.out.println("TODO 10: Game level completion");
        int currentLevel = 1;
        int targetLevel = 5;
        do {
            System.out.println("Completing level " + currentLevel);
            currentLevel++;
        } while (currentLevel <= targetLevel);
        System.out.println("All levels completed!");
    }
}

