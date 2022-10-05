package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    ImageView diceImage;
    Random rollNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice(){
        int dice = rollNumber.nextInt(6);

        //val resultTextView: TextView = findViewById(R.id.textView)
        //resultTextView.text = diceRoll.toString()

        diceImage = findViewById(R.id.imageView);
        if(dice == 1){
            diceImage.setImageResource(R.drawable.dice_1);
        }
        else if (dice == 2){
            diceImage.setImageResource(R.drawable.dice_2);
        }
        else if (dice == 3){
            diceImage.setImageResource(R.drawable.dice_3);
        }
        else if (dice == 4){
            diceImage.setImageResource(R.drawable.dice_4);
        }
        else if (dice == 5){
            diceImage.setImageResource(R.drawable.dice_5);
        }
        else if (dice == 6){
            diceImage.setImageResource(R.drawable.dice_6);
        }
    }
}