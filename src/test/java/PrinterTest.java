import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(50, 100);
    }

    @Test
    public void canPrint() {
        printer.print(10, 4);
        assertEquals(10, printer.getSheets());
        assertEquals(60, printer.getTonerVolume());
    }

    @Test
    public void cannotPrintNoSufficientSheets() {
        printer.print(10, 6);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void cannotPrintNoSufficientToner() {
        printer.print(15, 10);
        assertEquals(100, printer.getTonerVolume());
    }
}
