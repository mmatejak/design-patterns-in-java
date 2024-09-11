package com.mtjk.patterns.structural.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Document document1 = new DocumentProxy("Document1.pdf");
        Document document2 = new DocumentProxy("Document2.pdf");

        // Document will be loaded only when display() is called
        document1.display();
        document2.display();
        document1.display(); // Already loaded, so no need to load again
    }
}
