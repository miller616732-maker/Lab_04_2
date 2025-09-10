import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int fallCost;
    int winterCost;
    int springCost;
    int summerCost;
    int totalPrice;
    System.out.println("Please enter your maintenance costs for the summer.");
    summerCost = scan.nextInt();
    System.out.println("PlLease enter your maintenance costs for the fall");
    fallCost = scan.nextInt();
    System.out.println("Please enter your maintenance costs for the winter");
    winterCost = scan.nextInt();
    System.out.println("Please enter your maintenance costs for the spring");
    springCost = scan.nextInt();
    totalPrice = fallCost + springCost + summerCost + winterCost;
    System.out.println("Your total cost is $" + totalPrice);
    }
}
