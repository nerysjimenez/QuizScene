package com.example.dude.quizscene;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Nerys Jimenez on 11/16/2016.
 */

public class Comedy extends AppCompatActivity{
    private Button B1;
    private Button B2;
    private Button B3;
    private Button B4;
    private TextView Question;
    private TextView Score;
    private Vibrator vibrator;
    private boolean isVibrate;
  private String g;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g= Context.VIBRATOR_SERVICE;
 vibrator=(Vibrator)getSystemService(g);
        isVibrate=vibrator.hasVibrator();
        setContentView(R.layout.activity_comedy);
        Intent i=getIntent();
        int r= i.getIntExtra("answer",0);
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
            Question.setText("What is the name of the cologne in AnchorMan ?");
            B1.setText("Driven");
            B2.setText("Ya Baby");
            B3.setText("Sex Panther");
            B4.setText("The Gun Show");
            Score.setText("score = 0");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }

                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this, info.class);
                    f.putExtra("answer",11);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);

                }
            });
        }
        else if(i==2){
            Question.setText("What movie had the line 'Your mother's a cankerous whore!'");
            B1.setText("SuperBad");
            B2.setText("Tropic Thunder");
            B3.setText("Bad Grandpa");
            B4.setText("The Hangover");
            Score.setText("Score = 1");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);

                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,info.class);
                    f.putExtra("answer",12);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==3){
            Question.setText("What color was Miltons stapler in the movie Office Space?");
            B1.setText("Black");
            B2.setText("Red");
            B3.setText("Blue");
            B4.setText("Green");
            Score.setText("score = 2");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this, info.class);
                    f.putExtra("answer",13);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
        }
        else if(i==4){
            Question.setText("In the movie I love You Man Jason Segal and Paul Rudd bond over what Band? ");
            B1.setText("Rush");
            B2.setText("Metallica");
            B3.setText("Motley Crue");
            B4.setText("Styx");
            Score.setText("Score = 3");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,info.class);
                    f.putExtra("answer",14);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==5){
            Question.setText("What did Butchs girlfriend forget to grab that belonged to his father in the movie Pulp Fiction?  ");
            B1.setText("A Ring");
            B2.setText("A Watch");
            B3.setText("A Knife");
            B4.setText("A Book");
            Score.setText("Score = 4");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this, info.class);
                    f.putExtra("answer",15);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
        }
        else if(i==6){
            Question.setText("What Song did Dr.Buddy make Dave sing in Anger Management?  ");
            B1.setText("We are the champions");
            B2.setText("Freebird");
            B3.setText("I feel pretty");
            B4.setText("SuperFreak");
            Score.setText("Score = 5");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this, info.class);
                    f.putExtra("answer",16);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
        }
        else if(i==7){
            Question.setText("What name does Evan choose for his fake ID in the movie SuperBad? ");
            B1.setText("Big Papa");
            B2.setText("Wyne Myre");
            B3.setText("McLoven");
            B4.setText("BeerMan");
            Score.setText("Score = 6");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this, info.class);
                    f.putExtra("answer",17);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==8){
            Question.setText("What prop from Step Brothers did Will Ferrell keep? ");
            B1.setText("Prosthetic testicles");
            B2.setText("A samurai sword");
            B3.setText("A Chewbacca mask");
            B4.setText("A captain's hat");
            Score.setText("Score = 7");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this, info.class);
                    f.putExtra("answer",18);
                    startActivity(f);
                }

            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }

            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });
        }
        else if(i==9){
            Question.setText("What song was edited out in the video release of Wynes World?");
            B1.setText("Freebird");
            B2.setText("StairWay to Heaven");
            B3.setText("Whole lotta love");
            B4.setText("Enter Sandman");
            Score.setText("Score = 8");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }

            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this, info.class);
                    f.putExtra("answer",19);
                    startActivity(f);
                }

            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==10){
            Question.setText("What does Randy get for christmas in a christmas story?");
            B1.setText("A toy plane");
            B2.setText("A toy blimp");
            B3.setText("A BB gun");
            B4.setText("A Gi Joe");
            Score.setText("Score = 9");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }

            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this, info.class);
                    f.putExtra("answer",20);
                    startActivity(f);
                }

            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Comedy.this,death.class);
                    startActivity(f);
                }
            });

        }
        else{
            Intent f= new Intent(Comedy.this, MainActivity.class);
            f.putExtra("answer",2);
            startActivity(f);
        }
    }
}

