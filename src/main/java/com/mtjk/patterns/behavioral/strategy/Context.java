package com.mtjk.patterns.behavioral.strategy;

import lombok.Setter;

@Setter
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] array) {
        strategy.sort(array);
    }
}
