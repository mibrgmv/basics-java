package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {

    private short warrantyTime;

    public TechnicalItem(String name, float price, short warrantyTime) {
        super(name, price, Category.TECHNICAL);
        this.warrantyTime = warrantyTime;
    }

    @Override
    public void printAll(){
        System.out.printf("ID: %d , Name: %s , price: %5.2f , Category: %s , Warranty time: %d\n", getID(), getName(), getPrice(), getCategory(), warrantyTime);
    }
}
