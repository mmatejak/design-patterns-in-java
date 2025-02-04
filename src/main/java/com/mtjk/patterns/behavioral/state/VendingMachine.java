package com.mtjk.patterns.behavioral.state;

import lombok.Getter;

@Getter
public class VendingMachine {
    @Getter
    private final State noCoinState;
    @Getter
    private final State hasCoinState;
    @Getter
    private final State soldOutState;
    private State currentState;
    @Getter
    private int count;

    public VendingMachine(int numberOfDrinks) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new ReadyState(this);
        soldOutState = new SoldOutState(this);
        count = numberOfDrinks;

        if (numberOfDrinks > 0) {
            currentState = noCoinState;
        } else {
            currentState = soldOutState;
        }
    }

    public void setState(State newState) {
        currentState = newState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void turnCrank() {
        currentState.turnCrank();
        if (currentState == hasCoinState) {
            currentState.dispense();
        }
    }

    public void releaseDrink() {
        if (count > 0) {
            System.out.println("A drink is coming out!");
            count--;
            if (count == 0) {
                setState(soldOutState);
            } else {
                setState(noCoinState);
            }
        }
    }
}
