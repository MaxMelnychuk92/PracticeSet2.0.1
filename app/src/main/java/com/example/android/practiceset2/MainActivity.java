package com.example.android.practiceset2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int score = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
score = score + 1;
        displayForTeamA(score);

    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        score = score + 2;
        displayForTeamA(score);

    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        score = score + 3;
        displayForTeamA(score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
            }


    public void addOneForTeamB(View v) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);

    }


    public void addTwoForTeamB(View v) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);

    }


    public void addThreeForTeamB(View v) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }


    public void displayForTeamB(int scoreB) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_score);
            scoreView.setText(String.valueOf(scoreB));
            }

    public void reset(View v) {
        scoreB = 0;
        score = 0;
        displayForTeamB(scoreB);
        displayForTeamA(score);
    }




}