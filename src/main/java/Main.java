import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Person person;

        List<String> foods = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age: ");
        Integer age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter three of your favorite foods: ");
        String foodOne = scanner.nextLine();
        String foodTwo = scanner.nextLine();
        String foodThree = scanner.nextLine();

        foods.add(foodOne);
        foods.add(foodTwo);
        foods.add(foodThree);

        person = new Person(firstName, lastName, age, foods);
        Person secondPerson = person;

        System.out.println(checkIfSamePerson(person, secondPerson));

        System.out.println(person);
    }

    public static boolean checkIfSamePerson(Person person1, Person person2){

        return person1.equals(person2);
    }
}
