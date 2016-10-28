package com.myles.udacity.basketcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.Integer;

public class MainActivity extends AppCompatActivity {
    /*
          * Score records of Upper team
          */
    int scoreUpper;
    int score1PointUpper;
    int score2PointUpper;
    int score3PointUpper;
    int foulUpper;

    /*
        * Score records of Lower team
       */
    int scoreLower;
    int score1PointLower;
    int score2PointLower;
    int score3PointLower;
    int foulLower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreUpper = 0;
        score1PointUpper = 0;
        score2PointUpper = 0;
        score3PointUpper = 0;
        foulUpper = 0;

        scoreLower = 0;
        score1PointLower = 0;
        score2PointLower = 0;
        score3PointLower = 0;
        foulLower = 0;
    }

    public void reset(View view) {
        TextView tv;
        /*
                * Reset Upper Side Score Records
                */
        scoreUpper = 0;
        tv = (TextView) findViewById(R.id.score_upper);
        tv.setText(Integer.toString(scoreUpper));
        score1PointUpper = 0;
        tv = (TextView) findViewById(R.id.score_1pt_upper);
        tv.setText(Integer.toString(score1PointUpper));
        score2PointUpper = 0;
        tv = (TextView) findViewById(R.id.score_2pt_upper);
        tv.setText(Integer.toString(score2PointUpper));
        score3PointUpper = 0;
        tv = (TextView) findViewById(R.id.score_3pt_upper);
        tv.setText(Integer.toString(score3PointUpper));
        foulUpper = 0;
        tv = (TextView) findViewById(R.id.foul_time_upper);
        tv.setText(Integer.toString(foulUpper));

        /*
                 * Reset Lower side Score record
                  */
        scoreLower = 0;
        tv = (TextView) findViewById(R.id.score_lower);
        tv.setText(Integer.toString(scoreLower));
        score1PointLower = 0;
        tv = (TextView) findViewById(R.id.score_1pt_lower);
        tv.setText(Integer.toString(score1PointLower));
        score2PointLower = 0;
        tv = (TextView) findViewById(R.id.score_2pt_lower);
        tv.setText(Integer.toString(score2PointLower));
        score3PointLower = 0;
        tv = (TextView) findViewById(R.id.score_3pt_lower);
        tv.setText(Integer.toString(score3PointLower));
        foulLower = 0;
        tv = (TextView) findViewById(R.id.foul_time_lower);
        tv.setText(Integer.toString(foulLower));
    }

    /*
        * Upper side actions
        */
    public void foulActionUpper(View view) {
        foulUpper++;
        TextView tv = (TextView) findViewById(R.id.foul_time_upper);
        tv.setText(Integer.toString(foulUpper));
    }

    public void scoreOneUpper(View view) {
        score1PointUpper++;
        scoreUpper = scoreUpper + 1;
        TextView tv;
        tv = (TextView) findViewById(R.id.score_1pt_upper);
        tv.setText(Integer.toString(score1PointUpper));
        tv = (TextView) findViewById(R.id.score_upper);
        tv.setText(Integer.toString(scoreUpper));
    }

    public void scoreTwoUpper(View view) {
        score2PointUpper++;
        scoreUpper = scoreUpper + 2;
        TextView tv = (TextView) findViewById(R.id.score_2pt_upper);
        tv.setText(Integer.toString(score2PointUpper));
        tv = (TextView) findViewById(R.id.score_upper);
        tv.setText(Integer.toString(scoreUpper));
    }

    public void scoreThreeUpper(View view) {
        score3PointUpper++;
        scoreUpper = scoreUpper + 3;
        TextView tv = (TextView) findViewById(R.id.score_3pt_upper);
        tv.setText(Integer.toString(score3PointUpper));
        tv = (TextView) findViewById(R.id.score_upper);
        tv.setText(Integer.toString(scoreUpper));
    }

    /*
        * Lower side actions
         */
    public void foulActionLower(View view) {
        foulLower++;
        TextView tv = (TextView) findViewById(R.id.foul_time_lower);
        tv.setText(Integer.toString(foulLower));
    }

    public void scoreOneLower(View view) {
        score1PointLower++;
        scoreLower = scoreLower + 1;
        TextView tv;
        tv = (TextView) findViewById(R.id.score_1pt_lower);
        tv.setText(Integer.toString(score1PointLower));
        tv = (TextView) findViewById(R.id.score_lower);
        tv.setText(Integer.toString(scoreLower));
    }

    public void scoreTwoLower(View view) {
        score2PointLower++;
        scoreLower = scoreLower + 2;
        TextView tv = (TextView) findViewById(R.id.score_2pt_lower);
        tv.setText(Integer.toString(score2PointLower));
        tv = (TextView) findViewById(R.id.score_lower);
        tv.setText(Integer.toString(scoreLower));
    }

    public void scoreThreeLower(View view) {
        score3PointLower++;
        scoreLower = scoreLower + 3;
        TextView tv = (TextView) findViewById(R.id.score_3pt_lower);
        tv.setText(Integer.toString(score3PointLower));
        tv = (TextView) findViewById(R.id.score_lower);
        tv.setText(Integer.toString(scoreLower));
    }
}
