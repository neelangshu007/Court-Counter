package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamAScore = 0;    // Team A initial score
    int teamBScore = 0;    // Team B initial score

    // increase Team A score by 2
    public void twoPointsIncrementTeamA(View view){
        teamAScore += 2;
        displayScoreTeamA(teamAScore);
    }

    // increase Team A score by 3
    public void threePointsIncrementTeamA(View view){
        teamAScore += 3;
        displayScoreTeamA(teamAScore);
    }

    // increase Team A score by 1
    public void freeThrowPointsIncrementTeamA(View view){
        teamAScore += 1;
        displayScoreTeamA(teamAScore);
    }

    // increase Team B score by 2
    public void twoPointsIncrementTeamB(View view){
        teamBScore += 2;
        displayScoreTeamB(teamBScore);
    }

    // increase Team B score by 3
    public void threePointsIncrementTeamB(View view){
        teamBScore += 3;
        displayScoreTeamB(teamBScore);
    }

    // increase Team B score by 1
    public void freeThrowPointsIncrementTeamB(View view){
        teamBScore += 1;
        displayScoreTeamB(teamBScore);
    }

    // reset Team A and Team B score to zero
    public void resetScore(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayScoreTeamA(teamAScore);
        displayScoreTeamB(teamBScore);
    }

    // displaying Team A score
    private void displayScoreTeamA(int score){
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText(String.valueOf(score));
    }

    // displaying Team B score
    private void displayScoreTeamB(int score){
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText(String.valueOf(score));
    }



}