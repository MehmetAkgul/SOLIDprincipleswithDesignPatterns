package org.solid.openClosePrinciple;

public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        EBook myEBook = new EBook("Dijital Dünya");
        PrintedBook myPrintedBook = new PrintedBook("Gerçek Dünya");

        store.sell(myEBook);         // "E-kitap Dijital Dünya satın alındı. E-posta gönderildi." çıktısını verir.
        store.sell(myPrintedBook);  // "Basılı kitap Gerçek Dünya satın alındı. Kargo bilgisi gönderildi." çıktısını verir.
    }
}
