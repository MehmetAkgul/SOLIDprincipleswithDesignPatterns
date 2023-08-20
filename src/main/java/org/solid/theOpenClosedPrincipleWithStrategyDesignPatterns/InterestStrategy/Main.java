package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.InterestStrategy;

/**
 * Created by Mehmet AKGUL on 8/20/23.
 * Soru: Bir bankada, farklı faiz oranlarına göre hesap bakiyesi üzerinden
 * faiz hesaplayan bir yapı tasarlayın.
 * İki tip faiz oranı olsun: Normal ve Öğrenci.
 */

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        account.setInterestStrategy(new NormalInterest());
        System.out.println(account.calculateInterest());

        BankAccount account2 = new BankAccount(20000);
        account2.setInterestStrategy(new StudentInterest());
        System.out.println(account2.calculateInterest());
    }
}
