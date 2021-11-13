package net.kunmc.lab.ikisugilogger;

import java.util.ArrayList;
import java.util.List;
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
        String[][] aas = new String[texts.length][];
        List<Integer> colins = new ArrayList<>();
        int[] lengths = new int[texts.length];
        int maxLine = 0;
        int maxColin = 0;

        int ct = 0;
        int act = 0;

        for (int i = 0; i < texts.length; i++) {
            aas[i] = AAs.getDecodeAAs(texts[i]);
            int max = 0;
            if (i != 0)
                maxLine++;
            do {
                int colinCont = 0;
                for (int j = 0; j < aas[i].length; j++) {
                    String aa = aas[i][j];
                    String[] let = aa.split("\n");
                    max = Math.max(max, let.length);
                    String line = let.length > ct ? let[ct] : Util.stringRepeat(" ", let[let.length - 1].length());
                    colinCont += line.length();
                    colinCont += blankCount;
                }
                maxColin = Math.max(maxColin, colinCont);
                colins.add(colinCont);
                ct++;
            } while (ct < max);
            maxLine += max;
            lengths[i] = max;
            ct = 0;
            colins.add(0);
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLine; i++) {
            int txNum = 0;
            int ltcont = 0;
            for (int j = 0; j < lengths.length; j++) {
                if (i >= ltcont && i < ltcont + lengths[j] + (j != lengths.length - 1 ? 1 : 0)) {
                    if (ltcont == i) {
                        ct = 0;
                    }
                    txNum = j;
                    break;
                }
                ltcont += lengths[j] + 1;
            }

            String[] aalt = aas[txNum];
            int colinCont = 0;

            if (center) {
                int ama = (maxColin - colins.get(i)) / 2;
                sb.append(Util.stringRepeat(" ", ama));
                colinCont += ama;
            }

            for (String aa : aalt) {
                String[] let = aa.split("\n");
                String line = let.length > ct ? let[ct] : Util.stringRepeat(" ", let[let.length - 1].length());
                sb.append(colorType.getColorable().colorLine(line, act, colinCont, maxLine, maxColin));
                colinCont += line.length();
                sb.append(Util.stringRepeat(" ", blankCount));
                colinCont += blankCount;
            }

            sb.append("\n");
            ct++;
            act++;
        }

        if (colorType != ColorType.NONE)
            sb.append("\u001b[0m");

        return sb.toString();
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
