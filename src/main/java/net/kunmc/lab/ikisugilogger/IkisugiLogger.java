package net.kunmc.lab.ikisugilogger;

import java.util.Random;

public class IkisugiLogger {
    private static final Random random = new Random();
    private final String text;
    private ColorType colorType = ColorType.NONE;
    private int blankCount = 0;
    private boolean center;

    public IkisugiLogger(String text) {
        this.text = text;
    }

    public boolean isCenter() {
        return center;
    }

    public void setCenter(boolean center) {
        this.center = center;
    }

    public String getText() {
        return text;
    }

    public void setBlankCount(int blankCount) {
        this.blankCount = blankCount;
    }

    public String create() {
        String[] texts = text.split("\n");

        int maxLine = 0;
        int maxColin = 0;

        int ct = 0;

        for (String txt : texts) {
            String[] aas = AAs.getDecodeAAs(txt);
            do {
                int colinCont = 0;
                for (String aa : aas) {
                    String[] let = aa.split("\n");
                    maxLine = Math.max(maxLine, let.length);
                    String line = let.length > ct ? let[ct] : Util.stringRepeat(" ", let[let.length - 1].length());
                    colinCont += line.length();
                    colinCont += blankCount;
                }
                maxColin = Math.max(maxColin, colinCont);
                ct++;
            } while (ct < maxLine);
            ct = 0;
        }

        StringBuilder sb = new StringBuilder();
        /*
        do {
            int colinCont = 0;
            for (String aa : aas) {
                String[] let = aa.split("\n");
                String line = let.length > ct ? let[ct] : Util.stringRepeat(" ", let[let.length - 1].length());
                sb.append(colorType.getColorable().colorLine(line, ct, colinCont, max, maxColin));
                colinCont += line.length();
                sb.append(Util.stringRepeat(" ", blankCount));
                colinCont += blankCount;
            }

            sb.append("\n");
            ct++;
        } while (ct < max);
*/

        if (colorType != ColorType.NONE)
            sb.append("\u001b[0m");

        return "sb.toString()";
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public ColorType getColorType() {
        return colorType;
    }

    //https://note.affi-sapo-sv.com/nodejs-console-color-output.php#title5
    public static enum ColorType {
        NONE((n, m, l, o, p) -> String.valueOf(n)),
        RANDOM((n, m, l, o, p) -> {
            int[] rgb = Util.toRGB(random.nextInt(0xFFFFFF));
            return String.format("\u001b[38;2;%s;%s;%sm", rgb[0], rgb[1], rgb[2]) + n;
        }),
        RAINBOW((n, m, l, o, p) -> {
            double line = (double) m / o;
            double column = (double) l / p;
            int cl = Util.convertHSBtoRGB((float) (line + column) / 2, 1, 1);
            int[] rgb = Util.toRGB(cl);
            return String.format("\u001b[38;2;%s;%s;%sm", rgb[0], rgb[1], rgb[2]) + n;
        });
        private final Colorable colorable;

        private ColorType(Colorable colorable) {
            this.colorable = colorable;
        }

        public Colorable getColorable() {
            return colorable;
        }
    }

    private static interface Colorable {
        String color(char c, int line, int column, int maxLine, int maxColumn);

        default String colorLine(String text, int line, int column, int maxLine, int maxColumn) {
            StringBuilder sb = new StringBuilder();
            char[] chars = text.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                sb.append(color(chars[i], line, column + i, maxLine, maxColumn));
            }
            return sb.toString();
        }
    }
}
