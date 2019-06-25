package com.example.songdevelop.cardgame2;

import android.graphics.Rect;
import android.view.MotionEvent;

public class GamePlay implements I_GameState {
    @Override
    public I_GameState execute(MotionEvent event) {
        int px,py;
        px = (int)event.getX();
        py = (int)event.getY();
        for(int i=0;i<2;i++)
        {
            for(int j = 0 ;j<3;j++)
            {
                Rect box = new Rect(CardGameView.x+(j*(CardGameView.width+10)),CardGameView.y+(i*(CardGameView.height+10)),
                        CardGameView.x+(j*(CardGameView.width+10)+(CardGameView.width)),CardGameView.y+(i*(CardGameView.height+10)+CardGameView.height));
                if(box.contains(px,py))
                {
                    if(CardGameView.m_SelectCard_1 == null && CardGameView.m_Shuffle[j][i].m_State != Card.CARD_MATCHED)
                    {
                        CardGameView.m_SelectCard_1 = CardGameView.m_Shuffle[j][i];
                        CardGameView.m_SelectCard_1.m_State = Card.CARD_PLAYEROPEN;

                         /*  if(!m_Effect_1.isPlaying()) {
                                m_Effect_1.start();
                            }
*/
                    }
                    else {
                        if (CardGameView.m_SelectCard_1 != CardGameView.m_Shuffle[j][i] && CardGameView.m_Shuffle[j][i].m_State != Card.CARD_MATCHED) {
                            CardGameView.m_SelectCard_2 = CardGameView.m_Shuffle[j][i];
                            CardGameView.m_SelectCard_2.m_State = Card.CARD_PLAYEROPEN;
                        }
                        /*    if(!m_Effect_1.isPlaying()) {
                                m_Effect_1.start();
                            }*/
                    }
                }
            }
        }
        if(isFinish())
        {
            return new EndGame();
        }
        return this;
    }

    public boolean isFinish()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(CardGameView.m_Shuffle[j][i].m_State != Card.CARD_MATCHED){
                    return false;
                }
            }
        }
        return true;
    }
}
