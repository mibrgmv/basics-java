public class Main {
    public static void main(String[] args) {
        int id = ProductDB.add(new Product("TV", 1200.50));
        System.out.println(String.format("PRODUCT ID: %s", id));
    }
}
