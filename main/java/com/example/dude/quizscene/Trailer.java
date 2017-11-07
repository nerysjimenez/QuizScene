package com.example.dude.quizscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Trailer extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer);
        webView=(WebView)findViewById(R.id.webview);
        Intent i=getIntent();
        int r=  i.getIntExtra("answer",0);
        if (r==1){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=BN8K-4osNb0");
        }
        if (r==2){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=YDGw1MTEe9k");
        }
        if (r==3){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=xHuOtLTQ_1I");
        }
        if (r==4){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=BhU0cCXYqw0");
        }
        if (r==5){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=Vs3981DoINw");
        }
        if (r==6){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=0TAGtIQvebs");
        }
        if(r==7){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl(" https://www.youtube.com/watch?v=AWm_mkbdpCA");
        }

        if(r==8){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl(" https://www.youtube.com/watch?v=dCVh4lBfW-c");
        }
        if(r==9){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=xHuOtLTQ_1I ");
        }
        if(r==10){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl(" https://www.youtube.com/watch?v=gjiqwTv9yeI");

        }
        if (r==11){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=-T3wnP91OnI");
        }
        if (r==12){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=T-6YhRZowgc");
        }
        if (r==13){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=dMIrlP61Z9s");
        }
        if (r==14){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=um5DuTLzw-I");
        }
        if (r==15){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=s7EdQ4FqbhY");
        }
        if (r==16){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=79uuJdcC8wQ");
        }
        if(r==17){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=zFjaJbihWwc");
        }

        if(r==18){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=CewglxElBK0");
        }
        if(r==19){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=OIuhsHpcNAU");
        }
        if(r==20){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=uvMLfSQrHKE");

        }
        if (r==21){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://youtu.be/81FDbtPXo34");
        }
        if (r==22){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://youtu.be/Ut06d4dptWo");
        }
        if (r==23){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://youtu.be/r2wWcDR2Jxk");
        }
        if (r==24){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://youtu.be/YNh9Es8Ut6U");
        }
        if (r==25){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=GsZgkpHijyY");
        }
        if (r==26){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://youtu.be/Oyg4wWMHoFM");
        }
        if(r==27){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://youtu.be/YYV5f0Aqo4w");
        }

        if(r==28){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://youtu.be/Aqt-O9F6AkQ");
        }
        if(r==29){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://youtu.be/eS5MtPXo13k");
        }
        if(r==30){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://youtu.be/2x3TkKmBSDs");

        }
        if (r==31){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=0KHOVlEpMyY");
        }
        if (r==32){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=V0LQnQSrC-g");
        }
        if (r==33){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=uPJVJBm9TPA");
        }
        if (r==34){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=plZyOcuWL2M");
        }
        if (r==35){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=8Jz-8UcCiws");
        }
        if (r==36){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=bZDHKxXBzCM");
        }
        if(r==37){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=EXeTwQWrcwY");
        }

        if(r==38){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=sY1S34973zA");
        }
        if(r==39){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=Skpu5HaVkOc");
        }
        if(r==40){
            WebSettings Ws=webView.getSettings();
            Ws.setJavaScriptEnabled(true);

            webView.loadUrl("https://www.youtube.com/watch?v=RgKAFK5djSk");

        }





    }
}
