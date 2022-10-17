public class ProductValidator {
    // Product Validator: It is used for determining while an action is being performed, whether the product is proper according to the domain.

    static {
        System.out.println("Static constructor block has run.");
    }
    public ProductValidator() {
        System.out.println("Constructor method has run.");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }

        //public void birSey() { // Instance creation for related class must be done to get this method.
            // Because it is not a static method.
        }

        public static class BaskaBirClass {
            public static void delete(){

            }
        }

}
