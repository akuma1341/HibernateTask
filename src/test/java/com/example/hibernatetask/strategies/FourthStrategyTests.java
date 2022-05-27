package com.example.hibernatetask.strategies;

import com.example.hibernatetask.strategies.fourth.entities.CreditCard;
import com.example.hibernatetask.strategies.fourth.repositories.BillingDetailsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class FourthStrategyTests {

    @Autowired
    private BillingDetailsRepository billingDetailsRepository;

    @Test
    void givenCreditCard_whenSaveAsBillingDetails_thenSaveSuccessful() {
        CreditCard creditCard = new CreditCard();
        creditCard.setOwner("Sarah");
        creditCard.setCardNumber(9876);

        billingDetailsRepository.save(creditCard);

        CreditCard creditCard1 = (CreditCard) billingDetailsRepository.findById(13).orElse(null);

        assertNotNull(creditCard1);
        assertEquals("Sarah", creditCard1.getOwner());
        assertEquals(9876, creditCard1.getCardNumber());
    }
}
