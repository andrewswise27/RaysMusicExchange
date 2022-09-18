import org.junit.Before;
import org.junit.Test;
import products.InstrumentType;
import products.Trumpet;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Gold", "Yamaha", "Brass", InstrumentType.BRASS, 100.00, 320.00,3);
    }

    @Test
    public void trumpetHasISell(){
        assertEquals(220.00, trumpet.markUp(), 0.00);
    }

    @Test
    public void trumpetHasEnumType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }
}
