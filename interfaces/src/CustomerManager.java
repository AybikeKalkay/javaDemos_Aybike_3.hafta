public class CustomerManager {

    private ICustomerDal customerDal; //This line can be forgotten by developer. It doesn't throw any notification about the error until the program is run.

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    public void add(){
        // domain codes will be written.
        // OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); If codes are written like this, it means that there is a high dependency for Oracle.
        customerDal.add();


    }
}
