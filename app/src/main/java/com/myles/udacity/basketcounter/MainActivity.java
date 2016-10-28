package com.myles.udacity.basketcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.Integer;

public class MainActivity extends AppCompatActivity {
    int score;
    int score1Point;
    int score2Point;
    int score3Point;
    int foul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score=0;
        score1Point=0;
        score2Point=0;
        score3Point=0;
        foul=0;
    }
    public void reset(View view){
        TextView tv;
        score=0;
        tv=(TextView)findViewById(R.id.score_upper);
        tv.setText(Integer.toString(score));
        score1Point=0;
        tv=(TextView)findViewById(R.id.score_1pt_upper);
        tv.setText(Integer.toString(score1Point));
        score2Point=0;
        tv=(TextView)findViewById(R.id.score_2pt_upper);
        tv.setText(Integer.toString(score2Point));
        score3Point=0;
        tv=(TextView)findViewById(R.id.score_3pt_upper);
        tv.setText(Integer.toString(score3Point));
        foul=0;
        tv=(TextView)findViewById(R.id.foul_time_upper);
        tv.setText(Integer.toString(foul));
    }
    public void foulAction(View view){
        foul++;
        TextView tv=(TextView)findViewById(R.id.foul_time_upper);
        tv.setText(Integer.toString(foul));
    }
    public void scoreOne(View view){
        score1Point++;
        TextView tv=(TextView)findViewById(R.id.score_1pt_upper);
        tv.setText(Integer.toString(score1Point));
    }
    public void scoreTwo(View view){
        score2Point++;
        TextView tv=(TextView)findViewById(R.id.score_2pt_upper);
        tv.setText(Integer.toString(score2Point));
    }
    public void scoreThree(View view){
        score3Point++;
        TextView tv=(TextView)findViewById(R.id.score_3pt_upper);
        tv.setText(Integer.toString(score3Point));
    }
}
