package net.kunmc.lab.test;

import net.kunmc.lab.ikisugilogger.IkisugiLogger;

public class Main {
    public static void main(String[] args) {
        IkisugiLogger logger = new IkisugiLogger("IKISUGI");
        logger.setColorType(IkisugiLogger.ColorType.RAINBOW);
        logger.setCenter(true);
        System.out.println(logger.create());
    }
}
