package lab3;

import lab2.FoodItem;

public class WorkArray <T extends Number> {
    T[] arrNums;

    public WorkArray(T[] nums) {
        arrNums = nums;
    }

    public double sum(){
        double res = 0.0;
        for (T num : arrNums) {
            res += num.doubleValue();
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[3];

        for(int i = 0; i < floatArr.length; ++i){
            floatArr[i] = (float)(i + 1.37);
        }

        var intArray = new WorkArray(intArr);
        var floatArray = new WorkArray(floatArr);

        System.out.println(intArray.sum());
        System.out.println(floatArray.sum());

        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem product = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        product.printAll();
    }
}
