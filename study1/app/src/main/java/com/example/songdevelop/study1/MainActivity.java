package com.example.songdevelop.study1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast_btn_click(View v) {
        EditText text;
        text = (EditText) findViewById(R.id.text_ed);
        Toast.makeText(getApplicationContext(), text.getText(), Toast.LENGTH_LONG).show();
    }

    public void call_btn_click(View v) {
        EditText text;
        text = (EditText) findViewById(R.id.phoneCall);
        if (text.getText().length() <= 0) {
            Toast.makeText(getApplicationContext(), "phone number insert plz", Toast.LENGTH_LONG).show();
        } else {
            Intent phone = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:" + text.getText()));
            startActivity(phone);
        }
    }
}
