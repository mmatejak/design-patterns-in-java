package com.mtjk.patterns.behavioral.state;

public class SoldOutState implements State {
    private VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Machine is sold out.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to return.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Machine is sold out.");
    }

    @Override
    public void dispense() {
        System.out.println("Machine is sold out.");
    }
}
