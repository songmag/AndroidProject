package com.example.songdevelop.cardgame2;

import android.content.Intent;
import android.util.Log;
import android.view.MotionEvent;

public class EndGame implements I_GameState {
    @Override
    public void execute(StateGame game, MotionEvent event, CardGameView view) {

        game.setCurrent(game.getReady());
        Log.e("EndGame","EndGAME!");

        Intent intent = new Intent(view.getSuper_context(),EndGameView.class);
        intent.putExtra("m_fail_count",view.m_count_fail);
        view.getSuper_context().startActivity(intent);
    }
}
