package com.mtjk.patterns.creative.singleton;

import lombok.Getter;

public class Singleton {

    // Publiczna metoda dostępu do instancji
    // Prywatna, statyczna, wstępnie załadowana instancja
    @Getter
    private static final Singleton instance = new Singleton();

    // Prywatny konstruktor, aby zapobiec tworzeniu instancji z zewnątrz
    private Singleton() {
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
