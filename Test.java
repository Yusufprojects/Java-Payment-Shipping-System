public class Test {
    public static void main(String[] args) {

        System.out.println("=== 1. PAYMENT SYSTEM (Abstract Class / Polymorphism) ===");

        PaymentMethod creditCard = new CreditPayment(1500.0, "TR-101", "4543-XXXX-XXXX-1234");
        PaymentMethod crypto = new CryptoPayment(2500.5, "TR-102", "0x71C...39A");

        PaymentMethod[] payments = {creditCard, crypto};

        for (PaymentMethod payment : payments) {
            payment.logTransaction();
            payment.processPayment();
            System.out.println();
        }

        System.out.println("=== 2. SHIPPING & TRACKING SYSTEM (Interface / Polymorphism) ===");

        ITrackable expressCargo = new ExpressShipment("EXPRESS-987");
        ITrackable digitalCode = new DigitalDelivery("STEAM-GAME-KEY-882");

        ITrackable[] trackables = {expressCargo, digitalCode};

        for (ITrackable trackable : trackables) {
            trackable.trackStatus();
        }
    }
}
