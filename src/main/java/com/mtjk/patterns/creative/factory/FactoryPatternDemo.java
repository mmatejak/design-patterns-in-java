package com.mtjk.patterns.creative.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();
    }
}
