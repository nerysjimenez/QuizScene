package com.example.dude.quizscene;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class death extends AppCompatActivity {
private Button contin;
    String g;
    private Vibrator vibrator;
   private boolean isVibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.deathsong);
       // mp.stop();
        MediaPlayer mpd = MediaPlayer.create(death.this, R.raw.deathsong);
        mpd.start();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_death);
     g= Context.VIBRATOR_SERVICE;
       vibrator=(Vibrator)getSystemService(g);
       isVibrate=vibrator.hasVibrator();
        contin=(Button)findViewById(R.id.continue_b);
        Intent i=getIntent();
        contin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isVibrate==true){
                    vibrator.vibrate(200);
                }
                Intent f= new Intent(death.this, MainActivity.class);
                f.putExtra("answer",0);
                startActivity(f);

            }
        });

    }
}
