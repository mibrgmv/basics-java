package lab2;

import java.time.LocalDate;

public class Lab2 {
    public static void main(String[] args) {
        var apple= new GenericItem(1, "Apple", 12, Category.FOOD);
        var dress = new GenericItem(2, "Dress", 150, Category.DRESS);
        var screw = new GenericItem(3, "Screw", 1.5f);

        var milk = new FoodItem(4, "Milk", 15f, LocalDate.of(2024, 4, 27), (short) 7);
        var mobilePhone = new TechnicalItem(5, "Mobile phone", 500, (short) 365);

        GenericItem[] items = {apple, dress, screw, milk, mobilePhone};
        for (var item : items) {
            item.printAll();
        }
    }
}
