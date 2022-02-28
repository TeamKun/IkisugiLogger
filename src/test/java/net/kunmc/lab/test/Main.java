package net.kunmc.lab.test;

import net.kunmc.lab.ikisugilogger.AAUtils;
import net.kunmc.lab.ikisugilogger.IkisugiLogger;

public class Main {
    public static void main(String[] args) {
        IkisugiLogger logger = new IkisugiLogger("the ikisugi\nmerryq christmas\ntest");
        logger.setColorType(IkisugiLogger.ColorType.VOWEL_ONLY);
        logger.setCenter(true);
        logger.setBlankCount(3);
        System.out.println(logger.create());
        int l = AAUtils.getMaxHeight("ikisugi");
        System.out.println(l);
        // System.out.println(AAs.getHeight('p'));
    }
}
