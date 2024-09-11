package com.mtjk.patterns.creative.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Pobranie instancji Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
