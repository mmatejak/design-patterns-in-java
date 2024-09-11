package com.mtjk.patterns.structural.facade;

public class CPU {
    public void freeze() {
        System.out.println("Freezing CPU.");
    }

    public void jumpTo(long position) {
        System.out.println("Jumping to position " + position + " on CPU.");
    }

    public void execute() {
        System.out.println("Executing CPU instructions.");
    }
}
