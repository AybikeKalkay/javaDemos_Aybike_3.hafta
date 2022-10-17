public class ProductManager {// It is the object adding the product to the database.
    public void add(Product product){
       // ProductValidator validator = new ProductValidator();
        if(ProductValidator.isValid(product)){
            System.out.println("The product was added.");
        }else{
            System.out.println("The product information is invalid.");
        }


    }
}
