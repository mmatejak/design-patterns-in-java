package com.mtjk.patterns.creative.factory;

public class PDFDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
