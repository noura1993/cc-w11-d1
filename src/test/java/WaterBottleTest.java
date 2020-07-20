import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void before() {
        this.waterBottle = new WaterBottle();
    }

    @Test
    public void drink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void empty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fill() {
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
