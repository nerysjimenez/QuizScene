package com.example.dude.quizscene;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button horrorB;
    private Button comedyB;
    private Button actionB;
    private Button sportsB;
    private String g;
    private Vibrator vibrator;
    private boolean isVibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.introsong);
        mp.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=getIntent();
        int f=i.getIntExtra("answer",0);
     g= Context.VIBRATOR_SERVICE;
        vibrator=(Vibrator)getSystemService(g);
        isVibrate=vibrator.hasVibrator();

       comedyB =(Button)findViewById(R.id.comedyB);
        horrorB=(Button)findViewById(R.id.horrorB);
        actionB=(Button)findViewById(R.id.actionB);
        sportsB=(Button)findViewById(R.id.sportsB);

comedyB.setEnabled(false);
        actionB.setEnabled(false);
        sportsB.setEnabled(false);
        if(f==1){
            horrorB.setEnabled(false);
            comedyB.setEnabled(true);
        }
        if(f==2){

            horrorB.setEnabled(false);
            sportsB.setEnabled(true);


        }
        if(f==3){
            horrorB.setEnabled(false);
         actionB.setEnabled(true);
        }
        if(f==4){
            Intent l=new Intent(MainActivity.this,Win.class);
            startActivity(l);
        }
        comedyB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(isVibrate==true){
                    vibrator.vibrate(200);
                }

                Intent x=new Intent(MainActivity.this,Comedy.class);
                x.putExtra("answer",1);
                startActivity(x);
            }
        });
        horrorB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isVibrate==true){
                vibrator.vibrate(200);
            }
                Intent i=new Intent(MainActivity.this, Horror.class);
                i.putExtra("answer",1);

startActivity(i);
                


            }
        });
        sportsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isVibrate==true){
                    vibrator.vibrate(200);
                }
                Intent i=new Intent(MainActivity.this, Sports.class);
                i.putExtra("answer",1);
                startActivity(i);
            }
        });
        actionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isVibrate==true){
                    vibrator.vibrate(200);
                }
                Intent i=new Intent(MainActivity.this,Action.class);
                i.putExtra("answer",1);
                startActivity(i);
            }
        });

    }


}


