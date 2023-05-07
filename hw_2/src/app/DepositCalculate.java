package app;

public class DepositCalculate {


    public static void main(String[] args) {

        double deposit = Double.parseDouble(args[0]);
        double interestRate = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);

        for (int i = 1; i <= years; i++) {
            for (int j = 0; j < 12; j++) {
                double interest = deposit * (interestRate / 100 / 12);
                deposit += interest;
            }
            System.out.println("Year " + i + ": Accumulated amount = " + deposit + ", Accrued interest = " +
                    (deposit - Double.parseDouble(args[0])));
        }
    }
}



