public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double requested, double available) {
        super("Insufficient funds! Requested: $" + requested + ", Available: $" + available);
    }
}
