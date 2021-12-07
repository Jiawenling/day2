package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BankAccountTest {
    @Test
    public void testGetBalance(){
        BankAccount account = new BankAccount("Babe", 123.45f);
        assertTrue(account.getBalance()==123.45f);
        System.out.println("testGetBalance sucessful");

    }

    @Test
    public void testDeposit(){
        BankAccount account = new BankAccount("Babe", 10.00f);
        account.deposit(2.0f);
        assertTrue(account.getBalance()==12.00f);
         System.out.println("testGetBalance sucessful");

    }
    
}
