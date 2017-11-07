package com.example.dude.quizscene;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sports extends AppCompatActivity {
    private Button B1;
    private  Button B2;
    private  Button B3;
    private  Button B4;
    private TextView Question;
    private TextView Score;
    String g= Context.VIBRATOR_SERVICE;
    private  Vibrator vibrator;
    private boolean isVibrate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        Intent i=getIntent();
        int r=i.getIntExtra("answer",0);
        String g= Context.VIBRATOR_SERVICE;
     vibrator=(Vibrator)getSystemService(g);
 isVibrate=vibrator.hasVibrator();
        B1=(Button)findViewById(R.id.B1h);
        B2=(Button)findViewById(R.id.B2h);
        B3=(Button)findViewById(R.id.B3h);
        B4=(Button)findViewById(R.id.B4h);
        Question=(TextView)findViewById(R.id.StoryT);
        Score=(TextView)findViewById(R.id.scoreTh);
        setQuestion(r);



    }
    private void setQuestion(int i){
        if(i==1){
            Question.setText("Gordon Bombay is the coach for which hockey team?");
            B1.setText("The Mighty Ducks");
            B2.setText("The Wolfpack");
            B3.setText("The Kings");
            B4.setText("The Bears");
            Score.setText("score=0");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,info.class);
                    f.putExtra("answer",21);
                    startActivity(f);

                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this, death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);

                }
            });
        }
        else if(i==2){
            Question.setText("Which line is from the film Field of Dreams?");
            B1.setText("There’s no crying in baseball!");
            B2.setText("Heroes get remembered, but legends never die");
            B3.setText("If you build it, they will come");
            B4.setText("Chicks dig the long ball");
            Score.setText("Score=1");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this, info.class);
                    f.putExtra("answer",22);
                    startActivity(f);
                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==3){
            Question.setText("Which celebrity didn’t play for the Tune Squad in Space Jam?");
            B1.setText("Danny DeVito");
            B2.setText("Wayne Knight");
            B3.setText("Bill Murray");
            B4.setText("Michael Jordan");
            Score.setText("score=2");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,info.class);
                    f.putExtra("answer",23);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this, death.class);
                    startActivity(f);
                }
            });
        }
        else if(i==4){
            Question.setText(R.string.forrestGquestion);
            B1.setText("Bear Bryant");
            B2.setText("Vince Lombardi");
            B3.setText("Knute Rockne");
            B4.setText("George Halas");
            Score.setText("Score=3");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,info.class);
                    f.putExtra("answer",24);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this, death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==5){
            Question.setText("In the 1970 movie 'MASH', what is the nickname of Captain Oliver Jones, the 'ringer' that the 4077th brings in to play on their football team?  ");
            B1.setText("Duke");
            B2.setText("Painless Pole");
            B3.setText("Dago Red");
            B4.setText("Spearchucker");
            Score.setText("Score=4");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this, death.class);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }

                    Intent f= new Intent(Sports.this,info.class);
                    f.putExtra("answer",25);
                    startActivity(f);
                }
            });
        }
        else if(i==6){
            Question.setText( "What is Luther Jackson's nickname in The Fortune Cookie?");
            B1.setText("Boom Boom");
            B2.setText("The Silver Horse");
            B3.setText("Rhino");
            B4.setText("The Train");
            Score.setText("Score=5");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,info.class);
                    f.putExtra("answer",26);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this, death.class);
                    startActivity(f);
                }
            });
        }
        else if(i==7){
            Question.setText("In which movie does Sean Penn crash the car of his high school's star football player");
            B1.setText("Fast Times at Ridgemont High");
            B2.setText("Bad Boys");
            B3.setText("Crackers");
            B4.setText("Racing with the Moon");
            Score.setText("Score= 6");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,info.class);
                    f.putExtra("answer",27);
                    startActivity(f);
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this, death.class);
                    startActivity(f);
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==8){
            Question.setText("Who stars in the 1978 film Heaven Can Wait");
            B1.setText("Richard Gere");
            B2.setText("Tom Selleck");
            B3.setText("Burt Reynolds");
            B4.setText("Warren Beatty");
            Score.setText("Score=7");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this, death.class);
                    startActivity(f);
                }

            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }

            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,info.class);
                    f.putExtra("answer",28);
                    startActivity(f);
                }
            });
        }
        else if(i==9){
            Question.setText("Who stars in All the Right Moves?");
            B1.setText("Brad Pitt");
            B2.setText("Kevin Costner");
            B3.setText("Tom Cruise");
            B4.setText("Johnny Depp");
            Score.setText("Score=8");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }

            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }

            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,info.class);
                    f.putExtra("answer",29);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }
            });

        }
        else if(i==10){
            Question.setText(" What is the nickname of the football team at Adams College, where jocks and nerds alike attend in Revenge of the Nerds?");
            B1.setText("Rangers");
            B2.setText("Atoms");
            B3.setText("Wildcats");
            B4.setText("Zombies");
            Score.setText("Score=9");
            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);
                }

            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,info.class);
                    f.putExtra("answer",30);
                    startActivity(f);
                }

            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this,death.class);
                    startActivity(f);

                }
            });
            B4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f= new Intent(Sports.this, death.class);
                    startActivity(f);
                }
            });

        }
        else{
            Intent f= new Intent(Sports.this, MainActivity.class);
            f.putExtra("answer",3);
            startActivity(f);
        }
    }
}