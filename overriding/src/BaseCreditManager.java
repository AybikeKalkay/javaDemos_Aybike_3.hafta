public class BaseCreditManager {
    public final double calculate(double amount) {
        return amount * 1.18;
    }

    // For each methods in this class are overridable as long as developer don't assert the contrary.
    // To assert the contrary, 'final' keyword must be used.
}
