package com.heyworld.randomnumberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ImageView diceImageView;
    private Random rng = new Random ();


    //onCreate
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        diceImageView = findViewById (R.id.dice_img_view);
        diceImageView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view){
                rollDice ();
            }
        });
    }
    //onCreate

    //It rolls the dice. It runs inside onCreate()/diceImageView
    private void rollDice(){
        Log.d (TAG, "rollDice: rolling the dice");

        int randomNumber = rng.nextInt (6) + 1;

        switch(randomNumber){
            case 1: diceImageView.setImageResource (R.drawable.img1);
            break;

            case 2: diceImageView.setImageResource (R.drawable.img2);
                break;

            case 3: diceImageView.setImageResource (R.drawable.img3);
                break;

            case 4: diceImageView.setImageResource (R.drawable.img4);
                break;

            case 5: diceImageView.setImageResource (R.drawable.img5);
                break;

            case 6: diceImageView.setImageResource (R.drawable.img6);
                break;
        }
    }
    //It rolls the dice. It runs inside onCreate()/diceImageView



}//Main