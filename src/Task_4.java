public class Task_4 {
    public static void main(String[] args) {
        int initialDebt = 5000;
        double yourInterest = 0.17;
        double yourFirstInterest;
        double yourFirstDebt;
        double yourSecondInterest;
        double yourSecondDebt;
        yourFirstInterest = initialDebt * yourInterest;
        yourFirstDebt = yourFirstInterest + initialDebt;
        yourSecondInterest = yourFirstDebt * yourInterest;
        yourSecondDebt = yourSecondInterest + yourFirstDebt;
        System.out.println("You will have a debt of " + yourFirstDebt + " and " + yourSecondDebt + " after 2 months.");

    }
}
