
import java.util.Scanner;

public class Week2Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price: ");
        int price = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        if (price <= 0 || quantity <= 0) {
            System.out.println("Error: Price and quantity must be greater than zero.");
        } else {

        int intTotal = price * quantity;
        long longTotal = (long) price * quantity;

        System.out.println("int total: " + intTotal);
        System.out.println("long total: " + longTotal);
        }
        int exactTotal = Math.multiplyExact(price, quantity);

        scanner.close();
    
}
}
