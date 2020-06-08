import org.junit.Before;
import org.junit.Test;
import stock.instrument.Guitar;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest{

    Guitar guitar;

    @Before public void setup(){
        guitar = new Guitar("Guitar",100.00,110.00);
    }

    @Test
    public void hasType(){
        assertEquals("Guitar", guitar.itemType());
    }

    @Test public void boughtPrice(){
        assertEquals(100.00, guitar.getBuyPrice(),0.01);
    }

    @Test public void sellingPrice() {
        assertEquals(110.00, guitar.getSellPrice(), 0.01);
    }

    @Test public void hasPriceMarupPercentage(){
        assertEquals(10,guitar.getPercentageMarkup(), 0.01);
    }


    }

