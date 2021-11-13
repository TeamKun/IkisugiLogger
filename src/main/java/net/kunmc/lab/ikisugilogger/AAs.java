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
            case ' ':
                return SPACE;
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
        throw new IllegalStateException("No support char");
    }
}
