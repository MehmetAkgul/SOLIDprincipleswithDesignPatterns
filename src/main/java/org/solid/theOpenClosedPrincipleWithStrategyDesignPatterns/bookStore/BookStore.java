package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.bookStore;

public class BookStore {
    public void sell(Book book) {
        book.postPurchaseAction();
        // Diğer satış işlemleri...
    }
}
