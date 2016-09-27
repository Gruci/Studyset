package com.example.joan.kdh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*TextView myText = new TextView(this);
        myText.setText("java를 활용한 레이아웃 구성");
        setContentView(myText);*/

        setContentView(R.layout.activity_main);
        
    }
}
