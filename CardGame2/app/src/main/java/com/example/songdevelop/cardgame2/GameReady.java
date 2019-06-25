package com.example.songdevelop.cardgame2;

import android.view.MotionEvent;

import java.util.Random;

public class GameReady implements I_GameState {

    @Override
    public I_GameState execute(MotionEvent event) {
        startGame();
        return new GamePlay();
    }

    public void startGame()
    {
        setCardShuffle();
        for(int i = 0 ; i<2;i++ ) {
            for (int j = 0; j < 3; j++)
            {
                CardGameView.m_Shuffle[j][i].m_State = Card.CARD_CLOSE;
            }
        }
        //m_count_fail =0;
    }

    public void setCardShuffle()
    {
        Random rand = new Random();
        Card temp;
        int randx[] = new int[2];
        int randy[] = new int[2];
        for(int i = 0 ; i <10;i++) {
            randx[0] = rand.nextInt(3);
            randy[0] = rand.nextInt(2);
            randx[1] = rand.nextInt(3);
            randy[1] = rand.nextInt(2);
            temp = CardGameView.m_Shuffle[randx[0]][randy[0]];
            CardGameView.m_Shuffle[randx[0]][randy[0]] = CardGameView.m_Shuffle[randx[1]][randy[1]];
            CardGameView.m_Shuffle[randx[1]][randy[1]] = temp;
        }
    }
}
