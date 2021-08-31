import Person.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer("Areks DodgyMotors",1000.00);

    }

    @Test
    public void dealerHasName(){
        assertEquals("Areks DodgyMotors", dealer.getName());
    }

}
