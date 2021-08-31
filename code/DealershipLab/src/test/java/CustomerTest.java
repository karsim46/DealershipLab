import Person.Customer;
import Person.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

Customer customer;

    @Before
    public void before(){
        customer = new Customer(1000.00,"Dodgy Simon");

    }

    @Test
    public void customerHasName(){
        assertEquals("Dodgy Simon", customer.getName());
    }

}
