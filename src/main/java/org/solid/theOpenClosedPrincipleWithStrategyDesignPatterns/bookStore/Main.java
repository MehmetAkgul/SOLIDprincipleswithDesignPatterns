package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.bookStore;

public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        EBook myEBook = new EBook("Dijital Dünya");
        PrintedBook myPrintedBook = new PrintedBook("Gerçek Dünya");

        store.sell(myEBook);         // "E-kitap Dijital Dünya satın alındı. E-posta gönderildi." çıktısını verir.
        store.sell(myPrintedBook);  // "Basılı kitap Gerçek Dünya satın alındı. Kargo bilgisi gönderildi." çıktısını verir.
    }
}
/**
 * Strategy Tasarım Kalıbı nedir?
 *
 * Strategy kalıbı, bir ailedeki algoritma veya işlevleri tanımlar
 * ve onları sınıflar halinde kapsüller.
 * Bu algoritma veya işlevleri birbiriyle değiştirilebilir kılar.
 * Strategy, algoritmayı kullanıcıdan ayırarak bağımsız olarak değiştirmenizi sağlar.
 *
 * Nasıl uygulandı?
 *
 * Book arayüzü, bir strateji (yani post-purchase aksiyonu) tanımlar.
 * Bu durumda, satın alma sonrası yapılacak işlem
 * (e-posta gönderme veya kargo bilgisi gönderme) bu stratejidir.
 * EBook ve PrintedBook sınıfları, bu stratejiye farklı uygulamalar sunar.
 * Bu nedenle, her biri postPurchaseAction metodunu farklı şekillerde uygular.
 * BookStore sınıfı, hangi stratejinin uygulanacağını bilmez.
 * Sadece sell metodu çağrıldığında kitap nesnesinin postPurchaseAction metodunu çağırır.
 * Bu yaklaşım, bir algoritma veya işlevi genişletmek
 * veya değiştirmek istediğinizde mevcut kodu değiştirmemenizi sağlar.
 * Bu, Strategy tasarım kalıbının temel fikridir ve bu kodda da bu fikir uygulanmıştır.
 */
