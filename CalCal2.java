package com.example.chemicalculators;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class CalCal2 extends AppCompatActivity {
    int nai1,nai2,nai,in1,in2,in;
    int sPoint1,sPoint2,sPointD;
    String ans;
    double d1,d2,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_cal2);
        final EditText nText1 = (EditText) findViewById(R.id.editText1);
        final EditText nText2 = (EditText) findViewById(R.id.editText2);
        final TextView nTextView1 = (TextView) findViewById(R.id.textView3);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button buttonBack = (Button) findViewById(R.id.button7);

        buttonBack.setOnClickListener(view -> {
            Intent t = new Intent(CalCal2.this ,MainActivity.class);
            startActivity(t);
        });
        button3.setOnClickListener(view -> {
            sPoint1  = nText1.getText().toString().indexOf('.');
            sPoint2  = nText2.getText().toString().indexOf('.');

            d1 = Double.parseDouble(nText1.getText().toString());
            d2 = Double.parseDouble(nText2.getText().toString());
            d=d1+d2;
            if(sPoint1<0)nai1=0;
            else nai1=nText1.getText().toString().length()-sPoint1-1;
            if(sPoint2<0)nai2=0;
            else nai2=nText2.getText().toString().length()-sPoint2-1;
            nai=nai1;
            if(nai2<nai1)nai=nai2;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(nai); // set decimal places
            nf.setMinimumFractionDigits(nai);
            ans = nf.format(d);
            nTextView1.setText(ans);
        });
        button4.setOnClickListener(view -> {
            sPoint1  = nText1.getText().toString().indexOf('.');
            sPoint2  = nText2.getText().toString().indexOf('.');

            d1 = Double.parseDouble(nText1.getText().toString());
            d2 = Double.parseDouble(nText2.getText().toString());
            d=d1-d2;


            if(sPoint1<0) nai1=0;
            else nai1 = nText1.getText().toString().length()-sPoint1-1;
            if(sPoint2<0) nai2 = 0;
            else nai2 = nText2.getText().toString().length()-sPoint2-1;
            nai = nai1;
            if(nai2<nai1) nai=nai2;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(nai); // set decimal places
            nf.setMinimumFractionDigits(nai);
            ans = nf.format(d);
            nTextView1.setText(ans);
        });
        if(button5 != null) {
            button5.setOnClickListener(view -> {
                sPoint1  = nText1.getText().toString().indexOf('.');
                sPoint2  = nText2.getText().toString().indexOf('.');

                d1 = Double.parseDouble(nText1.getText().toString());
                d2 = Double.parseDouble(nText2.getText().toString());

                d=d1*d2;
                in = (int)d;
                in1 = (int)d1;
                in2 = (int)d2;
                sPointD = String.valueOf(d).indexOf('.');

                if(sPoint1 > 0) nai1 = nText1.getText().toString().length()-1;
                if(sPoint2 > 0) nai2 = nText2.getText().toString().length()-1;
                if(sPoint1 < 0){
                    sPoint1=nText1.getText().length();
                    nai1=sPoint1;
                    for(int i=1;in1%Math.pow(10,i)==0;i++)nai1=sPoint1-i;
                }
                if(sPoint2<0){
                    sPoint2=nText2.getText().length();
                    nai2=sPoint2;
                    for(int i=1;in2%Math.pow(10,i)==0;i++)nai2=sPoint2-i;
                }
                nai=nai1;
                if(nai2<nai1)nai=nai2;


                ans = "No";
                if((double)in==d||(nai - sPointD)<0){sPointD=String.valueOf(in).length();

                    if((d/Math.pow(10,sPointD-nai))-((int)(d/Math.pow(10,sPointD-nai)))>=0.5)in = (int)((int)(in/Math.pow(10,sPointD-nai)+1)*Math.pow(10,sPointD-nai));
                    else in = (int)((int)(in/Math.pow(10,sPointD-nai))*Math.pow(10,sPointD-nai));
                    ans = String.valueOf(in);
                    sPointD = -1;
                }
                NumberFormat nf = NumberFormat.getInstance(); // get instance for your locale
                if(sPointD>0) {
                    nf.setMaximumFractionDigits(nai - sPointD); // set decimal places
                    nf.setMinimumFractionDigits(nai - sPointD);
                    ans = nf.format(d);
                }

                nTextView1.setText(ans);



            });}
        button6.setOnClickListener(view -> {
            sPoint1  = nText1.getText().toString().indexOf('.');
            sPoint2  = nText2.getText().toString().indexOf('.');

            d1 = Double.parseDouble(nText1.getText().toString());
            d2 = Double.parseDouble(nText2.getText().toString());

            d=d1/d2;
            in = (int)d;
            in1 = (int)d1;
            in2 = (int)d2;
            sPointD = String.valueOf(d).indexOf('.');

            if(sPoint1>0)nai1=nText1.getText().toString().length()-1;
            if(sPoint2>0)nai2=nText2.getText().toString().length()-1;
            if(sPoint1<0){
                sPoint1=nText1.getText().length();
                nai1=sPoint1;
                for(int i=1;in1%Math.pow(10,i)==0;i++)nai1=sPoint1-i;
            }
            if(sPoint2<0){
                sPoint2=nText2.getText().length();
                nai2=sPoint2;
                for(int i=1;in2%Math.pow(10,i)==0;i++)nai2=sPoint2-i;
            }
            nai=nai1;
            if(nai2<nai1)nai=nai2;


            ans="No";
            if((double)in==d||(nai - sPointD)<0){sPointD=String.valueOf(in).length();

                if((d/Math.pow(10,sPointD-nai))-((int)(d/Math.pow(10,sPointD-nai)))>=0.5)in = (int)((int)(in/Math.pow(10,sPointD-nai)+1)*Math.pow(10,sPointD-nai));
                else in = (int)((int)(in/Math.pow(10,sPointD-nai))*Math.pow(10,sPointD-nai));
                ans = String.valueOf(in);
                sPointD=-1;
            }
            NumberFormat nf = NumberFormat.getInstance(); // get instance for your locale
            if(sPointD>0) {
                nf.setMaximumFractionDigits(nai - sPointD); // set decimal places
                nf.setMinimumFractionDigits(nai - sPointD);
                ans = nf.format(d);
            }

            nTextView1.setText(ans);

        });
    }
}
