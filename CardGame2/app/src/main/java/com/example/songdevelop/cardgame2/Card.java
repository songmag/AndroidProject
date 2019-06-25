package com.example.songdevelop.cardgame2;

public class Card {
    public int m_State,m_Color;

    public static final int IMG_RED=1;
    public static final int IMG_GREEN=2;
    public static final int IMG_BLUE=3;

    public static final int CARD_SHOW= 0;
    public static final int CARD_CLOSE= 1;
    public static final int CARD_PLAYEROPEN= 2;
    public static final int CARD_MATCHED= 0;
    public Card(int m_color) {
        m_State = CARD_SHOW;
        this.m_Color = m_color;
    }
}
