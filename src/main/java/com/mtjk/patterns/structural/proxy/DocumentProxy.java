package com.mtjk.patterns.structural.proxy;

import lombok.Getter;

@Getter
public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String filename;

    public DocumentProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realDocument == null) {
            realDocument = new RealDocument(filename);
        }
        realDocument.display();
    }
}
