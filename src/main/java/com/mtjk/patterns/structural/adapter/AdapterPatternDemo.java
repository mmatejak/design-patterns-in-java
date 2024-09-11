package com.mtjk.patterns.structural.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        adapter.request();  // Używa metody specyficznej za pomocą adaptera
    }
}
