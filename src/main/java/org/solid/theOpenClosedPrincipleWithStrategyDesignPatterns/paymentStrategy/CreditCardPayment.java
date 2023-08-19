package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.paymentStrategy;

/**
 * Created by Mehmet AKGUL on 8/19/23.
 */

// * ConcreteStrategy (Somut Stratejiler): Strategy arayüzünü veya soyut sınıfını uygulayan sınıflar.
// Bu sınıflar, arayüzde tanımlanan işlevi veya algoritmayı gerçekleştirir.
public class CreditCardPayment implements IPaymentStrategy {

    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount + " tutarinda Credit Card ile odeme yapildi");
    }
}
