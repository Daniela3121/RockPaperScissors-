package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int otherScore = 0;
    int reset = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// linking the buttons

        Button rock = findViewById(R.id.rock);
        final Button paper = findViewById(R.id.paper);
        final Button scissors = findViewById(R.id.scissors);
        final Button button = findViewById(R.id.button);
        //String userChoice = "";

//linking the textViews
        final TextView result = findViewById(R.id.result);
        final TextView textView3 = findViewById(R.id.textView3);
        final TextView userScore = findViewById(R.id.userScore);
        final TextView opponentScore = findViewById(R.id.opponentScore);

//linking the imageViews
        final ImageView userChoice = findViewById(R.id.userChoice);
        final ImageView imagePaper = findViewById(R.id.imagePaper);


        //setting the listeners

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //userChoice = "r";
                //Select random number 0,1,or 2, where 0=rock, 1=paper, 2=scissor
                int rnd = (int)(Math.random() * 3);
                userChoice.setImageResource(R.drawable.rockkk);

                if (rnd == 1) {

                imagePaper.setImageResource(R.drawable.paper);
                result.setText("you lost <('o'<)");
                otherScore++;
                opponentScore.setText("comp Score: "+otherScore);

                }

                if (rnd == 2){

                    imagePaper.setImageResource(R.drawable.scissors);
                    result.setText("YOU WON!!");
                    score++;
                    userScore.setText("Your score: " + score);

                    
                }

                if(rnd == 0){
                    imagePaper.setImageResource(R.drawable.rockkk);
                    result.setText("its a tie (-_-)");

                }



            }

        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = (int)(Math.random() * 3);
                userChoice.setImageResource(R.drawable.paper);

            if ( rnd == 0){
                imagePaper.setImageResource(R.drawable.rockkk);
                result.setText("YOU WON!!");
                score++;
                userScore.setText("Your score: " + score);

            }

            if (rnd ==1){
                imagePaper.setImageResource(R.drawable.paper);
                result.setText("its a tie (-_-)");
            }

            if (rnd==2){
                imagePaper.setImageResource(R.drawable.scissors);
                result.setText("you lost <('o'<)");
                otherScore++;
                opponentScore.setText("comp Score: "+otherScore);
            }


            }
        });


        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = (int)(Math.random() * 3);
                userChoice.setImageResource(R.drawable.scissors);

            if(rnd==0){
                imagePaper.setImageResource(R.drawable.rockkk);
                result.setText("you lost <('o'<)");
                otherScore++;
                opponentScore.setText("comp Score: "+otherScore);
                // add to comp score

            }
            if(rnd==1){
                imagePaper.setImageResource(R.drawable.paper);
                result.setText("YOU WON!!");
                score++;
                userScore.setText("Your score: " + score);
                //add to score
            }

            if(rnd==2){
                imagePaper.setImageResource(R.drawable.scissors);
                result.setText("its a tie (-_-)");
                //  score stays same
            }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                otherScore = 0;
                userChoice.setImageResource(R.drawable.player_1);
                imagePaper.setImageResource(R.drawable.player_2);
                result.setText("CHOOSE!!");
                userScore.setText("your score: 0");
                opponentScore.setText("comp score: 0");
            }
        });

    }

}
