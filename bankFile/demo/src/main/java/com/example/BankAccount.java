package com.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BankAccount {
    private String name;
    private String accNumber;
    protected float balance;
    private List<String> transactions;
    private boolean closed;
    private String creationDate;
    private String closingDate;

    public BankAccount(String name, float balance){
        this.name = name;
        this.balance = balance;
        
    }

    public BankAccount(String name){
        this(name, (float) 0.0);
        this.accNumber = Integer.toString((int) (Math.random()*10000000));
        transactions = new ArrayList<>();
    }

    public void deposit(Float amtDeposit){
        if (amtDeposit <0 || closed == true){
            throw new IllegalArgumentException();
        } else{
            
            String transactionMessage = "Deposited " + amtDeposit + Calendar.getInstance().getTimeInMillis();
            System.out.println(transactionMessage);
            transactions.add(transactionMessage);}
            this.balance += amtDeposit;
        }

        public void withdraw(Float amtWithdrawn){
            if (amtWithdrawn <0 || closed == true || (amtWithdrawn> this.balance)){
                throw new IllegalArgumentException();
            } else{
                transactions = new ArrayList<>();
                String transactionMessage = "Withdrawn " + amtWithdrawn + Calendar.getInstance().getTimeInMillis();
                transactions.add(transactionMessage);
                this.balance -= amtWithdrawn;
    
            }

    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

  

    /**
     * @return String return the accNumber
     */
    public String getAccNumber() {
        return accNumber;
    }

 

    /**
     * @return float return the balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * @return List<String> return the transactions
     */
    public List<String> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return boolean return the closed
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * @param closed the closed to set
     */
    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    /**
     * @return String return the creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return String return the closingDate
     */
    public String getClosingDate() {
        return closingDate;
    }

    /**
     * @param closingDate the closingDate to set
     */
    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }
}
