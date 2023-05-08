package app.model;

/**
 * 
 */
public class Product implements Entity<Integer> {


    public Product() {
    }

    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    private Integer id;
    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    private String name;

    private double price;

    private int quantity;

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }


    public int getQuantity() {
        return this.quantity;
    }


    public void setName(String n) {
        this.name = n;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setQuantity(int q) {
        this.quantity = q;
    }

}