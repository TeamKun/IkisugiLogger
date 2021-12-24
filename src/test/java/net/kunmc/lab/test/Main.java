package net.kunmc.lab.test;

import net.kunmc.lab.ikisugilogger.IkisugiLogger;

public class Main {
    public static void main(String[] args) {
        IkisugiLogger logger = new IkisugiLogger("the ikisugi\nmerry christmas");
        logger.setColorType(IkisugiLogger.ColorType.CHRISTMAS);
        logger.setCenter(true);
        //logger.setBlankCount(3);
        System.out.println(logger.create());
    }
}
