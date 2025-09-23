package com.appbank.bank.model;

public class SavingAccount extends Account {

    private static final double InterestRate = 0;
    private double InteresRate;

    public SavingAccount(){


    }



public SavingAccount (String id, Customer owner, Money balance, double InteresRate){
    super(id, owner, balance);
    this.InteresRate = InteresRate;
}




@Override
public void applyInterest(){
    double newBalance = getBalance().getAmount() + (getBalance().getAmount() * InterestRate);
    getBalance().setAmount(newBalance);

}

public double getInterestRate(){
       return InteresRate;

    }
public void setInterestRate(double InteresRate){this.InteresRate=InteresRate;}



@Override
public void apllyInterest() {
   
}

}



