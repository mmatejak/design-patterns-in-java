package com.mtjk.patterns.behavioral.template;

public class WordDocumentProcessor extends AbstractDocumentProcessor {

    @Override
    protected void loadDocument() {
        System.out.println("Loading Word document.");
    }

    @Override
    protected void renderDocument() {
        System.out.println("Rendering Word document.");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Saving Word document.");
    }
}
