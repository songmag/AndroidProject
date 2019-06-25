package com.example.songdevelop.cardgame2;

import android.view.View;

public class T_GameChecking extends Thread {
    private CardGameView m_view;
    public T_GameChecking(CardGameView view)
    {
        m_view = view;
    }
    public void run()
    {
        while(true) {
            m_view.checkMatch();
        }
    }
}
