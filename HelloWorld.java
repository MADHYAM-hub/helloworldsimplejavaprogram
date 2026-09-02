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

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

       scanner.nextLine();

String again = "yes";

while (again.equalsIgnoreCase("yes")) {
    System.out.println("MADHYAM Greeting: Hello, " + name + "!");
    System.out.print("Would you like another MADHYAM greeting? (yes/no): ");
    again = scanner.nextLine();
}

scanner.close();
    }
}