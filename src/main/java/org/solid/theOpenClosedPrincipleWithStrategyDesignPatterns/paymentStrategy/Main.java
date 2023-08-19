package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.paymentStrategy;

/**
 * Created by Mehmet AKGUL on 8/19/23.
 */
public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();


        CreditCardPayment creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "Ali Veli");
        shoppingCart.setiPaymentStrategy(creditCardPayment);
        shoppingCart.checkout(6000);


        PayPalPayment payPalPayment = new PayPalPayment("ali@example.com");
        shoppingCart.setiPaymentStrategy(payPalPayment);
        shoppingCart.checkout(4500);


    }
}
/**
 * Temel Fikir:
 * Bir işlevi veya algoritmayı,
 * bir sınıfta sabit bir şekilde kodlamak yerine,
 * bu işlevi veya algoritmayı bir dizi sınıfın her birinde tanımlarız.
 * Bu sayede bu işlevi veya algoritmayı, uygulama çalışırken dinamik olarak değiştirebiliriz.
 *
 * Bileşenler:
 *
 * Strategy (Strateji Arayüzü): Tüm stratejilerin uygulayacağı bir arayüz veya soyut sınıf.
 * ConcreteStrategy (Somut Stratejiler): Strategy arayüzünü veya soyut sınıfını uygulayan sınıflar. Bu sınıflar, arayüzde tanımlanan işlevi veya algoritmayı gerçekleştirir.
 * Context (Bağlam): Strategy nesnesini kullanarak bazı işlevleri gerçekleştiren sınıf. Bağlam, hangi stratejinin kullanılacağına karar verir veya bu kararı dışarıdan alır.
 * Örnek:
 * Bir e-ticaret uygulamasında, farklı ödeme yöntemlerini temsil eden stratejilere bakalım:
 *
 * Strategy:
 */