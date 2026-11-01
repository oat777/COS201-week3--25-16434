import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item price: ");
        double price = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        
        double totalCost = price * quantity;
        double vat = totalCost * 0.075;
        double grandTotal = totalCost + vat;
        
        System.out.println("Total Cost: " + totalCost);
        System.out.println("VAT (7.5%): " + vat);
        System.out.println("Grand Total: " + grandTotal);
        input.close();
    }
}