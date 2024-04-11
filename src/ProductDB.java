import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    public static void createTable() {
        var sql = "CREATE TABLE IF NOT EXISTS products(" +
                "    id SERIAL PRIMARY KEY," +
                "    name VARCHAR(255) NOT NULL," +
                "    price DECIMAL(10, 2) NOT NULL" +
                ");";

        try (var conn = Database.connect();
             var stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int add(Product product) {
        var sql = "INSERT INTO products(name, price) "
                + "VALUES(?,?)";

        try (var conn =  Database.connect();
             var pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, product.getName());
            pstmt.setDouble(2, product.getPrice());

            int insertedRow = pstmt.executeUpdate();
            if (insertedRow > 0) {
                var rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public static Product findById(int id){
        var sql = "SELECT id, name, price FROM products WHERE id=?";

        try (var conn =  Database.connect();
             var pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            var rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price")
                );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static List<Product> findAll() {
        var products = new ArrayList<Product>();

        var sql = "SELECT id, name, price FROM products ORDER BY id";

        try (var conn =  Database.connect();
             var stmt = conn.createStatement()) {

            var rs = stmt.executeQuery(sql);

            while (rs.next()) {
                var product = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"));
                products.add(product);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

}