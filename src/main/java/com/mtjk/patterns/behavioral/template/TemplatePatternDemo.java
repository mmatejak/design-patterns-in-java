package com.mtjk.patterns.behavioral.template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        AbstractDocumentProcessor pdfProcessor = new PDFDocumentProcessor();
        AbstractDocumentProcessor wordProcessor = new WordDocumentProcessor();

        System.out.println("Processing PDF document:");
        pdfProcessor.processDocument();

        System.out.println("\nProcessing Word document:");
        wordProcessor.processDocument();
    }
}
