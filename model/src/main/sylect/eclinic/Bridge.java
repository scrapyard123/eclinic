// SPDX-License-Identifier: MIT

package eclinic;

public final class Bridge {

    private Bridge() {
    }

    public static int isNull(Object o) {
        return o == null ? 1 : 0;
    }

    public static int nonNull(Object o) {
        return o == null ? 0 : 1;
    }

    public static int toInt(boolean b) {
        return b ? 1 : 0;
    }

    public static boolean toBool(int i) {
        return i > 0;
    }
}
