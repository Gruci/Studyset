package com.example.joan.androidcomplete;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Joan on 2016-10-04.
 */

public class Inflation3 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);
        linear.setBackgroundColor(Color.LTGRAY);

        TextView text = (TextView) View.inflate(this, R.layout.mytext, null);

        linear.addView(text);
        setContentView(linear);
    }
}
