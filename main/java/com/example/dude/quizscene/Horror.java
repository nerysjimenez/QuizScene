package com.example.dude.quizscene;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Horror extends AppCompatActivity {
private Button B1;
    private  Button B2;
    private  Button B3;
    private  Button B4;
    private TextView Question;
    private TextView Score;
 private    String g;
 private Vibrator vibrator;
private boolean isVibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);
        Intent i=getIntent();
        int r= i.getIntExtra("answer",0);
      g= Context.VIBRATOR_SERVICE;
 vibrator=(Vibrator)getSystemService(g);
isVibrate=vibrator.hasVibrator();
        B1=(Button)findViewById(R.id.B1h);
        B2=(Button)findViewById(R.id.B2h);
        B3=(Button)findViewById(R.id.B3h);
        B4=(Button)findViewById(R.id.B4h);
        Question=(TextView)findViewById(R.id.questionTh);
        Score=(TextView)findViewById(R.id.scoreTh);
        setQuestion(r);


    }
    private void setQuestion(int i){
        if(i==1){
            Question.setText("British actor Boris Karloff created a cinematic icon when he played the role of what monster?");
            B1.setText("Dracula");
            B2.setText("Werewolf");
            B3.setText("Frankenstein");
            B4.setText("Alien");
            Score.setText("score=0");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                  Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",1);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);

                }
            });
        }
        else if(i==2){
            Question.setText("In this 1970s book and novel, a mother believes her child (played by Linda Blair in the movie) is what?");
            B1.setText("An alien");
            B2.setText("The devil");
            B3.setText("Possessed by a demon");
            B4.setText("Bearing the devil's baby");
            Score.setText("Score=1");
B1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",2);
                    startActivity(f);
                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==3){
            Question.setText("Halloween primarily takes place in which state?");
            B1.setText("Ohio");
            B2.setText("Indiana");
            B3.setText("California");
            B4.setText("Illinois");
            Score.setText("score=2");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",3);
                    startActivity(f);
                }
            });
        }
        else if(i==4){
            Question.setText("In a horror movie, you should worry if you encounter a doll named what? ");
            B1.setText("Smiley");
            B2.setText("Bonnie");
            B3.setText("Chucky");
            B4.setText("Dolly");
            Score.setText("Score=3");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",4);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==5){
            Question.setText("You can never really go home again, or at least you shouldn't if your neighbors belong to this profession?  ");
            B1.setText("Slaughterhouse workers");
            B2.setText("Morticians");
            B3.setText("Chefs");
            B4.setText("Veterinarians");
            Score.setText("Score=4");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",5);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
        }
        else if(i==6){
            Question.setText("What is the name of the main protagonist in Night of The Living Dead?  ");
            B1.setText("Billy");
            B2.setText("Steve");
            B3.setText("Freddy");
            B4.setText(" Ben");
            Score.setText("Score=5");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",6);
                    startActivity(f);
                }
            });
        }
        else if(i==7){
            Question.setText("Kevin Williamson was inspired to write Scream after watching a documentary about which real-life serial killer? ");
            B1.setText("Ted Bundy");
            B2.setText("The Gainesville Ripper");
            B3.setText("Charles Manson");
            B4.setText(" The Boston Strangler");
            Score.setText("Score= 6");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",7);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==8){
            Question.setText("If you are a teenager living on Elm Street what should you never do? ");
            B1.setText("Go to sleep");
            B2.setText("Play with dolls");
            B3.setText("Go to the prom");
            B4.setText("Have sex");
            Score.setText("Score=7");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",8);
                    startActivity(f);
                }

            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }

            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });
        }
        else if(i==9){
            Question.setText(" If you are up on your movie lore, then you also know that you should never accept what job on Halloween?");
            B1.setText("Hotel clerk");
            B2.setText("Baby sitter");
            B3.setText("Camp counselor");
            B4.setText("Traveling salesman");
            Score.setText("Score=8");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }

            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",9);
                    startActivity(f);
                }

            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==10){
            Question.setText("If you are looking for a job on Crystal Lake what offer should you not accept?");
            B1.setText("Mailman");
            B2.setText("Truck driver");
            B3.setText("Camp cook");
            B4.setText("Camp counselor");
            Score.setText("Score=9");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }

            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);
                }

            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Horror.this, info.class);
                    f.putExtra("answer",10);
                    startActivity(f);
                }
            });

        }
        else{
            Intent f= new Intent(Horror.this, MainActivity.class);
            f.putExtra("answer",1);
            startActivity(f);
        }
    }
}
