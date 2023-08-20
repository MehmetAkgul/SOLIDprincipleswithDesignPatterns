package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.InterestStrategy;

/**
 * Created by Mehmet AKGUL on 8/20/23.
 */
public class NormalInterest implements InterestStrategy{
    @Override
    public double calculateInterest(double balance) {
        return balance*0.03;
    }
}
