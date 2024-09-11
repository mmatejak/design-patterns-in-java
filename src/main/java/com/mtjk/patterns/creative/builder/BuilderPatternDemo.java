package com.mtjk.patterns.creative.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);

        Computer gamingComputer = director.buildGamingComputer();
        Computer officeComputer = director.buildOfficeComputer();

        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
    }
}
