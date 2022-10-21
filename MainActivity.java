package com.example.imagedice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonListenerMethod();
        seekBarSize();
    }
    public void  seekBarSize(){
        final ImageView diceSize = findViewById(R.id.DiceImage);
        SeekBar BarSize = findViewById(R.id.seekBarSize);
        BarSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                switch (progress){
                    case 1:
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(10, 10);
                        diceSize.setLayoutParams(layoutParams);
                        break;

                    case 2:
                        layoutParams = new LinearLayout.LayoutParams(20, 20);
                        diceSize.setLayoutParams(layoutParams);
                        break;

                    case 3:
                        layoutParams = new LinearLayout.LayoutParams(30,30);
                        diceSize.setLayoutParams(layoutParams);
                        break;

                    case 4:
                        layoutParams = new LinearLayout.LayoutParams(40,40);
                        diceSize.setLayoutParams(layoutParams);
                        break;

                    case 5:
                        layoutParams = new LinearLayout.LayoutParams(50,50);
                        diceSize.setLayoutParams(layoutParams);
                        break;

                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                diceSize.setVisibility(View.VISIBLE);

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                diceSize.setVisibility(View.INVISIBLE);

            }
        });

    }

    public void buttonListenerMethod(){

        Button btn = findViewById(R.id.buttonRoll);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rnd = new Random();
                int resultRnd = rnd.nextInt(6) + 1;
                TextView returnText = findViewById(R.id.DiceResult);
                returnText.setText("Resultado do dado: " + Integer.toString(resultRnd));
                ImageView diceImage = findViewById(R.id.DiceImage);
                switch (resultRnd){
                    case 1:
                        diceImage.setImageResource(R.drawable.f1);
                        break;

                    case 2:
                        diceImage.setImageResource(R.drawable.f2);
                        break;

                    case 3:
                        diceImage.setImageResource(R.drawable.f3);
                        break;

                    case 4:
                        diceImage.setImageResource(R.drawable.f4);
                        break;

                    case 5:
                        diceImage.setImageResource(R.drawable.f5);
                        break;

                    case 6:
                        diceImage.setImageResource(R.drawable.f6);
                        break;

                }

            }
        });

    }

}
