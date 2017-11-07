package com.example.dude.quizscene;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



    import android.content.Intent;
    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.Button;
    import android.widget.TextView;
import java.lang.Object;

    public class Action extends AppCompatActivity {
        private Button B1;
        private Button B2;
        private Button B3;
        private Button B4;
        private TextView Question;
        private TextView Score;
        private String g;
     private   Vibrator vibrator;
     private boolean isVibrate;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_action);
        g= Context.VIBRATOR_SERVICE;
      vibrator=(Vibrator)getSystemService(g);
       isVibrate=vibrator.hasVibrator();


            Intent i=getIntent();
            int r=  i.getIntExtra("answer",0);
            String g= Context.VIBRATOR_SERVICE;
            final  Vibrator vibrator=(Vibrator)getSystemService(g);
            final boolean isVibrate=vibrator.hasVibrator();

            B1=(Button)findViewById(R.id.B1h);
            B2=(Button)findViewById(R.id.B2h);
            B3=(Button)findViewById(R.id.B3h);
            B4=(Button)findViewById(R.id.B4h);
            Question=(TextView)findViewById(R.id.questionTh);
            Score=(TextView)findViewById(R.id.scoreTh);
            setQuestion(r);

        }
        private void setQuestion(int i) {
            if (i == 1) {
                Question.setText("What profession did Christian Wolff work as in a film ‘The Accountant’?");
                B1.setText("Cashier");
                B2.setText("The Accountant");
                B3.setText("FBI Agent");
                B4.setText("Teacher");
                Score.setText("score = 0");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this,death.class);
                        startActivity(f);
                    }
                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 31);
                        startActivity(f);
                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
            } else if (i == 2) {
                Question.setText("Who is the main character in Mission Imposible 4 Ghost Protocol?");
                B1.setText("“Johnny Depp");
                B2.setText("Leonardo Dicaprio");
                B3.setText("Tom Cruise");
                B4.setText("Dwayne Johnson");
                Score.setText("Score = 1");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 32);
                        startActivity(f);
                    }
                });
                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
            } else if (i == 3) {
                Question.setText("A famous line spoken by Liam Neeson “I will look for you, I will find you, and I will kill you”, was from which movie?");
                B1.setText("Taken");
                B2.setText("Terminator");
                B3.setText("Momentum");
                B4.setText("Spectre");
                Score.setText("score = 2");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 33);
                        startActivity(f);
                    }
                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        startActivity(f);
                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
            } else if (i == 4) {
                Question.setText("James Bond 007 Skyfall theme song was sang by which singer?");
                B1.setText("Sam Smith");
                B2.setText("Lana Del Ray");
                B3.setText("Adele");
                B4.setText("Justin Timberlake");
                Score.setText("Score = 3");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 34);
                        startActivity(f);
                    }
                });
                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });

            } else if (i == 5) {
                Question.setText("In the movie “Live Free or Die Hard” Who join forces with John Mcclain to take down which master cyber-terrorist in Washington D.C?");
                B1.setText("John McClane");
                B2.setText("Mathew Farrell");
                B3.setText("Mia Linh");
                B4.setText("Thomas Gabriel");
                Score.setText("Score = 4");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);

                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 35);
                        startActivity(f);
                    }
                });
            } else if (i == 6) {
                Question.setText("Who is the protagonist in movie name “Momentum”?");
                B1.setText("Alexis Farraday");
                B2.setText("Mr. Washington");
                B3.setText("Jessica");
                B4.setText("Senator");
                Score.setText("Score = 5");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 36);
                        startActivity(f);
                    }
                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });

                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
            } else if (i == 7) {
                Question.setText(" what movie saic“You either die a hero or you live long enough to see yourself become the villain”?");
                B1.setText("Blade Runner");
                B2.setText("The Dark Knight (2008)");
                B3.setText("Gladiator");
                B4.setText("Fight Club");
                Score.setText("Score = 6");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 37);
                        startActivity(f);
                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
            } else if (i == 8) {
                Question.setText("The first Godfather movie was based on a novel written by?");
                B1.setText("Francis Ford Coppola");
                B2.setText("Lorenzo Veti");
                B3.setText("Stan Howard");
                B4.setText("Mario Puzo");
                Score.setText("Score = 7");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this,death.class);
                        startActivity(f);
                    }

                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);

                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 38);
                        startActivity(f);
                    }
                });
            } else if (i == 9) {
                Question.setText("Which of the actor died in making of movie Fast & Furious 7?");
                B1.setText("Heath Ledger");
                B2.setText("Paul Walker");
                B3.setText("Corey Haim");
                B4.setText("Brad Renfro");
                Score.setText("Score = 8");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 39);
                        startActivity(f);
                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
            } else if (i == 10) {
                Question.setText("Which song tribute to Paul Walker’s death was sung by Wiz Khalifa ft. Charlie Puth?");
                B1.setText("“See You Again”");
                B2.setText("“My Angel”");
                B3.setText("“Go Hard or Go Home”");
                B4.setText("“Ride Out”");
                Score.setText("Score = 9");
                B1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, info.class);
                        f.putExtra("answer", 40);
                        startActivity(f);
                    }
                });
                B2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });
                B3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);

                    }
                });
                B4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isVibrate==true){
                            vibrator.vibrate(200);
                        }
                        Intent f = new Intent(Action.this, death.class);
                        startActivity(f);
                    }
                });

            } else {

                if(isVibrate==true){
                    vibrator.vibrate(200);
                }
                Intent f = new Intent(Action.this, MainActivity.class);
                f.putExtra("answer", 4);
                startActivity(f);
            }
        }
    }
