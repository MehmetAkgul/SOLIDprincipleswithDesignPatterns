package org.solid.openClosePrinciple;

public class PrintedBook implements Book {
    private String title;

    public PrintedBook(String title) {
        this.title = title;
    }

    @Override
    public void postPurchaseAction() {
        System.out.println("Basılı kitap " + title + " satın alındı. Kargo bilgisi gönderildi.");
    }
}
