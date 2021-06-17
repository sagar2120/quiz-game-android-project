package com.example.mtc.quizup;

import android.app.Activity;
import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


public class result extends Activity {
public ImageView img;
    public TextView score;
    public RatingBar ratingbar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        img=(ImageView)findViewById(R.id.img1);
        ratingbar1=(RatingBar)findViewById(R.id.ratingBar1);
        score=(TextView)findViewById(R.id.score);
        String score2=getIntent().getStringExtra("score");
        score.setText(score2.toString());



        int score1=Integer.parseInt(score2.toString());
        ratingbar1.setRating(score1);
        if(score1 > 0 && score1 < 10 ){
            img.setImageResource(R.drawable.score_0);
            ratingbar1.setRating(0f);
        }else if(score1 > 10 && score1<=15){
            img.setImageResource(R.drawable.score_1);
            ratingbar1.setRating(1f);
        }else if(score1 > 15 && score1 <= 20){
            img.setImageResource(R.drawable.score_2);
            ratingbar1.setRating(2f);

        }else if(score1 >= 21&& score1<=25 ){
            img.setImageResource(R.drawable.score_3);
            ratingbar1.setRating(3f);

        }else if(score1 >= 25 && score1 < 30){
            img.setImageResource(R.drawable.score_4);
            ratingbar1.setRating(4f);

        }else if(score1 >= 30){
            img.setImageResource(R.drawable.score_5);
            ratingbar1.setRating(5f);

        }

    }

    public void play (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }




}
