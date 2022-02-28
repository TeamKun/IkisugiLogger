package net.kunmc.lab.ikisugilogger;

public class AAUtils {
    public static int getMaxHeight(String text) {
        int l = 0;
        char[] ch = text.toCharArray();
        for (char c : ch) {
            int h = AAs.getHeight(c);
            if (h > l)
                l = h;
        }
        return l;
    }

    public static char getAAbyColumn(String text, int column, int blankCount, int zure) {
        if (column < zure) return ' ';
        column -= zure;
        int le = 0;
        int num = 0;
        char[] str = text.toCharArray();
        for (int i = 0; i < str.length; i++) {
            int w = AAs.getWidth(str[i]);
            le += w + blankCount;
            if (le > column) {
                num = i;
                break;
            }
        }
        return str[num];
    }

    public static int getAllWidth(String text, int blankCount) {
        int le = 0;
        for (char c : text.toCharArray()) {
            le += AAs.getWidth(c) + blankCount;
        }
        return le;
    }
}
