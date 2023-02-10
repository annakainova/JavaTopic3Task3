public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("Payment if loanPeriod 1 year");
        System.out.println(service.calculate(1_000_000, 12, 9.99));
        System.out.println();
        System.out.println("Payment if loanPeriod 2 years");
        System.out.println(service.calculate(1_000_000, 24, 9.99));
        System.out.println();
        System.out.println("Payment if loanPeriod 3 years");
        System.out.println(service.calculate(1_000_000, 36, 9.99));
    }
}