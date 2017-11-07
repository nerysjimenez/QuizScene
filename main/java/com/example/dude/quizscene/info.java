package com.example.dude.quizscene;

import android.content.Context;
import android.graphics.Color;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class info extends AppCompatActivity {
    private TextView Story;
    private Button Trailer;
    private Button Continue;
    private RelativeLayout back;
    private int g;
    private int h;
 private  String d;


    private  Vibrator vibrator;
    private boolean isVibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d= Context.VIBRATOR_SERVICE;
      vibrator=(Vibrator)getSystemService(d);
 isVibrate=vibrator.hasVibrator();
        setContentView(R.layout.activity_info);
        Trailer = (Button) findViewById(R.id.Trailer);
        Continue = (Button) findViewById(R.id.continueT);
        Story = (TextView) findViewById(R.id.StoryT);
        back = (RelativeLayout) findViewById(R.id.activity_info);



        g = 0;
        String t = "HELLO";
        Intent i = getIntent();
        int f = i.getIntExtra("answer", 0);
        if (f == 1) {

            g = 2;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {  if(isVibrate==true){
                    vibrator.vibrate(200);
                }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);

                }
            });

            h = 1;
            Story.setText(R.string.Frank);


        }
        if (f == 2) {
            Story.setText("Novelist William Peter Blatty based his 1971 best-seller on the last known Catholic-sanctioned exorcism in the United States. Blatty transformed the little boy in the 1949 incident into a little girl named Regan, played by 14-year-old Linda Blair in the 1973 movie.");
            g = 3;
            h = 2;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }

        if (f == 3) {
            Story.setText("Halloween is a 1978 American independent horror film set in the fictional Midwest town of Haddonfield, Illinois on Halloween.");
            g = 4;
            h = 3;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }


        if (f == 4) {
            Story.setText("Charles Lee Ray, or Chucky for short is a fictional character from the Child's Play series of horror films. Chucky is a doll that was possessed by means of voodoo magic by serial killer Charles Lee Ray, the notorious Lakeshore Strangler.");
            g = 5;
            h = 4;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
            Trailer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Trailer.class);
                    f.putExtra("answer", h);
                    startActivity(f);
                }
            });
        }
        if (f == 5) {
            Story.setText("The Texas Chain Saw Massacre, continues the subgenre of horror films based on the life and \"career\" of Wisconsin serial killer Ed Gein. A family of homicidal slaughterhouse workers who take over the house next door. Included amongst the brood is Leatherface (Gunnar Hansen), a chainsaw-wielding human horror show who wears a face mask made out of human skin. \n");
            g = 6;
            h = 5;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 6) {
            Story.setText("A disparate group of individuals takes refuge in an abandoned house when corpses begin to leave the graveyard in search of fresh human bodies to devour. The pragmatic Ben (Duane Jones) does his best to control the situation, but when the reanimated bodies surround the house");
            g = 7;
            h = 6;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 7) {
            Story.setText("Scream is a 1996 American slasher film written by Kevin Williamson and directed by Wes Craven. Scream follows the character of Sidney Prescott (Campbell), a high school student in the fictional town of Woodsboro, California, who becomes the target of a mysterious killer known as Ghostface.\n");
            g = 8;
            h = 7;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 8) {
            Story.setText("We all know from \"Nightmare on Elm Street\" that your dreams can get you killed by Freddy Krueger. Written by Craven, a former English teacher, the film's premise is the question of where the line between dreams and reality lies. The villain, Freddy Krueger, exists in the \"dream world\" and yet can kill in the \"real world\".");
            g = 9;
            h = 8;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 9) {
            Story.setText("Halloween is a 1978 American independent horror film set in the fictional Midwest town of Haddonfield, Illinois on Halloween. Originally titled The Babysitter Murders, the film centers on Michael Myers' escape from a psychiatric hospital, his murdering of teenagers, and Dr. Loomis's attempts to track and stop him.");
            g = 10;
            h = 9;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });


        }
        if (f == 10) {
            Story.setText("In Friday the 13th, we learn it is a bad job to be a counselor at Camp Crystal Lake where the counselors die extremely bloody deaths at the hands of an unseen killer who turns out to be the cook whose son Jason drowned 25 years earlier while neglected by romancing counselors.");
            g = 11;
            h = 10;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Horror.class);
                    f.putExtra("answer", g);
                    startActivity(f);

                }
            });

        }
        if (f == 11) {
            g = 2;
            h = 11;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Story.setText("Anchor Man Staring Will Ferrell,Steve Carrell,Paul rudd, and David Koechner shows the crazy life of ancher man Ron Burgundy who lives the good life until a woman enters the news team.");
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Comedy.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }


        if (f == 12) {
            Story.setText("Through a series of freak occurrences, a group of actors shooting a big-budget war movie are forced to become the soldiers they are portraying.(IMDB)");
            g = 3;
            h = 12;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Comedy.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 13) {
            Story.setText("Ron Livingston stars as Peter Gibbons who after getting hypnotised stops caring about his job.After his friends get fired peter and them hatch a plan to screw their evil company.");
            g = 4;
            h = 13;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Comedy.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 14) {
            Story.setText("I love you man is about a  man Peter Klaven (paul rudd) who needs to find a  best man  for his wedding. He finds one in Sydney Fife (Jason Segal) will they be the right  match though?");
            g = 5;
            h = 14;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Comedy.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 15) {
            Story.setText("Pulp fiction is a classic movie Quentin Tarantino About The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.(IMDB)");
            g = 6;
            h = 15;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Comedy.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 16) {
            Story.setText("Anger Management is a movie about a man named Dave Buznik is a businessman who is wrongly sentenced to an anger-management program, where he meets an aggressive instructor played by jack Nicholson.");
            g = 7;
            h = 16;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Comedy.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 17) {
            Story.setText("SuperBad Two co-dependent high school seniors are forced to deal with separation anxiety after their plan to stage a booze-soaked party goes awry.");
            g = 8;
            h = 17;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Comedy.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 18) {
            Story.setText("Step Brothers is a 2008 American comedy film. It follows Brennan (Ferrell) and Dale (Reilly), two middle-aged men who are forced to live together as step brothers.");
            g = 9;
            h = 18;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Comedy.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }


        if (f == 19) {
            Story.setText("Wayne's World - Two slacker friends try to promote their public-access cable show.");
            g = 10;
            h = 19;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Comedy.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });

        }
        if (f == 20) {
            Story.setText("A Christmas Story - In the 1940s, a young boy named Ralphie attempts to convince his parents, his teacher, and Santa that a Red Ryder B.B. gun really is the perfect Christmas gift.");
            g = 2;
            h = 20;
            back.setBackgroundColor(Color.BLUE);
            Story.setBackgroundColor(Color.TRANSPARENT);
            Trailer.setBackgroundColor(Color.TRANSPARENT);
            Continue.setBackgroundColor(Color.TRANSPARENT);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, MainActivity.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 21) {
            g = 2;
            h = 21;
            Story.setText(R.string.S1);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Sports.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }


        if (f == 22) {
            Story.setText(R.string.S2);
            g = 3;
            h = 22;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Sports.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 23) {
            Story.setText(R.string.S3);
            g = 4;
            h = 23;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Sports.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 24) {
            Story.setText(R.string.S4);
            g = 5;
            h = 24;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Sports.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 25) {
            Story.setText(R.string.S5);
            g = 6;
            h = 25;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Sports.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 26) {
            Story.setText(R.string.S6);
            g = 7;
            h = 26;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Sports.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 27) {
            Story.setText(R.string.S7);
            g = 8;
            h = 27;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Sports.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 28) {
            Story.setText(R.string.S8);
            g = 9;
            h = 28;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Sports.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 29) {
            Story.setText(R.string.S9);
            g = 10;
            h = 29;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Sports.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 30) {
            Story.setText(R.string.S10);
            g = 3;
            h = 30;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, MainActivity.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }


        if (f == 31)

        {
            g = 2;
            h = 31;
            Story.setText("Ben Affleck played a role of The Accountant  as Christian Wolff,. He works as a freelance accountant for some of the worlds most dangerous criminal  organizations. ");
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Action.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }

        if (f == 32) {
            Story.setText("In the fourth installment of the 2011 Mission Impossible series, Ethan Hunt(Tom Cruise) and a new team race against time to track down Hendricks, a dangerous terrorist who has gained access to Russian nuclear launch codes that will be used against the US\"");
            g = 3;
            h = 32;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Action.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 33) {
            Story.setText("Bryan Mills (Liam Neeson) is a retired agent who left the Central Intelligence Agency to be near Kim (daughter) in California.But when Kim gets taken only Byran can save her");
            g = 4;
            h = 33;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Action.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 34) {
            Story.setText("Adele sang the theme song of James Bond 007 Skyfall (2012). The lyrics of 'Skyfall' are intended to reflect the narrative of the film, rather than emphasise romanticism.");
            g = 5;
            h = 34;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Action.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 35) {
            Story.setText("Live Free or Die Hard was released in 2007. When someone hacks into the computers at the FBI's Cyber Crime Division; the Director decides to round up all the hackers who could have done this. This is on one person John Mcclain  ");
            g = 6;
            h = 35;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Action.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 36) {
            Story.setText("Alex (Olga Kurylenko), a mysterious thief, is pulled in by her former partner for one last heist.");
            g = 7;
            h = 36;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Action.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 37) {
            Story.setText("When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice.");
            g = 8;
            h = 37;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Action.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 38) {
            Story.setText("The Godfather (1972) film was based on a novel and written by Mario Puzo. The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son");
            g = 9;
            h = 38;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Action.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 39) {
            Story.setText("Paul Walker, a star of the 'Fast & Furious' movie franchise, died in a tragic car crash on November 30, 2013. He was 40.");
            g = 10;
            h = 39;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, Action.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        if (f == 40) {
            Story.setText("The song was dedicated to Paul Walker’s death who died in a car crash on November 30, 2013.");
            g = 4;
            h = 40;
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isVibrate==true){
                        vibrator.vibrate(200);
                    }
                    Intent f = new Intent(info.this, MainActivity.class);
                    f.putExtra("answer", g);
                    startActivity(f);
                }
            });
        }
        Trailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(info.this, Trailer.class);
                f.putExtra("answer", h);
                startActivity(f);
            }
        });
    }
}



