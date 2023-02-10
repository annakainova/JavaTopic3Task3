import java.lang.Math;

public class CreditPaymentService {

    public int calculate(double loanSum, int loanPeriodInMonths, double rate) {
        double monthRate = rate / (100 * 12);
        int payment = (int) (loanSum * ((monthRate * Math.pow((1 + monthRate), loanPeriodInMonths))
                / (Math.pow((1 + monthRate), loanPeriodInMonths) - 1)));
        return payment;
    }
}
