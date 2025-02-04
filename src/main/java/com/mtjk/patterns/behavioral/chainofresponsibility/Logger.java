package com.mtjk.patterns.behavioral.chainofresponsibility;

import lombok.Setter;

abstract class Logger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    // Następny element w łańcuchu
    @Setter
    protected Logger nextLogger;

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}

