package com.example.songdevelop.study2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void setBack(View v){
        Toast.makeText(getApplicationContext(),"back!!",Toast.LENGTH_SHORT).show();
        finish();
    }
}
