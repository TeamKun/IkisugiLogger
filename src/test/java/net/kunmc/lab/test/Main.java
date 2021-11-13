package net.kunmc.lab.test;

import net.kunmc.lab.ikisugilogger.IkisugiLogger;

public class Main {
    public static void main(String[] args) {
        IkisugiLogger logger = new IkisugiLogger("IKISUGI\nHAPPY BIRTHDAY");
        logger.setColorType(IkisugiLogger.ColorType.NONE);
        System.out.println(logger.create());
    }
}
