package lab2;

public class GenericItem {
    public int ID;
    public String name;
    public float price;
    public Category category;

    public GenericItem(int ID, String name, float price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.category = Category.GENERAL;
    }

    public GenericItem(int ID, String name, float price, Category category) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void printAll(){
        System.out.printf("ID: %d , Name: %s , price: %5.2f , Category: %s\n", ID, name, price, category);
    }
}
