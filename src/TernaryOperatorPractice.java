public class TernaryOperatorPractice {
    public static void main(String[] args) {
        System.out.println("=== TERNARY OPERATOR EXERCISES ===\n");

        // TODO 1: Age Status
        int age = 20;
        String ageStatus = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age status: " + ageStatus);

        // TODO 2: Number Sign
        int number = -5;
        String numberSign = (number > 0) ? "Positive" : "Non-positive";
        System.out.println("Number sign: " + numberSign);

        // TODO 3: Grade Pass/Fail
        int score = 85;
        String result = (score >= 70) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        // TODO 4: Temperature Description
        double temperature = 22.5;
        String tempDesc = (temperature > 25) ? "Hot" : "Cool";
        System.out.println("Temperature: " + tempDesc);

        // TODO 5: Even or Odd
        int num = 15;
        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + evenOdd);

        // TODO 6: Discount Eligibility
        double purchaseAmount = 150.0;
        double discount = (purchaseAmount >= 100) ? 10 : 0;
        System.out.println("Discount: $" + discount);

        // TODO 7: String Length Check
        String text = "Hello World";
        String lengthStatus = (text.length() > 5) ? "Long" : "Short";
        System.out.println("String length: " + lengthStatus);

        // TODO 8: Maximum of Two Numbers
        int a = 25;
        int b = 30;
        int maximum = (a > b) ? a : b;
        System.out.println("Maximum: " + maximum);

        // TODO 9: Absolute Value
        int value = -42;
        int absoluteValue = (value >= 0) ? value : -value;
        System.out.println("Absolute value: " + absoluteValue);

        // TODO 10: Nested Ternary
        int examScore = 88;
        String grade = (examScore >= 90) ? "A" : (examScore >= 80) ? "B" : "C";
        System.out.println("Grade: " + grade);

        // TODO 11: Boolean to String
        boolean isActive = true;
        String activeStatus = (isActive) ? "Yes" : "No";
        System.out.println("Active: " + activeStatus);

        // TODO 12: Minimum of Three Numbers
        int x = 15, y = 8, z = 12;
        int minimum = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);
        System.out.println("Minimum: " + minimum);
    }
}

