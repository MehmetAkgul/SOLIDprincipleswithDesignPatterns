package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.paymentStrategy;

// * Strategy (Strateji Arayüzü): Tüm stratejilerin uygulayacağı bir arayüz veya soyut sınıf.
public interface IPaymentStrategy {
    void pay(int amount);
}
