package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.paymentStrategy;

/**
 * Created by Mehmet AKGUL on 8/19/23.
 */
// * ConcreteStrategy (Somut Stratejiler): Strategy arayüzünü veya soyut sınıfını uygulayan sınıflar.
// Bu sınıflar, arayüzde tanımlanan işlevi veya algoritmayı gerçekleştirir.
public class PayPalPayment implements IPaymentStrategy {
    private String email;

    @Override
    public void pay(int amount) {
        System.out.println(amount + " tutarinda Paypal ile odeme yapildi");
    }

    public PayPalPayment(String email) {
        this.email = email;
    }
}
