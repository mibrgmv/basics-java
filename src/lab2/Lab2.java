package lab2;

import lab4.ru.billing.stocklist.Category;
import lab4.ru.billing.stocklist.FoodItem;
import lab4.ru.billing.stocklist.GenericItem;
import lab4.ru.billing.stocklist.TechnicalItem;

import java.time.LocalDate;

public class Lab2 {
    public static void main(String[] args) {
        var apple= new GenericItem("Apple", 12, Category.FOOD);
        var dress = new GenericItem("Dress", 150, Category.DRESS);
        var screw = new GenericItem("Screw", 1.5f);

        var milk = new FoodItem("Milk", 15f, LocalDate.of(2024, 4, 27), (short) 7);
        var mobilePhone = new TechnicalItem("Mobile phone", 500, (short) 365);

        GenericItem[] items = {apple, dress, screw, milk, mobilePhone};
        for (var item : items) {
            item.printAll();
        }
    }
}
