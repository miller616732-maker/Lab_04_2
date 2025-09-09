import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
    int salesPrice;
    Scanner Scan = new Scanner (System.in);
    double salesTax = 0.05;
    System.out.println("Please enter the cost of your items.");
    salesPrice = Scan.nextInt();
    double totalTaxed = salesPrice * salesTax;
    double totalPrice = salesPrice + totalTaxed;
    System.out.println("Your total cost is " + "$" + totalPrice);
    }
}