import java.util.Scanner;
import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        Person person = new Person(name, age);

        System.out.println("Welcome to the MADHYAM Java learning journey!");
        System.out.println("Hello, " + person.name + "!");
        System.out.println("You are " + person.age + " years old.");

        System.out.println(person.getAgeStatus());

        ArrayList<String> madhyamMessages = new ArrayList<>();

        madhyamMessages.add("Truth");
        madhyamMessages.add("Balance");
        madhyamMessages.add("Purpose");
        madhyamMessages.add("Humanity");

        for (int i = 0; i < madhyamMessages.size(); i++) {
            System.out.println(
                "MADHYAM Principle #" + (i + 1) + ": " + madhyamMessages.get(i)
            );
        }

        scanner.nextLine();

        String again = "yes";

        while (again.equalsIgnoreCase("yes")) {
            person.showGreeting();

            System.out.print(
                "Would you like another MADHYAM greeting? (yes/no): "
            );

            again = scanner.nextLine();
        }

        scanner.close();
    }
}