package com.mtjk.patterns.behavioral.state;

public class NoCoinState implements State {
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to return.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You need to insert a coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("You need to insert a coin first.");
    }
}
