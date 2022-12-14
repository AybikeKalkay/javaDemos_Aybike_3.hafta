public class Product {

  public Product(int i, String laptop, String asus_laptop, int i1, int i2){ //parametresiz constructor
        //System.out.println("Yapıcı blok çalıştı.");
   }
    public Product (int id, String name, String description, double price, int stockAmount, String kod){
      this.id = id;
      this.name = name;
      this.description = description;
      this.price = price;
      this.stockAmount = stockAmount;
      this.kod = kod;

    }
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    private String kod;

    public String getKod() {
        return this.name.substring(0,1) + id;
    }


// Private means that it is valid in block it described.
    //id'ler karıştığı için this. yaparak içinde bulunduğumuz calssı kasdettiğimizi söylüyoruz.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
