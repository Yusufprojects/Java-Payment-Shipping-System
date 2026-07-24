public class DigitalDelivery implements ITrackable {
    String digitalCode;

    public DigitalDelivery(String digitalCode) {
        this.digitalCode = digitalCode;
    }

    @Override
    public void trackStatus() {
        System.out.println("[DIGITAL DELIVERY] Code sent to your email address: " + this.digitalCode);
    }
}