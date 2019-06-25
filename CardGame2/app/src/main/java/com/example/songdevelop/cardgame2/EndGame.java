package com.example.songdevelop.cardgame2;

import android.view.MotionEvent;

public class EndGame implements I_GameState {
    @Override
    public I_GameState execute(MotionEvent event) {
        return new GameReady();
    }
}
