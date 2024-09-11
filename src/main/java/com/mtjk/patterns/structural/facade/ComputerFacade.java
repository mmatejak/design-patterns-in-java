package com.mtjk.patterns.structural.facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jumpTo(0);
        cpu.execute();
    }
}
