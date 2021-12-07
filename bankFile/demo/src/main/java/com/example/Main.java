package com.example;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Lima");
        account.deposit(10.0f);
        System.out.println(account.getBalance());
        account.withdraw(0.2f);
        System.out.println(account.getBalance());
        FixedDepositAccount fda = new FixedDepositAccount("Lima", 100.0f);
        System.out.println(fda.getBalance());
        
    }
    
}
