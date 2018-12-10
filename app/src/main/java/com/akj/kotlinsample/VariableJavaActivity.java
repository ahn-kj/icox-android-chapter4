package com.akj.kotlinsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VariableJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // UI 로 사용할 XML 파일을 지정한다.
        setContentView(R.layout.layout_variable);
    }
}
