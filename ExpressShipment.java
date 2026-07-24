public class ExpressShipment implements ITrackable {
    String trackingCode;

    public ExpressShipment(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    @Override
    public void trackStatus() {
        System.out.println("[EXPRESS SHIPMENT] Package with code " + this.trackingCode + " is on the way.");
    }
}