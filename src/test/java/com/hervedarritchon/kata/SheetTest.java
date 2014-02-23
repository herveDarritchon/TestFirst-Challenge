package com.hervedarritchon.kata;

import org.junit.Before;
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

    private Sheet sheet;

    @Before
    public void initialize() {
        sheet = new Sheet();
    }

    @Test
    public void testThatCellsAreEmptyByDefault() {
        assertEquals("", sheet.get("A1"));
        assertEquals("", sheet.get("ZX347"));
    }

    @Test
    public void testThatTextCellsAreStored() {
        String theCell = "A21";

        sheet.put(theCell, "A string");
        assertEquals("A string", sheet.get(theCell));

        sheet.put(theCell, "A different string");
        assertEquals("A different string", sheet.get(theCell));

        sheet.put(theCell, "");
        assertEquals("", sheet.get(theCell));
    }


}
