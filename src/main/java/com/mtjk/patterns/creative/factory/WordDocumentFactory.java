package com.mtjk.patterns.creative.factory;

public class WordDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
