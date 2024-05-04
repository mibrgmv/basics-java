package lab2;

public class TechnicalItem extends GenericItem {

    short warrantyTime;

    public TechnicalItem(String name, float price, short warrantyTime) {
        super(name, price, Category.TECHNICAL);
        this.warrantyTime = warrantyTime;
    }

    @Override
    void printAll(){
        System.out.printf("ID: %d , Name: %s , price: %5.2f , Category: %s , Warranty time: %d\n", ID, name, price, category, warrantyTime);
    }
}
