package com.mtjk.patterns.behavioral.template;

public abstract class AbstractDocumentProcessor {

    // Template method
    public final void processDocument() {
        loadDocument();
        renderDocument();
        saveDocument();
    }

    // Steps that can be overridden by subclasses
    protected abstract void loadDocument();

    protected abstract void renderDocument();

    protected abstract void saveDocument();
}
