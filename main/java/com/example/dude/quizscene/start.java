package com.example.dude.quizscene;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.lang.Object;

public class start extends AppCompatActivity {
private Button StartB;
    private  Button CreditsB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        StartB=(Button)findViewById(R.id.Sb);
        String g= Context.VIBRATOR_SERVICE;
        final Vibrator vibrator=(Vibrator)getSystemService(g);
        final boolean isVibrate=vibrator.hasVibrator();

        CreditsB=(Button)findViewById(R.id.credits);


        StartB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(isVibrate==true){
                    vibrator.vibrate(200);
                }
                Intent f= new Intent(start.this, MainActivity.class);
                f.putExtra("answer",0);
                startActivity(f);

            }
        });
        CreditsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f= new Intent(start.this, Credits.class);
                f.putExtra("answer",0);
                startActivity(f);
            }
        });
    }
}
