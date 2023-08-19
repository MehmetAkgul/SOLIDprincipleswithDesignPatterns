package org.solid.theOpenClosedPrincipleWithStrategyDesignPatterns.bookStore;

public class EBook implements Book {
    private String title;

    public EBook(String title) {
        this.title = title;
    }

    @Override
    public void postPurchaseAction() {
        System.out.println("E-kitap " + title + " satın alındı. E-posta gönderildi.");
    }
}
