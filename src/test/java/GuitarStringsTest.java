import org.junit.Before;
import org.junit.Test;
import stock.accessory.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before public void setup(){
        guitarStrings = new GuitarStrings("Accessory",10,11);
    }

    @Test public void hasDesc(){
        assertEquals("Pack of 6 guitar strings", guitarStrings.getDescription());
    }
}
