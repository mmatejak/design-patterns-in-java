package com.mtjk.patterns.structural.facade;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading " + size + " bytes from hard drive at LBA " + lba + ".");
        return new byte[size];
    }
}
