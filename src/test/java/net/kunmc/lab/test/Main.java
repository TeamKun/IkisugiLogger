package net.kunmc.lab.test;

import net.kunmc.lab.ikisugilogger.IkisugiLogger;

public class Main {
    public static void main(String[] args) {
        IkisugiLogger logger = new IkisugiLogger("IKISUGI TEST");
        logger.setColorType(IkisugiLogger.ColorType.RAINBOW);
        System.out.println(logger.create());
    }
}
