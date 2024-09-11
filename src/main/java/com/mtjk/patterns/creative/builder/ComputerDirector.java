package com.mtjk.patterns.creative.builder;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer buildGamingComputer() {
        return builder.setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .build();
    }

    public Computer buildOfficeComputer() {
        return builder.setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .build();
    }
}
