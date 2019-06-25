package com.example.songdevelop.cardgame2;

import android.util.Log;
import android.view.MotionEvent;

public class GameReady implements I_GameState {
    @Override
    public void execute(StateGame game, MotionEvent event, CardGameView view) {
        Log.e("Ready","ReadyGAME!");
        view.startGame();
        game.setCurrent(game.getPlay());
    }
}
