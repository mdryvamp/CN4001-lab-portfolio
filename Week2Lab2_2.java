
import java.util.Scanner;

public class Week2Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Age :");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name :");
        String name = scanner.nextLine();

        if (age < 0 || age > 120) {
            System.out.println("Invalid age: " + age);
        } else if (age < 5) {
            System.out.println(name + " : ticket free");
        } else if (age <= 17) {
            System.out.println(name + " : 5$ ticket");
        } else if (age <= 64) {
            System.out.println(name + " : 10$ ticket");
        } else {
            System.out.println(name + " : 6$ ticket");
        }
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);

        scanner.close();
    }
}