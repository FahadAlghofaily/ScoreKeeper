package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addHomeGoal(View view){
        TextView scoreTextView = (TextView) findViewById(R.id.home_score_text_view);
        int score =  Integer.parseInt(scoreTextView.getText().toString());
        score++;
        scoreTextView.setText(""+score);

    }
    public void addHomeRed(View view){
        TextView redTextView = (TextView) findViewById(R.id.home_red_text_view);
        int number =  Integer.parseInt(redTextView.getText().toString());
        number++;
        redTextView.setText(""+number);
    }
    public void addHomeYellow(View view){
        TextView yellowTextView = (TextView) findViewById(R.id.home_yellow_text_view);
        int number =  Integer.parseInt(yellowTextView.getText().toString());
        number++;
        yellowTextView.setText(""+number);
    }
    public void addAwayGoal(View view){
        TextView scoreTextView = (TextView) findViewById(R.id.away_score_text_view);
        int score =  Integer.parseInt(scoreTextView.getText().toString());
        score++;
        scoreTextView.setText(""+score);

    }
    public void addAwayRed(View view){
        TextView redTextView = (TextView) findViewById(R.id.away_red_text_view);
        int number =  Integer.parseInt(redTextView.getText().toString());
        number++;
        redTextView.setText(""+number);
    }
    public void addAwayYellow(View view){
        TextView yellowTextView = (TextView) findViewById(R.id.away_yellow_text_view);
        int number =  Integer.parseInt(yellowTextView.getText().toString());
        number++;
        yellowTextView.setText(""+number);
    }
    public void reset(View view){
        ArrayList<TextView> array = new ArrayList<TextView>();
        array.add((TextView)findViewById(R.id.home_score_text_view));
        array.add((TextView) findViewById(R.id.home_red_text_view));
        array.add((TextView) findViewById(R.id.home_yellow_text_view));
        array.add((TextView) findViewById(R.id.away_yellow_text_view));
        array.add((TextView) findViewById(R.id.away_red_text_view));
        array.add((TextView) findViewById(R.id.away_score_text_view));

        for(int j =0 ; j<array.size(); j++){
            array.get(j).setText("0");
        }

    }

}
