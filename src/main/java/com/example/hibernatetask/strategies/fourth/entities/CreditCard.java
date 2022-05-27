package com.example.hibernatetask.strategies.fourth.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "credit_cards")
@Data
@EqualsAndHashCode(callSuper = true)
public class CreditCard extends BillingDetails {

    @Column(name = "card_number")
    private int cardNumber;
}
