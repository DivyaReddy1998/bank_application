public class Main {
    public static void main(String[] args) {
        SBI.rateOfInterest=7;

        SBI account1 = new SBI(100000, "123", "Divya");
        SBI account2 = new SBI(500000, "12345", "SaiKumar");

        int checkingBalance = account1.checkBalance("123");
        System.out.println(checkingBalance);

        String addingAmount= account1.addMoney(50000);
        System.out.println(addingAmount);

        String withdrawnMoney = account2.withdrawAmount(100000, "12345");
        System.out.println(withdrawnMoney);

        int balanceChecking = account2.checkBalance("12345");
        System.out.println(balanceChecking);

        double interestCalculation = account2.rateOfTotalInterest(20, "123");
        System.out.println(interestCalculation);
    }
}