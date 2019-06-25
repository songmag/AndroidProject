package com.example.songdevelop.cardgame2;

import android.graphics.Rect;
import android.view.MotionEvent;

public class GamePlay implements I_GameState {
   @Override
    public void execute(StateGame game, MotionEvent event, CardGameView view) {
       int px,py;
       px = (int)event.getX();
       py = (int)event.getY();
       for(int i=0;i<2;i++)
       {
           for(int j = 0 ;j<3;j++)
           {
               Rect box = new Rect(view.x+(j*(view.width+10)),view.y+(i*(view.height+10)),
                       view.x+(j*(view.width+10)+(view.width)),view.y+(i*(view.height+10)+view.height));
               if(box.contains(px,py))
               {
                   if(view.m_SelectCard_1 == null && view.m_Shuffle[j][i].m_State != Card.CARD_MATCHED)
                   {
                       view.m_SelectCard_1 = view.m_Shuffle[j][i];
                       view.m_SelectCard_1.m_State = Card.CARD_PLAYEROPEN;
                   }
                   else {
                       if (view.m_SelectCard_1 != view.m_Shuffle[j][i] && view.m_Shuffle[j][i].m_State != Card.CARD_MATCHED) {
                           view.m_SelectCard_2 = view.m_Shuffle[j][i];
                           view.m_SelectCard_2.m_State = Card.CARD_PLAYEROPEN;
                       }
                   }
                   view.m_Sound_Pool.play(view.m_Effect_id_1,1,1,0,0,1);
               }
           }
       }
    }
}
