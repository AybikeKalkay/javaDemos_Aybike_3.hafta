public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
//        customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();


    }
}