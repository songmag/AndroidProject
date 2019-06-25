package com.example.songdevelop.cardgame2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class EndGameView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game_view);
        Intent intent = getIntent();
        int m_fail_count =intent.getExtras().getInt("m_fail_count");
        TextView textView = (TextView)findViewById(R.id.count_Fail);
        textView.setText("Fail_Count : "+String.valueOf(m_fail_count));
    }
    public void onGameStart(View view)
    {
        finish();
    }
}
