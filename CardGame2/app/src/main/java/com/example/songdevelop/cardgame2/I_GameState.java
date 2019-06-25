package com.example.songdevelop.cardgame2;

import android.view.MotionEvent;

public interface I_GameState {
    I_GameState execute(MotionEvent event);
}
