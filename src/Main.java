public class Main {
    public static void main(String[] args) {
        try (var con = Database.Connect()) {
            System.out.println("Successful Connection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
