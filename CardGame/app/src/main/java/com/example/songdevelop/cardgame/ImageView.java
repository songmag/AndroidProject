package com.example.songdevelop.cardgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

public class ImageView extends View {

    public ImageView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Bitmap _android = BitmapFactory.decodeResource(getResources(),R.drawable.android);
        canvas.drawBitmap(_android,0,0,null);
    }
}
