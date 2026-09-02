import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("Welcome to the MADHYAM Java learning journey!");
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

        String ageStatus = getAgeStatus(age);
        System.out.println(ageStatus);

        String[] madhyamMessages = {
            "Truth",
            "Balance",
            "Purpose",
            "Humanity"
        };

        for (int i = 0; i < madhyamMessages.length; i++) {
            System.out.println("MADHYAM Principle #" + (i + 1) + ": " + madhyamMessages[i]);
        }

        scanner.nextLine();

        String again = "yes";

        while (again.equalsIgnoreCase("yes")) {
            showGreeting(name);
            System.out.print("Would you like another MADHYAM greeting? (yes/no): ");
            again = scanner.nextLine();
        }

        scanner.close();
    }

    public static void showGreeting(String name) {
        System.out.println("MADHYAM Greeting: Hello, " + name + "!");
    }

    public static String getAgeStatus(int age) {
        if (age >= 18) {
            return "You are an adult.";
        } else {
            return "You are a minor.";
        }
    }
}