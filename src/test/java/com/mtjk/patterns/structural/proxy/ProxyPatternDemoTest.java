package com.mtjk.patterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ProxyPatternDemoTest {

    @Test
    void testDocumentProxy() {
        // Mocking the RealDocument
        RealDocument realDocument = mock(RealDocument.class);
        DocumentProxy documentProxy = spy(new DocumentProxy("Document.pdf"));

        // Set the realDocument inside the proxy
        doNothing().when(realDocument).display();
        doReturn(realDocument).when(documentProxy).getRealDocument();

        // Call the display method
        documentProxy.display();

        // Verify interactions
        verify(documentProxy).display();
    }
}
