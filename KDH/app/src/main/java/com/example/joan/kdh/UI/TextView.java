package com.example.joan.kdh.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.util.Linkify;

import com.example.joan.kdh.R;

/**
 * Created by Joan on 2016-09-22.
 */

public class TextView extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);

        android.widget.TextView textView2 = (android.widget.TextView) findViewById(R.id.textView2);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setAutoLinkMask(Linkify.WEB_URLS);
        textView2.setText("프로그램에서 설정한 URL http://www.naver.com");

    }
}