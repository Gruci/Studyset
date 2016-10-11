package com.example.joan.androidcomplete;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Joan on 2016-10-11.
 */

public class HandleEvent extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View vw = new View(this);
        
        /**
        vw.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Toast.makeText(HandleEvent.this, "Touch Event Receved",
                            Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
         */

        vw.setOnTouchListener(TouchListener);
        setContentView(vw);
    }

    View.OnTouchListener TouchListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(HandleEvent.this, "Touch Event Received",
                        Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    };
}
