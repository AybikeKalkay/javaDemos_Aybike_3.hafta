public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Static is used for coding utility.

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price=10;
        product.name="Mouse";
        manager.add(product);

        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}