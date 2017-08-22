package com.example.hasee.demo_messagetool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mViewById;
    String a="HAAAAAAAAAAAAAAAAA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewById = (TextView)findViewById(R.id.textView01);
        mViewById.setText("HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

    }
}
