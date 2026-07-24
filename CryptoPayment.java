public class CryptoPayment extends PaymentMethod {
    String walletAddress;

    public CryptoPayment(double amount, String transactionID, String walletAddress) {
        super(amount, transactionID);
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("[CRYPTO] Payment of $" + amount + " transferred from wallet " + walletAddress + ".");
    }
}
