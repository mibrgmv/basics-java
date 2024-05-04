package lab2;

public class GenericItem {

    static int currentID = 1;
    public int ID;
    public String name;
    public float price;
    public Category category;

    public GenericItem() {
    }

    public GenericItem(String name) {
        this.name = name;
    }

    public GenericItem(String name, float price) {
        this.ID = currentID++;
        this.name = name;
        this.price = price;
        this.category = Category.GENERAL;
    }

    public GenericItem(String name, float price, Category category) {
        this.ID = currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void printAll(){
        System.out.printf("ID: %d , Name: %s , price: %5.2f , Category: %s\n", ID, name, price, category);
    }
}
