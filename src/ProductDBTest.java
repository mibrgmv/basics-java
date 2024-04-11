import org.junit.Assert;
import org.junit.Test;

public class ProductDBTest {

    @Test
    public void findByIdTest() {
        var product1 = ProductDB.findById(1);
        var product2 = ProductDB.findById(100);

        Assert.assertEquals(product1.getName(), "TV");
        Assert.assertNull(product2);
    }

}