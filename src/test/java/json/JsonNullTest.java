package json;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Edited by Andrii_Khoma on 17/12/2017.
 */
public class JsonNullTest {
    @Test
    public void testToJson() {
        JsonNull jsonNull = new JsonNull();
        assertEquals("null", jsonNull.toJson());
    }
}