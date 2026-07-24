public abstract class PaymentMethod {
    double amount;
    String transactionID;

    public PaymentMethod(double amount, String transactionID) {
        this.amount = amount;
        this.transactionID = transactionID;
    }

    public void logTransaction() {
        System.out.println("[LOG] Transaction " + this.transactionID + " recorded.");
    }

    public abstract void processPayment();
}