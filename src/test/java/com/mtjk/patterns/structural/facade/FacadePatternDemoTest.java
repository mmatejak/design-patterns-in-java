package com.mtjk.patterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class FacadePatternDemoTest {

    @Test
    void testStartComputer() {
        CPU cpu = mock(CPU.class);
        Memory memory = mock(Memory.class);
        HardDrive hardDrive = mock(HardDrive.class);
        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hardDrive);

        // Mock behavior for hard drive read
        when(hardDrive.read(0, 1024)).thenReturn(new byte[1024]);

        computerFacade.startComputer();

        // Verify interactions with mocks
        verify(cpu).freeze();
        verify(hardDrive).read(0, 1024);
        verify(memory).load(0, new byte[1024]);
        verify(cpu).jumpTo(0);
        verify(cpu).execute();
    }
}
