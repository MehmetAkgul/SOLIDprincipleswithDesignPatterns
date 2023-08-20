package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.InterestStrategy;

/**
 * Created by Mehmet AKGUL on 8/20/23.
 */
//concrete Strategy
public class StudentInterest implements InterestStrategy{
    @Override
    public double calculateInterest(double balance) {
        return balance*0.01;
    }
}
