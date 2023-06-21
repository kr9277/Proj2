package com.example.proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView tv1, tv2, tv3, tv4;
    Spinner sp;
    String[] continents = {"Europe", "Asia", "Africa", "Australia", "South America", "North America", "Antartica"};
    String[] europe = {"Austria", "Ukraina", "azerbaijan", "Itali", "Faroe Islands", "Iceland", "Ireland"};
    String[] asia = {"Uzbekistan", "Indonesia", "Iran", "Georgia", "India", "Vietnam", "Russia"};
    String[] africa = {"Uganda", "Libya", "Madagascar", "Egypt", "Morocco", "Nigeria", "Zimbabwe"};
    String[] australia = {"New South Wales", "Victoria", "Queenslnd", "South Australia", "Western Australia", "tasmania", "Cocos Islands"};
    String[] south_america = {"Argentina", "Brasil", "Chile", "Colombia", "Ecuador", "Guyana", "Uruguay"};
    String[] north_america = {"United States", " Mexico", "Canada", "Guatemala", "Cuba", "Honduras", "Costa Rica"};
    String[] antartica = {"Argentina", "Australia", "Chile", "France", "New Zealand", "Norway", "United Kingdom"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        sp = findViewById(R.id.sp);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        sp.setOnItemClickListener((AdapterView.OnItemClickListener) this);
        sp.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, continents);
        lv.setAdapter(adp);
        public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

        }
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){

        }
    }                                                                                                                                      ,m
}