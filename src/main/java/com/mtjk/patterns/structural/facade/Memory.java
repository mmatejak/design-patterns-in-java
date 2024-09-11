package com.mtjk.patterns.structural.facade;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data at position " + position + " in memory.");
    }
}
