public class Week2Lab1_2 {
    public static void main(String[] args) {
        double wallet = 50.0;
        int milkQty = 2;
        double milkPrice = 1.75;
        int breadQty = 1;
        double breadPrice = 0.5;
        int cheeseQty = 3;
        double cheesePrice = 4.25;
        double total = (milkQty * milkPrice) + (breadQty * breadPrice) + (cheeseQty * cheesePrice);
        double remaining = wallet - total;
        System.out.println("total price: " + total);
        System.out.println("remaining in wallet: " + remaining);
    }
}
