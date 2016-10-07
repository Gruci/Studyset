package com.example.joan.androidcomplete;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Joan on 2016-10-07.
 */

public class inflation4 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inflation4);

        Button btn = (Button)findViewById(R.id.btnnewmessage);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                RelativeLayout rel = (RelativeLayout)View.inflate(
                        inflation4.this, R.layout.newmessage, null);

                LinearLayout linear = (LinearLayout)findViewById(R.id.linear);
                if(linear.getChildCount() % 2 == 0) {
                    rel.setBackgroundColor(Color.GRAY);
                } else {
                    rel.setBackgroundColor(Color.BLUE);
                }
                linear.addView(rel);
            }
        });
    }
}
