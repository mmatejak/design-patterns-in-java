package com.mtjk.patterns.creative.prototype;

public interface Vehicle extends Cloneable {
    Vehicle clone();

    String getType();
}
