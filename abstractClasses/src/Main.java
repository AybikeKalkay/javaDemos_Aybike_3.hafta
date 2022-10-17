public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        // An abstract class can be used when developer wants to hide base class.

//        GameCalculator gameCalculator = new GameCalculator() {
//            @Override
//            public void calculate() {
//
//            }
//        }
        GameCalculator gameCalculator = new WomanGameCalculator();
        // An abstract class cannot be created as an instance.
        // Compulsory operations can be added via abstract classes.

    }
}