package ru.billing.stocklist;

import java.time.LocalDate;

public class FoodItem extends GenericItem {

    private LocalDate dateOfIncome;
    private short expires;

    public FoodItem(String name) {
        super(name);
        this.setCategory(Category.FOOD);
    }

    public FoodItem(String name, float price, short expires) {
        super(name, price, Category.FOOD);
        this.expires = expires;
    }

    public FoodItem(String name, float price, LocalDate dateOfIncome, short expires) {
        super(name, price, Category.FOOD);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    @Override
    public void printAll(){
        System.out.printf("ID: %d , Name: %s , price: %5.2f , Category: %s , Date of income: %s, Expires: %d \n", getID(), getName(), getPrice(), getCategory(), dateOfIncome, expires);
    }
}
