package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.paymentStrategy;

/**
 * Created by Mehmet AKGUL on 8/19/23.
 */

//Context (Bağlam): Strategy (Strateji) nesnesini kullanarak bazı işlemleri gerçekleştiren sınıf.
//Context (Bağlam), hangi stratejinin kullanılacağına karar verir veya bu kararı dışarıdan alır.
public class ShoppingCart {

    private IPaymentStrategy iPaymentStrategy;

    public void setiPaymentStrategy(IPaymentStrategy iPaymentStrategy) {
        this.iPaymentStrategy = iPaymentStrategy;
    }

    public void checkout(int amount) {
        iPaymentStrategy.pay(amount);
    }
}
