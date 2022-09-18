import org.junit.Before;
import org.junit.Test;
import products.InstrumentType;
import products.Trombone;
import products.Trumpet;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Trumpet trumpet;
    Trombone trombone;

    @Before
    public void before(){
        musicShop = new MusicShop(1000.00);
        trumpet = new Trumpet("Gold", "Yamaha", "Brass", InstrumentType.BRASS, 100.00, 320.00,3);
        trombone = new Trombone("Gold", "Yahama", "Brass", InstrumentType.BRASS, 200.00, 600.00, 25);
        musicShop.buyStock(trombone);
    }

    @Test
    public void stockStartsWithOne(){
        assertEquals(1, musicShop.getStock());
    }

    @Test
    public void canBuyInstrument(){
        musicShop.buyStock(trumpet);
        assertEquals(2, musicShop.getStock());
    }

    @Test
    public void buyingInstrumentTakesMoneyFromTill(){
        musicShop.buyStock(trumpet);
        assertEquals(700.00, musicShop.getTill(),0.0);
    }

    @Test
    public void canOnlySellItemsInStock(){
        musicShop.sellStock(trumpet);
        assertEquals(800.00, musicShop.getTill(), 0.00);
    }

    @Test
    public void canRemoveInstrumentFromStock(){
        musicShop.sellStock(trombone);
        assertEquals(0, musicShop.getStock());
    }

    @Test
    public void sellingAddsMoneyToTill(){
        musicShop.sellStock(trombone);
        assertEquals(1400.00, musicShop.getTill(), 0.00);
    }
}
