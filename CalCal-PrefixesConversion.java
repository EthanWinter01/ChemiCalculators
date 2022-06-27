package com.example.chemicalculators;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CalCal extends AppCompatActivity {
    double bon = 1;
    double lang = 1;
    double userIn = 0;
    String itemValue2;
    Spinner dropDownMenu1, dropDownMenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_cal);

        dropDownMenu1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list = new ArrayList<>();
        list.add("si unit");   list.add("deca(da)");
        list.add("hecto(h)");  list.add("kilo(k)");
        list.add("mega(M)");   list.add("giga(G)");
        list.add("tera(T)");   list.add("peta(P)");
        list.add("exa(E)");    list.add("deci(d)");
        list.add("centi(c)");  list.add("milli(m)");
        list.add("micro(u)");  list.add("nano(n)");
        list.add("pico(p)");   list.add("femto(f)");
        list.add("atto(a)");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropDownMenu1.setAdapter(adapter);
        dropDownMenu1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String itemValue = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(CalCal.this, "selected" + itemValue, Toast.LENGTH_SHORT).show();
                switch (itemValue) {
                    case "si unit": bon = Math.pow(10, 0); break;
                    case "deca(da)": bon = Math.pow(10, 1); break;
                    case "hecto(h)": bon = Math.pow(10, 2); break;
                    case "kilo(k)": bon = Math.pow(10, 3); break;
                    case "mega(M)": bon = Math.pow(10, 6); break;
                    case "giga(G)": bon = Math.pow(10, 9); break;
                    case "tera(T)": bon = Math.pow(10, 12); break;
                    case "peta(P)": bon = Math.pow(10, 15); break;
                    case "exa(E)": bon = Math.pow(10, 18); break;
                    case "deci(d)": bon = Math.pow(10, -1); break;
                    case "centi(c)": bon = Math.pow(10, -2); break;
                    case "milli(m)": bon = Math.pow(10, -3); break;
                    case "micro(u)": bon = Math.pow(10, -6); break;
                    case "nano(n)": bon = Math.pow(10, -9); break;
                    case "pico(p)": bon = Math.pow(10, -12); break;
                    case "femto(f)": bon = Math.pow(10, -15); break;
                    case "atto(a)": bon = Math.pow(10, -18); break;
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) { }
        });


        dropDownMenu2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list2 = new ArrayList<>();
        list2.add("si unit");   list2.add("deca(da)");
        list2.add("hecto(h)");  list2.add("kilo(k)");
        list2.add("mega(M)");   list2.add("giga(G)");
        list2.add("tera(T)");   list2.add("peta(P)");
        list2.add("exa(E)");    list2.add("deci(d)");
        list2.add("centi(c)");  list2.add("milli(m)");
        list2.add("micro(u)");  list2.add("nano(n)");
        list2.add("pico(p)");   list2.add("femto(f)");
        list2.add("atto(a)");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropDownMenu2.setAdapter(adapter2);
        dropDownMenu2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                itemValue2 = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(CalCal.this, "selected" + itemValue2, Toast.LENGTH_SHORT).show();
                switch (itemValue2) {
                    case "si unit": lang = Math.pow(10, 0); break;
                    case "deca(da)": lang = Math.pow(10, 1); break;
                    case "hecto(h)": lang = Math.pow(10, 2); break;
                    case "kilo(k)": lang = Math.pow(10, 3); break;
                    case "mega(M)": lang = Math.pow(10, 6); break;
                    case "giga(G)": lang = Math.pow(10, 9); break;
                    case "tera(T)": lang = Math.pow(10, 12); break;
                    case "peta(P)": lang = Math.pow(10, 15); break;
                    case "exa(E)": lang = Math.pow(10, 18); break;
                    case "deci(d)": lang = Math.pow(10, -1); break;
                    case "centi(c)": lang = Math.pow(10, -2); break;
                    case "milli(m)": lang = Math.pow(10, -3); break;
                    case "micro(u)": lang = Math.pow(10, -6); break;
                    case "nano(n)": lang = Math.pow(10, -9); break;
                    case "pico(p)": lang = Math.pow(10, -12); break;
                    case "femto(f)": lang = Math.pow(10, -15); break;
                    case "atto(a)": lang = Math.pow(10, -18); break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) { }
        });

        final EditText text1 = (EditText) findViewById(R.id.text1);
        final EditText text2 = (EditText) findViewById(R.id.text2);
        Button button = (Button) findViewById(R.id.button1);
        final TextView textView1 = (TextView) findViewById(R.id.textv1);
        final TextView textView2 = (TextView) findViewById(R.id.textv2);
        final TextView textView3 = (TextView) findViewById(R.id.textv3);
        if (button != null) {
            button.setOnClickListener(view -> {
                if (text1.getText().toString().trim() != "") {
                    Double Num = Double.parseDouble(text1.getText().toString());
                    Double Num2 = Double.parseDouble(text2.getText().toString());
                    userIn = (Num * bon * Math.pow(10, Num2)) / lang;
                    int num = 0;
                    int su = 1;
                    if (userIn < 0) {
                        userIn = userIn * -1;
                        su = -1;
                    }
                    if (userIn > 1) {
                        for (num = 0; userIn > 10; num++) {
                            userIn = userIn / 10;
                        }
                    } else if (userIn < 1) {
                        for (num = 0; userIn < 1; num--) {
                            userIn = userIn * 10;
                        }
                    }

                    textView1.setText(String.valueOf((float) userIn * su));
                    textView2.setText(String.valueOf(num));
                    textView3.setText(itemValue2);
                    userIn = 0;
                }
                Toast.makeText(CalCal.this, "Convert complete", Toast.LENGTH_SHORT).show();

            });
        }

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            Intent p = new Intent(CalCal.this, MainActivity.class);
            startActivity(p);
        });
    }
}
