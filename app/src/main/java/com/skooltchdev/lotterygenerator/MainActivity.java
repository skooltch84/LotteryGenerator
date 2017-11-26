package com.skooltchdev.lotterygenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private TextView mFirstNumber, mSecondNumber, mThirdNumber, mFourthNumber, mFifthNumber, mPowerBall;
    private Button mGenerateButton;

    private String [] powerBalls  = {
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
            "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        generateRandomNumbers();


        mGenerateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateRandomNumbers();



            }
        });
    }

    public void generateRandomNumbers(){
        Collections.shuffle(Arrays.asList(powerBalls));
        mFirstNumber.setText(powerBalls[0]);
        mSecondNumber.setText(powerBalls[1]);
        mThirdNumber.setText(powerBalls[2]);
        mFourthNumber.setText(powerBalls[3]);
        mFifthNumber.setText(powerBalls[4]);

        Random rand = new Random();
        int powerBall = (rand.nextInt(10)+1);
        mPowerBall.setText(powerBall + "");
    }


    public void bindViews(){
        mFirstNumber = (TextView)findViewById(R.id.firstNumber);
        mSecondNumber = (TextView)findViewById(R.id.secondNumber);
        mThirdNumber = (TextView)findViewById(R.id.thirdNumber);
        mFourthNumber = (TextView)findViewById(R.id.fourthNumber);
        mFifthNumber = (TextView)findViewById(R.id.fifthNumber);
        mPowerBall = (TextView)findViewById(R.id.powerBall);
        mGenerateButton = (Button)findViewById(R.id.generateButton);
    }
}
