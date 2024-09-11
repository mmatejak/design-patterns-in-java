package com.mtjk.patterns.behavioral.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatePatternDemoTest {

    private VendingMachine vendingMachine;
    private State noCoinState;
    private State hasCoinState;
    private State soldOutState;

    @BeforeEach
    void setUp() {
        vendingMachine = new VendingMachine(2);
        noCoinState = vendingMachine.getNoCoinState();
        hasCoinState = vendingMachine.getHasCoinState();
        soldOutState = vendingMachine.getSoldOutState();
    }

    @Test
    void testInsertCoinTransitionToHasCoinState() {
        vendingMachine.insertCoin();
        assertEquals(hasCoinState, vendingMachine.getCurrentState());
    }

    @Test
    void testTurnCrankWithHasCoinState() {
        vendingMachine.insertCoin();
        vendingMachine.turnCrank();
        assertEquals(noCoinState, vendingMachine.getCurrentState());
        assertEquals(1, vendingMachine.getCount());  // One drink should be dispensed
    }

    @Test
    void testTurnCrankWhenSoldOut() {
        vendingMachine.insertCoin();
        vendingMachine.turnCrank();
        vendingMachine.insertCoin();
        vendingMachine.turnCrank();
        assertEquals(soldOutState, vendingMachine.getCurrentState());
        assertEquals(0, vendingMachine.getCount());  // No drink should be dispensed
    }
}
