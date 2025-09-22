
public class ElseStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== IF-ELSE STATEMENT EXERCISES ===\n");

        // TODO 1: Age Check
        int age = 16;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // TODO 2: Temperature Check
        double temperature = 22.5;
        if (temperature > 25) {
            System.out.println("Hot weather");
        } else {
            System.out.println("Cool weather");
        }

        // TODO 3: Password Validation
        String password = "abc123";
        if (password.length() >= 8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Password too short");
        }

        // TODO 4: Number Check
        int number = -5;
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }

        // TODO 5: Grade Evaluation
        int grade = 65;
        if (grade >= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // TODO 6: Array Size Check
        String[] colors = {"red", "blue", "green"};
        if (colors.length > 5) {
            System.out.println("Large array");
        } else {
            System.out.println("Small array");
        }

        // TODO 7: String Comparison
        String name = "User";
        if (name.equals("Admin")) {
            System.out.println("Welcome Admin!");
        } else {
            System.out.println("Regular user");
        }

        // TODO 8: Boolean Check
        boolean isOnline = false;
        if (isOnline) {
            System.out.println("User is online");
        } else {
            System.out.println("User is offline");
        }

        // TODO 9: Score Category
        int score = 75;
        if (score >= 80) {
            System.out.println("Excellent");
        } else {
            System.out.println("Needs improvement");
        }

        // TODO 10: Discount Eligibility
        double purchaseAmount = 85.50;
        if (purchaseAmount >= 100) {
            System.out.println("Eligible for discount");
        } else {
            System.out.println("No discount available");
        }
    }
}

