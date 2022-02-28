package net.kunmc.lab.ikisugilogger;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AAs {
    private static final String A = "ICAgIyMgIAogICMjIyMgCiAjIyAgIyMKICMjICAjIwogIyMjIyMjCiAjIyAgIyMKICMjICAjIwo=";
    private static final String B = "ICMjIyMjIyAKICAjIyAgIyMKICAjIyAgIyMKICAjIyMjIyAKICAjIyAgIyMKICAjIyAgIyMKICMjIyMjIyAK";
    private static final String C = "ICAgIyMjIyAKICAjIyAgIyMKICMjICAgICAKICMjICAgICAKICMjICAgICAKICAjIyAgIyMKICAgIyMjIyAK";
    private static final String D = "ICMjIyMjICAKICAjIyAjIyAKICAjIyAgIyMKICAjIyAgIyMKICAjIyAgIyMKICAjIyAjIyAKICMjIyMjICAK";
    private static final String E = "ICMjIyMjIyMKICAjIyAgICMKICAjIyAjICAKICAjIyMjICAKICAjIyAjICAKICAjIyAgICMKICMjIyMjIyMK";
    private static final String F = "ICMjIyMjIyMKICAjIyAgICMKICAjIyAjICAKICAjIyMjICAKICAjIyAjICAKICAjIyAgICAKICMjIyMgICAK";
    private static final String G = "ICAgIyMjIyAKICAjIyAgIyMKICMjICAgICAKICMjICAgICAKICMjICAjIyMKICAjIyAgIyMKICAgIyMjIyMK";
    private static final String H = "ICMjICAgIyMKICMjICAgIyMKICMjICAgIyMKICMjIyMjIyMKICMjICAgIyMKICMjICAgIyMKICMjICAgIyMK";
    private static final String I = "ICAjIyMjCiAgICMjIAogICAjIyAKICAgIyMgCiAgICMjIAogICAjIyAKICAjIyMjCg==";
    private static final String J = "ICAgICMjIyMKICAgICAjIyAKICAgICAjIyAKICAgICAjIyAKICMjICAjIyAKICMjICAjIyAKICAjIyMjICAK";
    private static final String K = "ICMjIyAgIyMKICAjIyAgIyMKICAjIyAjIyAKICAjIyMjICAKICAjIyAjIyAKICAjIyAgIyMKICMjIyAgIyMK";
    private static final String L = "ICMjIyMgICAKICAjIyAgICAKICAjIyAgICAKICAjIyAgICAKICAjIyAgICMKICAjIyAgIyMKICMjIyMjIyMK";
    private static final String M = "ICMjICAgIyMKICMjIyAjIyMKICMjIyMjIyMKICMjIyMjIyMKICMjICMgIyMKICMjICAgIyMKICMjICAgIyMK";
    private static final String N = "ICMjICAgIyMKICMjIyAgIyMKICMjIyMgIyMKICMjICMjIyMKICMjICAjIyMKICMjICAgIyMKICMjICAgIyMK";
    private static final String O = "ICAjIyMjIyAKICMjICAgIyMKICMjICAgIyMKICMjICAgIyMKICMjICAgIyMKICMjICAgIyMKICAjIyMjIyAK";
    private static final String P = "ICMjIyMjIyAKICAjIyAgIyMKICAjIyAgIyMKICAjIyMjIyAKICAjIyAgICAKICAjIyAgICAKICMjIyMgICAK";
    private static final String Q = "ICMjIyMjIAojIyAgICMjCiMjICAgIyMKIyMgICAjIwojIyAgICMjCiMjICAjIyMKICMjIyMjIAogICAgIyMjCg==";
    private static final String R = "ICMjIyMjIyAKICAjIyAgIyMKICAjIyAgIyMKICAjIyMjIyAKICAjIyAjIyAKICAjIyAgIyMKICMjIyMgIyMK";
    private static final String S = "ICAjIyMjIyAKICMjICAgIyMKICMgICAgICAKICAjIyMjIyAKICAgICAgIyMKICMjICAgIyMKICAjIyMjIyAK";
    private static final String T = "ICMjIyMjIwogIyAjIyAjCiAgICMjICAKICAgIyMgIAogICAjIyAgCiAgICMjICAKICAjIyMjIAo=";
    private static final String U = "ICMjICAgIyMKICMjICAgIyMKICMjICAgIyMKICMjICAgIyMKICMjICAgIyMKICMjICAgIyMKICAjIyMjIyAK";
    private static final String V = "ICMjICAgIyMKICMjICAgIyMKICAjIyAjIyAKICAjIyAjIyAKICAgIyMjICAKICAgIyMjICAKICAgICMgICAK";
    private static final String W = "ICMjICAgIyMKICMjICAgIyMKICMjICAgIyMKICMjICMgIyMKICMjIyMjIyMKICMjIyAjIyMKICMjICAgIyMK";
    private static final String X = "ICMjICAjIwogIyMgICMjCiAgIyMjIyAKICAgIyMgIAogICMjIyMgCiAjIyAgIyMKICMjICAjIwo=";
    private static final String Y = "ICMjICAjIwogIyMgICMjCiAjIyAgIyMKICAjIyMjIAogICAjIyAgCiAgICMjICAKICAjIyMjIAo=";
    private static final String Z = "ICMjIyMjIyMKICMgICAjIyAKICAgICMjICAKICAgIyMgICAKICAjIyAgICAKICMjICAgICMKICMjIyMjIyMK";

    private static final String SPACE = "ICAgICAgICAKICAgICAgICAKICAgICAgICAKICAgICAgICAKICAgICAgICAKICAgICAgICAKICAgICAgICAK";
    private static final String EXCLAMATION = "ICAgIyMgCiAgIyMjIwogICMjIyMKICAgIyMgCiAgICMjIAogICAgICAKICAgIyMgCg==";
    private static final String QUESTION = "ICMjIyMgCiMjICAjIwogICAgIyMKICAgIyMgCiAgIyMgIAogICAgICAKICAjIyAgCg==";
    private static final String HYPHEN = "ICAgICAgIAogICAgICAgCiAjIyMjIyMK";
    private static final String COMMA = "ICAgICAKICAgICAKICAgICAKICAgICAKICAgIyMKICAgIyMKICAjIyAK";
    private static final String FULL_STOP = "ICAgICAKICAgICAKICAgICAKICAgICAKICAgIyMKICAgIyMK";
    private static final String QUOTATION = "ICMjICAjIwogIyMgICMjCiAjICAgIyAK";
    private static final String NUMBER_SIGN = "ICMjICMjIAogIyMgIyMgCiMjIyMjIyMKICMjICMjIAojIyMjIyMjCiAjIyAjIyAKICMjICMjIAo=";
    private static final String PERCENT = "ICMjICAgIwogIyMgICMjCiAgICAjIyAKICAgIyMgIAogICMjICAgCiAjIyAgIyMKICMgICAjIwo=";
    private static final String PLUS = "ICAgIyMgIAogICAjIyAgCiAjIyMjIyMKICAgIyMgIAogICAjIyAgCg==";
    private static final String SOLIDUS = "ICAgICAgIyMKICAgICAjIyAKICAgICMjICAKICAgIyMgICAKICAjIyAgICAKICMjICAgICAK";
    private static final String AMPERSAND = "ICMjIyMgIAojIyAgIyMgCiAjIyMjICAKICMjIyAgIAojIyAgIyMjCiMjICAjIyAKICMjIyMjIwo=";
    private static final String APOSTROPHE = "ICAgIyMKICAgIyMKICAjIyAK";
    private static final String COLON = "ICAgICAKICAgIyMKICAgICAKICAgICAKICAgIyMK";
    private static final String SEMICOLON = "ICAjIwogICAgCiAgICAKICAjIwogICMjCiAjIyAK";
    private static final String EQUALS = "ICAgICAgIAogIyMjIyMjCiAgICAgICAKICMjIyMjIwo=";
    private static final String LOW_LINE = "ICAgICAgICAKICAgICAgICAKICAgICAgICAKICAgICAgICAKICAgICAgICAKICAgICAgICAKIyMjIyMjIyMK";
    private static final String CIRCUMFLEX = "ICAgIyAgIAogICMjIyAgCiAjIyAjIyAKIyMgICAjIwo=";

    private static final String _1 = "ICAgIyMgIAogICMjIyAgCiAgICMjICAKICAgIyMgIAogICAjIyAgCiAgICMjICAKICMjIyMjIwo=";
    private static final String _2 = "ICAjIyMjIAogIyMgICMjCiAgICAgIyMKICAgIyMjIAogICMjICAgCiAjIyAgIyMKICMjIyMjIwo=";
    private static final String _3 = "ICAjIyMjIAogIyMgICMjCiAgICAgIyMKICAgIyMjIAogICAgICMjCiAjIyAgIyMKICAjIyMjIAo=";
    private static final String _4 = "ICAgICMjIyAKICAgIyMjIyAKICAjIyAjIyAKICMjICAjIyAKICMjIyMjIyMKICAgICAjIyAKICAgICAjIyAK";
    private static final String _5 = "ICMjIyMjIwogIyMgICAgCiAjIyMjIyAKICAgICAjIwogICAgICMjCiAjIyAgIyMKICAjIyMjIAo=";
    private static final String _6 = "ICAgIyMjIAogICMjICAgCiAjIyAgICAKICMjIyMjIAogIyMgICMjCiAjIyAgIyMKICAjIyMjIAo=";
    private static final String _7 = "ICMjIyMjIwogIyMgICMjCiAgICAgIyMKICAgICMjIAogICAjIyAgCiAgICMjICAKICAgIyMgIAo=";
    private static final String _8 = "ICAjIyMjIAogIyMgICMjCiAjIyAgIyMKICAjIyMjIAogIyMgICMjCiAjIyAgIyMKICAjIyMjIAo=";
    private static final String _9 = "ICAjIyMjIAogIyMgICMjCiAjIyAgIyMKICAjIyMjIwogICAgICMjCiAgICAjIyAKICAjIyMgIAo=";
    private static final String _0 = "ICAjIyMjIAogIyMgICMjCiAjIyAjIyMKICMjIyMjIwogIyMjICMjCiAjIyAgIyMKICAjIyMjIAo=";

    public static int getWidth(char ch) {
        int mx = 0;
        String[] spr = getDecodeAA(ch).split("\n");
        for (String s : spr) {
            if (s.length() > mx)
                mx = s.length();
        }
        return mx;
    }

    public static int getHeight(char ch) {
        return getDecodeAA(ch).split("\n").length;
    }

    public static String[] getDecodeAAs(String text) {
        String[] aas = new String[text.length()];
        for (int i = 0; i < aas.length; i++) {
            aas[i] = getDecodeAA(text.charAt(i));
        }
        return aas;
    }

    public static String getDecodeAA(char ch) {
        String aa = getAA(ch);
        byte[] aad = Base64.getDecoder().decode(aa);
        return new String(aad, StandardCharsets.UTF_8);
    }

    public static String getAA(char ch) {

        switch (ch) {
            case '1':
                return _1;
            case '2':
                return _2;
            case '3':
                return _3;
            case '4':
                return _4;
            case '5':
                return _5;
            case '6':
                return _6;
            case '7':
                return _7;
            case '8':
                return _8;
            case '9':
                return _9;
            case '0':
                return _0;
        }

        switch (ch) {
            case ' ':
                return SPACE;
            case '!':
                return EXCLAMATION;
            case '?':
                return QUESTION;
            case '-':
                return HYPHEN;
            case ',':
                return COMMA;
            case '.':
                return FULL_STOP;
            case '"':
                return QUOTATION;
            case '#':
                return NUMBER_SIGN;
            case '%':
                return PERCENT;
            case '+':
                return PLUS;
            case '/':
                return SOLIDUS;
            case '&':
                return AMPERSAND;
            case '\'':
                return APOSTROPHE;
            case ':':
                return COLON;
            case ';':
                return SEMICOLON;
            case '=':
                return EQUALS;
            case '_':
                return LOW_LINE;
            case '^':
                return CIRCUMFLEX;
        }

        ch = Character.toUpperCase(ch);
        switch (ch) {
            case 'A':
                return A;
            case 'B':
                return B;
            case 'C':
                return C;
            case 'D':
                return D;
            case 'E':
                return E;
            case 'F':
                return F;
            case 'G':
                return G;
            case 'H':
                return H;
            case 'I':
                return I;
            case 'J':
                return J;
            case 'K':
                return K;
            case 'L':
                return L;
            case 'M':
                return M;
            case 'N':
                return N;
            case 'O':
                return O;
            case 'P':
                return P;
            case 'Q':
                return Q;
            case 'R':
                return R;
            case 'S':
                return S;
            case 'T':
                return T;
            case 'U':
                return U;
            case 'V':
                return V;
            case 'W':
                return W;
            case 'X':
                return X;
            case 'Y':
                return Y;
            case 'Z':
                return Z;
        }
        throw new IllegalStateException("No support char :" + ch);
    }
}
