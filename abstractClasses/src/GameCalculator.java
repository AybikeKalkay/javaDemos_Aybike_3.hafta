public abstract class GameCalculator {

    public abstract void calculate();
    //This kind of usage means that
    // no need to determine the abstract code in this class, but each classes inheriting this class have to specify its own calculate code.
    public final void gameOver(){
        System.out.println("Game over.");
    }
}
