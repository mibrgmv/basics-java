package lab2;

import java.time.LocalDate;

public class FoodItem extends GenericItem {

    LocalDate dateOfIncome;
    short expires;

    public FoodItem(int ID, String name, float price, LocalDate dateOfIncome, short expires) {
        super(ID, name, price, Category.FOOD);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    @Override
    void printAll(){
        System.out.printf("ID: %d , Name: %s , price: %5.2f , Category: %s , Date of income: %s, Expires: %d \n", ID, name, price, category, dateOfIncome, expires);
    }
}
