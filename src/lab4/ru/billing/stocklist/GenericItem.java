package lab4.ru.billing.stocklist;

public class GenericItem {

    private static int currentID = 1;
    private int ID;
    private String name;
    private float price;
    private Category category;

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

    public static int getCurrentID() {
        return currentID;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void printAll(){
        System.out.printf("ID: %d , Name: %s , price: %5.2f , Category: %s\n", ID, name, price, category);
    }
}
