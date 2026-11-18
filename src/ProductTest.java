import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public  void GetTotalProductsSold_WithValidData_ReturnsCorectValue() {
        Product p = new Product();
        assertEquals(153, p.GetTotalProductsSold());

    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product p = new Product();
        assertEquals(17.0, p.GetAverageProductsSold(), 0.001);
    }

}

