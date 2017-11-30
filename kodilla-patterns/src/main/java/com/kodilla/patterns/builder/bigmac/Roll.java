package com.kodilla.patterns.builder.bigmac;

public class Roll {
    public static final String NORMAL = "NORMAL";
    public static final String SEZAM = "SEZAM";
    final private String kind;

    public Roll(String kind){
        if (kind.equals(NORMAL) || kind.equals(SEZAM)) {
            this.kind = kind;
        } else  {
            throw new IllegalStateException("We have only normal or sezam roll ! ");
        }
    }

    public String getKind() {
        return kind;
    }
}
