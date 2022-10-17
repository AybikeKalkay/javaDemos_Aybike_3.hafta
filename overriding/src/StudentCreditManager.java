public class StudentCreditManager extends BaseCreditManager {

    public double calculate(double amount){
        return amount*1.10;
    }
    //When we type exactly same code with the calculation operation in BaseCreditManager; the system runs this code that is in related class.
    //This code overrides the code that is in the BaseCreditManager. #overriding
}
