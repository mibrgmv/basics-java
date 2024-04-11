import java.sql.Statement;

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
}