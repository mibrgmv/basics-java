public class Main {
    public static void main(String[] args) {
        var p = ProductDB.findById(1);
        System.out.println(p.getName());
    }
}
