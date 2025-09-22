
public class ElseIfStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== ELSE IF STATEMENT EXERCISES ===\n");

        // TODO 1: Grade Classification
        int score = 85;
        if (score >= 90) {
            System.out.println("A grade");
        } else if (score >= 80) {
            System.out.println("B grade");
        } else if (score >= 70) {
            System.out.println("C grade");
        } else {
            System.out.println("F grade");
        }

        // TODO 2: Age Category
        int age = 25;
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else if (age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        // TODO 3: Temperature Description
        double temperature = 18.5;
        if (temperature > 35) {
            System.out.println("Very hot");
        } else if (temperature > 25) {
            System.out.println("Hot");
        } else if (temperature > 15) {
            System.out.println("Warm");
        } else if (temperature > 5) {
            System.out.println("Cool");
        } else {
            System.out.println("Cold");
        }

        // TODO 4: BMI Classification
        double bmi = 22.5;
        if (bmi >= 30) {
            System.out.println("Obese");
        } else if (bmi >= 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }

        // TODO 5: Day Type
        int day = 3; // 1=Sunday, 2=Monday, etc.
        if (day == 1 || day == 7) {
            System.out.println("Weekend");
        } else if (day >= 2 && day <= 6) {
            System.out.println("Weekday");
        } else {
            System.out.println("Invalid day");
        }

        // TODO 6: Traffic Light
        String lightColor = "yellow";
        if (lightColor.equals("red")) {
            System.out.println("Stop");
        } else if (lightColor.equals("yellow")) {
            System.out.println("Caution");
        } else if (lightColor.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color");
        }

        // TODO 7: Discount Rate
        double purchaseAmount = 750.0;
        if (purchaseAmount >= 1000) {
            System.out.println("20% discount");
        } else if (purchaseAmount >= 500) {
            System.out.println("10% discount");
        } else if (purchaseAmount >= 100) {
            System.out.println("5% discount");
        } else {
            System.out.println("No discount");
        }

        // TODO 8: Speed Category
        int speed = 95;
        if (speed > 120) {
            System.out.println("Very fast");
        } else if (speed > 80) {
            System.out.println("Fast");
        } else if (speed > 50) {
            System.out.println("Moderate");
        } else if (speed > 0) {
            System.out.println("Slow");
        } else {
            System.out.println("Stopped");
        }

        // TODO 9: Password Strength
        String password = "mypassword";
        if (password.length() >= 12) {
            System.out.println("Very strong");
        } else if (password.length() >= 8) {
            System.out.println("Strong");
        } else if (password.length() >= 6) {
            System.out.println("Moderate");
        } else {
            System.out.println("Weak");
        }

        // TODO 10: Student Performance
        int studentScore = 88;
        int attendance = 90;
        if (studentScore >= 90 && attendance >= 95) {
            System.out.println("Excellent");
        } else if (studentScore >= 80 && attendance >= 85) {
            System.out.println("Good");
        } else if (studentScore >= 70 && attendance >= 75) {
            System.out.println("Satisfactory");
        } else {
            System.out.println("Needs improvement");
        }
    }
}
