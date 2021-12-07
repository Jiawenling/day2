package com.example;

public class FixedDepositAccount extends BankAccount {

    private Float interest = 3.0f;
    private Integer months = 6;
    private boolean isInterestChanged = false;
    private boolean isDurationChanged = false;

    public FixedDepositAccount(String name, Float balance){
        super(name, balance);
        
    }

    public FixedDepositAccount(String name, Float balance, Float interest){
        super(name, balance);
        this.interest = interest;
    }

    public FixedDepositAccount(String name, Float balance, Float interest, Integer months){
        super(name, balance);
        this.interest = interest;
        this.months = months;
    }
    
    @Override
    public void deposit(Float amtDeposit){}

    @Override
    public void withdraw(Float amtWithdrawn){}

    @Override
    public float getBalance(){
        return super.balance + ((this.interest/100)*super.balance);
    }

    public void setInterest(float interest){

        if (isInterestChanged == true){
            throw new IllegalArgumentException();
        }

        this.interest = interest;
        isInterestChanged = true;
        
    }

    public void setMonths(int months){
        if (isDurationChanged == true){
            throw new IllegalArgumentException();
        }
        this.months = months;
        isDurationChanged = true;
    }
}
