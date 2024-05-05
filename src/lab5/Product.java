package lab5;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price){
        this(name,price);
        this.id = id;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public double getPrice() { return price; }
}
