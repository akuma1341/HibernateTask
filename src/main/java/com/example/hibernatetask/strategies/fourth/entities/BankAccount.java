package com.example.hibernatetask.strategies.fourth.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bank_accounts")
@Data
@EqualsAndHashCode(callSuper = true)
public class BankAccount extends BillingDetails {

    @Column(name = "bank_name")
    private String bankName;
}
