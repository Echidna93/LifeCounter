package com.example.lifecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layoutView1;
    private RelativeLayout getLayoutView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // grab handles for relative layouts 1 and 2
        layoutView1 = (RelativeLayout) findViewById(R.id.layoutView1ID);
        getLayoutView2 = (RelativeLayout) findViewById(R.id.layoutView2ID);



    }
}
