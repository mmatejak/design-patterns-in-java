package com.mtjk.patterns.creative.builder;

public class ComputerBuilder {
    private String CPU;
    private int RAM;
    private int storage;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public Computer build() {
        return new Computer(new Computer.Builder()
                .setCPU(CPU)
                .setRAM(RAM)
                .setStorage(storage)
        );
    }
}
