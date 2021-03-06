package pl.jszk.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void allowAssignLimitToCard() {
        CreditCard card = new CreditCard();

        card.assignLimit(2000);

        Assert.assertTrue(card.getLimit() == 2000);
    }

    @Test
    public void cantWithdrawWhenCantAfford() {

    }
    
    @Test
    public void cantWithdrawWhenOverTheLimit() throws Exception {
        CreditCard card = new CreditCard();
        card.assignLimit(50);
        boolean withdrawSuccess = card.withdraw(100);
        Assert.assertFalse(withdrawSuccess);
    }
    
    @Test
    public void canWithdrawWhenInLimit() {
        CreditCard card = new CreditCard();
        card.assignLimit(500);
        Assert.assertTrue(card.withdraw(300));
    }
    
    @Test
    public void canBlockCard() {
        CreditCard card = new CreditCard();
        
        card.block();
        
        Assert.assertTrue(card.isBlocked());
    }
}