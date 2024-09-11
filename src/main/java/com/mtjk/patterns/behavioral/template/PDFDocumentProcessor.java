package com.mtjk.patterns.behavioral.template;

public class PDFDocumentProcessor extends AbstractDocumentProcessor {

    @Override
    protected void loadDocument() {
        System.out.println("Loading PDF document.");
    }

    @Override
    protected void renderDocument() {
        System.out.println("Rendering PDF document.");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Saving PDF document.");
    }
}
