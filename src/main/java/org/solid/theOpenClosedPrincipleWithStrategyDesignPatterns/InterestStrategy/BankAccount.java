package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.InterestStrategy;

/**
 * Created by Mehmet AKGUL on 8/20/23.
 */
//concrete Strategy 
public class BankAccount {

    private double balance;
    private InterestStrategy interestStrategy;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void setInterestStrategy(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public double calculateInterest() {
       return interestStrategy.calculateInterest(balance);
    }
}
