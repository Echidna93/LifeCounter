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

    private TextView lifeCountTextView3;

    public Button increaseLifeCountButton3;
    public Button decreaseLifeCountButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // grab handles for relative layouts 1 and 2

        /*
        TODO: replace intiializations with case switch statement and
            look at the PetBio project for example
        */
        lifeCountTextView3 = (TextView) findViewById(R.id.lifeCountView3ID);
        increaseLifeCountButton3 = (Button) findViewById(R.id.increaseLifeCountButtonView3ID);
        decreaseLifeCountButton3 = (Button) findViewById(R.id.decreaseLifeCountButtonView3ID);

        /*
        TODO: Replace setText statement with better statement that will be easy to port over to new
            view to initialize games based on play style
         */
        lifeCountTextView3.setText("40");
        /*m n

        TODO: Replace onClick() with onTouch event to allow
         user to increase life total in larger increments
        */
        increaseLifeCountButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseLifeTotal();
            }
        });

        decreaseLifeCountButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseLifeTotal();
            }
        });

    }
    public void decreaseLifeTotal(){
        int lifeCount = Integer.parseInt(lifeCountTextView3.getText().toString());
        lifeCount = lifeCount - 1;
        lifeCountTextView3.setText(new String(String.valueOf(lifeCount)));
    }
    public void increaseLifeTotal(){
        int lifeCount = Integer.parseInt(lifeCountTextView3.getText().toString());
        lifeCount = lifeCount + 1;
        lifeCountTextView3.setText(new String(String.valueOf(lifeCount)));
    }
}
