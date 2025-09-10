import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempF;
        double tempC;
        System.out.println("Please enter the weather in fahrenheit");
        tempF = scan.nextDouble();
        tempC = (tempF-32) * 5/9;
        System.out.println("It is " + tempC + " degrees in Celsius.");
    }
}
