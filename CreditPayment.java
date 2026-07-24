public class CreditPayment extends PaymentMethod {
    String cardNumber;

    public CreditPayment(double amount, String transactionID, String cardNumber) {
        super(amount, transactionID);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("[CREDIT CARD] Payment of $" + amount + " charged to card " + cardNumber + ".");
    }
}