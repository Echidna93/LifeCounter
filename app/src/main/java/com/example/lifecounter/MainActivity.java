package com.example.lifecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayoutView1;
    private LinearLayout linearLayoutView2;
    private LinearLayout linearLayoutView3;
    private LinearLayout linearLayoutView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // grab handles for relative layouts 1 and 2
        linearLayoutView1 = (LinearLayout) findViewById(R.id.linearLayoutView1ID);
        linearLayoutView2 = (LinearLayout) findViewById(R.id.linearLayoutView2ID);
        linearLayoutView3 = (LinearLayout) findViewById(R.id.linearLayoutView3ID);
        linearLayoutView4 = (LinearLayout) findViewById(R.id.linearLayoutView4ID);


    }
}
