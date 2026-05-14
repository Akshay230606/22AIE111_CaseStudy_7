public class Payment {

    private int paymentID;
    private double amount;
    private boolean paymentStatus;

    public Payment(int _paymentId, double _amount) {
        this.paymentID = _paymentId;
        this.amount = _amount;
        this.paymentStatus = false;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public boolean getPaymentStatus() {
        return paymentStatus;
    }

    public boolean verifyPayment(double cartTotal) {

        if (amount > 0 && amount == cartTotal) {
            return true;
        }

        return false;
    }

    public boolean processPayment(double cartTotal) {

        if (verifyPayment(cartTotal)) {

            paymentStatus = true;
            return true;
        }

        paymentStatus = false;
        return false;
    }
}