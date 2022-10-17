public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Saving a costumer to the database
        // It is important to code according to different type of database language.

        CustomerManager customerManager = new CustomerManager();
       // customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}