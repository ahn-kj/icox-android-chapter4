package com.akj.kotlinsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BmiJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // UI로 사용할 레이아웃 XML 파일을 지정한다.
        setContentView(R.layout.layout_view_binding);
    }
}
