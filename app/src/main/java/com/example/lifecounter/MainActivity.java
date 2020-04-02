package com.example.lifecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private LinearLayout linearLayoutView1;
    //private LinearLayout linearLayoutView2;
    private LinearLayout linearLayoutView3;
    private TextView lifeCountTextView3;
    private Button increaseLifeCountButton3;
    private Button decreaseLifeCountButton3;
    //private LinearLayout linearLayoutView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // grab handles for relative layouts 1 and 2

        //linearLayoutView1 = (LinearLayout) findViewById(R.id.linearLayoutView1ID);
        //linearLayoutView2 = (LinearLayout) findViewById(R.id.linearLayoutView2ID);
        linearLayoutView3 = (LinearLayout) findViewById(R.id.linearLayoutView3ID);
        lifeCountTextView3 = (TextView) findViewById(R.id.lifeCountViewID3);
        increaseLifeCountButton3 = (Button) findViewById(R.id.increaseLifeCountButtonViewID3);
        decreaseLifeCountButton3 = (Button) findViewById(R.id.decreaseLifeCountButtonViewID3);
        //linearLayoutView4 = (LinearLayout) findViewById(R.id.linearLayoutView4ID);

        lifeCountTextView3.setText("40");
        increaseLifeCountButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(lifeCountTextView3.getText().toString());
                lifeCount = lifeCount + 1;
                lifeCountTextView3.setText(new String(String.valueOf(lifeCount)));
            }
        });

        decreaseLifeCountButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(lifeCountTextView3.getText().toString());
                lifeCount = lifeCount - 1;
                lifeCountTextView3.setText(new String(String.valueOf(lifeCount)));
            }
        });
    }
}
