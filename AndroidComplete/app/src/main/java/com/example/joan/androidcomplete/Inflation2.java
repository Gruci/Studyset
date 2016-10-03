package com.example.joan.androidcomplete;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Joan on 2016-10-03.
 */

public class Inflation2 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);
        linear.setBackgroundColor(Color.LTGRAY);

        TextView text = new TextView(this);
        text.setText("class Text");
        text.setGravity(Gravity.CENTER);
        text.setTextColor(Color.RED);
        text.setTextSize(20);

        linear.addView(text);
        setContentView(linear);
    }
}
