import org.junit.Before;
import org.junit.Test;
import stock.instrument.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before public void setup(){
        guitar = new Guitar("Guitar",100,110);
    }

    @Test
    public void hasPlay(){
        assertEquals("Plucks the G-string", guitar.play());
    }
}
