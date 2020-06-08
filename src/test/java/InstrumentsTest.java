import org.junit.Before;
import org.junit.Test;
import stock.instrument.Guitar;

public class InstrumentsTest{

    Guitar guitar;

    @Before public void setup(){
        guitar = new Guitar();
    }

    @Test
    public void hasType(){
        assertEquals("Guitar", guitar.getType());
    }

    @Test public void boughtPrice(){
        assertEquals(234.56, guitar.getBuyPrice(),0.01);
    }

    @Test public void sellingPrice(){
        assertEquals(345.67, guitar.getSellPrice(),0.01);
    }

