package com.mtjk.patterns.structural.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();
        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hardDrive);

        computerFacade.startComputer();
    }
}
