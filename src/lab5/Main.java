package lab5;

public class Main {

    public static void main(String[] args) {
        var product = ProductDB.findById(4);
        System.out.println(product.getName() + " " + product.getPrice() + '\n');

        var arr = ProductDB.findAll();
        for (Product p: arr) {
            System.out.println(p.getName());
        }
    }
}
