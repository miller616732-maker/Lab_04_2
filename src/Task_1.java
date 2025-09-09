//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task_1 {
    public static void main(String[] args) {
        int intOperandA = 14;
        int intOperandB = 8;
        int intSum = intOperandA + intOperandB;;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandA;
        int intModulo = 12 % 8;
        double doubleOperandA = 14;
        double doubleOperandB = 8;
        double doubleSum;
        double doubleDifference;
        double doubleProduct;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo;
        System.out.println("The Sum of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The Difference of " + intOperandA + " and " + intOperandB + " is " +intDifference);
        System.out.println("The Product of " + intOperandA + " and " + intOperandB + " is " +intProduct);
        System.out.println("The Quotient of " + intOperandA + " and " + intOperandB + " is " +doubleQuotient);
        System.out.println("The Modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);
    }
}