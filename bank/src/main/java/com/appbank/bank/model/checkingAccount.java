package com.appbank.bank.model;

public class CheckingAccount extends Account {
    private double overdraflimit;

    public CheckingAccount() {
        super();
    }

   
    public CheckingAccount(String id, Customer owner, Money balance, double overdraflimit) {
        super(id, owner, balance);
        this.overdraflimit = overdraflimit;
    }

    @Override
    public void applyInterest() {
       
    }

    public boolean withdraw(Money amount) {
        double available = getBalance().getAmount() + overdraflimit;
        if (available >= amount.getAmount()) {
            getBalance().setAmount(getBalance().getAmount() - amount.getAmount());
            getTransactions().add(new Transaction("WDR", amount, getId()));
            return true;
        }
        return false;
    }

    public double getOverdraflimit() {
        return overdraflimit;
    }

    public void setOverdraflimit(double overdraflimit) {
        this.overdraflimit = overdraflimit;
    }
}
