public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getAgeStatus() {
        if (age >= 18) {
            return "You are an adult.";
        } else {
            return "You are a minor.";
        }
    }

    public void showGreeting() {
        System.out.println("MADHYAM Greeting: Hello, " + name + "!");
    }
}