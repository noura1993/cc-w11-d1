import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(50);
    }

    @Test
    public void canPrint() {
        printer.print(10, 4);
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void cannotPrint() {
        printer.print(10, 6);
        assertEquals(50, printer.getSheets());
    }
}
