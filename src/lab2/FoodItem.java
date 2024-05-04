package lab2;

import java.time.LocalDate;

public class FoodItem extends GenericItem {

    LocalDate dateOfIncome;
    short expires;

    public FoodItem (String name) {
        super(name);
        this.category = Category.FOOD;
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
        System.out.printf("ID: %d , Name: %s , price: %5.2f , Category: %s , Date of income: %s, Expires: %d \n", ID, name, price, category, dateOfIncome, expires);
    }
}
