package com.example.joan.kdh.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.joan.kdh.R;


/**
 * Created by Joan on 2016-09-23.
 */

public class Button extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);

        //button onclick 구현
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Button.this, "버튼이 클릭되었습니다", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

