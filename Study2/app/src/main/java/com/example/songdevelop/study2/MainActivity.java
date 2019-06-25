package com.example.songdevelop.study2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void phoneCall(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-0000-0000"));
        startActivity(intent);
    }
    public void toast_event(View v)
    {
        Toast.makeText(getApplicationContext(),"click Button",Toast.LENGTH_SHORT).show();
    }
    public void web_event(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }
    public void menu_event(View v)
    {
        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(intent);
    }
}
