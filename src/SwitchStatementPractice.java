public class SwitchStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== SWITCH STATEMENT EXERCISES ===\n");

        // TODO 1: Day of Week
        int dayNumber = 3;
        switch (dayNumber) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day");
        }

        // TODO 2: Grade to GPA
        char letterGrade = 'B';
        switch (letterGrade) {
            case 'A': System.out.println("4.0 GPA"); break;
            case 'B': System.out.println("3.0 GPA"); break;
            case 'C': System.out.println("2.0 GPA"); break;
            case 'D': System.out.println("1.0 GPA"); break;
            case 'F': System.out.println("0.0 GPA"); break;
            default: System.out.println("Invalid grade");
        }

        // TODO 3: Month Days
        int month = 4;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days"); break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days"); break;
            case 2:
                System.out.println("28 or 29 days"); break;
            default:
                System.out.println("Invalid month");
        }

        // TODO 4: Traffic Light Action
        String trafficLight = "yellow";
        switch (trafficLight) {
            case "red": System.out.println("Stop and wait"); break;
            case "yellow": System.out.println("Prepare to stop"); break;
            case "green": System.out.println("Go safely"); break;
            default: System.out.println("Invalid signal");
        }

        // TODO 5: Calculator Operations
        char operation = '*';
        switch (operation) {
            case '+': System.out.println("Addition operation"); break;
            case '-': System.out.println("Subtraction operation"); break;
            case '*': System.out.println("Multiplication operation"); break;
            case '/': System.out.println("Division operation"); break;
            default: System.out.println("Unknown operation");
        }

        // TODO 6: Season by Month
        int seasonMonth = 7;
        switch (seasonMonth) {
            case 12: case 1: case 2:
                System.out.println("Winter"); break;
            case 3: case 4: case 5:
                System.out.println("Spring"); break;
            case 6: case 7: case 8:
                System.out.println("Summer"); break;
            case 9: case 10: case 11:
                System.out.println("Fall"); break;
            default:
                System.out.println("Invalid month");
        }

        // TODO 7: Exam Grade Range
        int examScore = 85;
        switch (examScore / 10) {
            case 10: case 9: System.out.println("Excellent"); break;
            case 8: System.out.println("Very good"); break;
            case 7: System.out.println("Good"); break;
            case 6: System.out.println("Satisfactory"); break;
            default: System.out.println("Needs improvement");
        }

        // TODO 8: Browser Type
        String browser = "chrome";
        switch (browser) {
            case "chrome": System.out.println("Google Chrome browser"); break;
            case "firefox": System.out.println("Mozilla Firefox browser"); break;
            case "safari": System.out.println("Apple Safari browser"); break;
            case "edge": System.out.println("Microsoft Edge browser"); break;
            default: System.out.println("Unknown browser");
        }

        // TODO 9: Priority Level
        int priority = 2;
        switch (priority) {
            case 1: System.out.println("Critical priority"); break;
            case 2: System.out.println("High priority"); break;
            case 3: System.out.println("Medium priority"); break;
            case 4: System.out.println("Low priority"); break;
            default: System.out.println("Invalid priority");
        }

        // TODO 10: File Extension
        String fileExtension = "png";
        switch (fileExtension) {
            case "jpg": case "png": case "gif":
                System.out.println("Image file"); break;
            case "mp4": case "avi": case "mkv":
                System.out.println("Video file"); break;
            case "txt": case "doc": case "pdf":
                System.out.println("Document file"); break;
            default:
                System.out.println("Unknown file type");
        }
    }
}
