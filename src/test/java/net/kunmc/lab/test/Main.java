package net.kunmc.lab.test;

import net.kunmc.lab.ikisugilogger.IkisugiLogger;

public class Main {
    public static void main(String[] args) {
        IkisugiLogger logger = new IkisugiLogger("test");
        logger.setColorType(IkisugiLogger.ColorType.RAINBOW);
        logger.setCenter(true);
        logger.setBlankCount(3);
        System.out.println(logger.create());
    }
}
