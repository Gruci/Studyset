package com.example.joan.kdh.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.joan.kdh.R;

/**
 * Created by Joan on 2016-09-23.
 */

public class ProgressBar extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbar);

        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(R.id.progressbar_horizontal);
        progressBar.setMax(100);
        progressBar.setProgress(30);
        progressBar.setSecondaryProgress(70);
    }
}