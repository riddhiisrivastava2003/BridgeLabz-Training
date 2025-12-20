import java.util.Scanner;

public class TheCoffeeCounterChronicles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double GST_RATE = 0.05;

        while (true) {
            System.out.println("\nWelcome to Ravi's Cafe ☕");
            System.out.println("1. Espresso - INR 150");
            System.out.println("2. Latte - INR 200");
            System.out.println("3. Americano - INR 100");
            System.out.println("4. Cappuccino - INR 150");

            System.out.print("Enter coffee type (1/2/3/4) or exit: ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("exit")) {
                break;
            }

            double price;

            switch (choice) {
                case "1":
                    price = 150;
                    break;
                case "2":
                    price = 200;
                    break;
                case "3":
                    price = 100;
                    break;
                case "4":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double total = price * quantity;
            double gst = total * GST_RATE;
            double finalAmount = total + gst;

            System.out.println("Total Bill: INR " + total);
            System.out.println("GST (5%): INR " + gst);
            System.out.println("Final Amount: INR " + finalAmount);
            System.out.println("Thanks For Visiting");
        }

        sc.close();
    }
}
