package net.kunmc.lab.test;

import net.kunmc.lab.ikisugilogger.IkisugiLogger;

public class Main {
    public static void main(String[] args) {
        IkisugiLogger logger = new IkisugiLogger("ikisugi logger");
        logger.setColorType(IkisugiLogger.ColorType.NONE);
        logger.setCenter(true);
        //logger.setBlankCount(3);
        System.out.println(logger.create());
    }
}
