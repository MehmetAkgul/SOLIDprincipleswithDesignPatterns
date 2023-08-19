package org.solid.openClosePrinciple;

public class BookStore {
    public void sell(Book book) {
        book.postPurchaseAction();
        // Diğer satış işlemleri...
    }
}
