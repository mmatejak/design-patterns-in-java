package com.mtjk.patterns.behavioral.state;

public class ReadyState implements State {
    private VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You already inserted a coin.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin returned.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank turned.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
        vendingMachine.releaseDrink();
    }

    @Override
    public void dispense() {
        System.out.println("No drink dispensed.");
    }
}
