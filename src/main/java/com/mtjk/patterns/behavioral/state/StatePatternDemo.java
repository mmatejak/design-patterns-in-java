package com.mtjk.patterns.behavioral.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        vendingMachine.insertCoin();
        vendingMachine.turnCrank();

        vendingMachine.insertCoin();
        vendingMachine.turnCrank();

        vendingMachine.insertCoin();
        vendingMachine.turnCrank();
    }
}
