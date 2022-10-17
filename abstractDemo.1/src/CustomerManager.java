public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();

//        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//        oracleDatabaseManager.getData();
        // If developer codes like above, the program will depend on Oracle.


    }
}
