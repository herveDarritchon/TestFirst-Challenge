import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Hervé Darritchon
 * Date: 20/02/2014
 * Time: 22:02
 * To change this template use File | Settings | File Templates.
 */
public class SheetTest {

    @Test
    public void testThatCellsAreEmptyByDefault() {
        Sheet sheet = new Sheet();
        assertEquals("", sheet.get("A1"));
        assertEquals("", sheet.get("ZX347"));
    }
}
