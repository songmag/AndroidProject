package com.example.songdevelop.cardgame2;

import android.view.MotionEvent;

public interface I_GameState {
    void execute(StateGame game,MotionEvent event,CardGameView view);
}
