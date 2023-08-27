package com.example.proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    Spinner sp;
    String[] continents = {"Choose a mainland","Europe", "Asia", "Africa", "Australia", "South America", "North America", "Antartica"};
    String[] europe = {"Austria", "Ukraina", "Romania", "Netherlands", "Andorra", "Greece", "Serbia"};
    String[] asia = {"Jordan", "Turkey", "Kazakhstan", "Iraq", "Azerbaijan", "Thailand", "China"};
    String[] africa = {"Nigeria", "Ghana", "Ethiopia", "Algeria", "Madagascar", "Eritrea", "Mali"};
    String[] australia = {"Australian Capital Territory", "South Australia","Northern Territory", "Queenslnd", "Victoria", "Tasmania", "Western Australia"};
    String[] south_america = {"Paraguay", "Belize", "Colombia", "Brazil", "Barbados", "Guyana", "United States"};
    String[] north_america = {"Peru", "Mexico", "Canada", "Guatemala", "Cuba", "Honduras", "Costa Rica"};
    String[] antartica = {"Argentina", "Australia", "Chile", "France", "Norway", "New Zealand", "United Kingdom"};

    String[]  capital_europe = {"Vienna", "Kiev", "Bucharest", "Amsterdam", "Andorra la Vella", "Athens", "Belgrade"};
    String[]  capital_asia = {"Amman", "Ankara", "Nur-Sultan", "Baghdad", "Baku", "Bangkok", "Beijing"};
    String[]  capital_africa = {"Abuja", "Accra", "Addis Ababa", "Algiers", "Antananarivo", "Asmara", "Bamako"};
    String[]  capital_australia = {"Canberra", "Adelaide", "Darwin", "Brisbane", "Melbourne", "Hobart", "Perth"};
    String[]  capital_south_america = {"Asunción", "Belmopan", "Bogotá", "Brasilia", "Bridgetown", "Georgetown", "Washington"};
    String[]  capital_north_america = {"Lima", "México", "Ottawa", "Guatemala City", "Havana", "Tegucigalpa", "San José"};
    String[]  capital_antartica = {"Buenos Aires", "Canberra", "Santiago", "Paris", "Oslo", "Wellington urban", "London"};

    String[] Population_europe  = { "1,897,500", "2,952,000", "1,820,000", "1417,000", "23,000", "664,000", "1,200,000"};
    String[] Population_asia  = { "2,065,000", "5,640,000"	, "1,145,000", "6,500,000", "2,270,000", "10,530,000", "20,430,000"};
    String[] Population_africa  = { "2,919,000", "2,439,000", "4,400,000", "2,694,000", "3,058,000", "896,000", "2,447,000"};
    String[] Population_australia  = { "403,468", "1,324,279", "145,916", "2,360,241", "4,725,316", "224,462", "2,022,044"};
    String[] Population_south_america  = { "525,000", "22,900", "7,422,000", "2,975,000", "89,200", "110,000", "705,000"};
    String[] Population_north_america  = { "9,752,000", "8,918,000", "934,000", "2,851,000", "2,136,000", "1,363,000", "342,000"};
    String[] Population_antartica  = { "15,600,000", "456,692", "7,000,000", "12,271,794", "709,037", "212,000", "13,000,000"};

    String[]  language_europe = {"English", "Ukrainian", "Romanian", "Dutch", "Catalan", "Greek", "Serbian"};
    String[]  language_asia = {"Arabic", "Turkish", "Astana", "Baghdadi Arabic", "Azerbaijani", "Thai", "Mandarin Chinese"};
    String[]  language_africa = {"English", "Akan", "Amharic", "Arabic", "Malagasy", "Tigrinya", "Bambara"};
    String[]  language_australia = {"English", "Kaurna", "English", "Mandarin", "Mandarin", "English", "Western Australian English"};
    String[]  language_south_america = {"Spanish", "English", "Spanish", "Portuguese", "English", "English", "English"};
    String[]  language_north_america = {"Spanish", "Spanish", "English", "Spanish", "Spanish", "Spanish", "Tamyen"};
    String[]  language_antartica = {"Spanish", "English", "English", "French", "Norwegian", "English", "English"};

    String[]  anthem_europe = {"Bundeshymne der Republik Österreich", "Shche ne vmerla Ukrainy i slava, i volia", "Orasul asta e plin de lumina", "Wilhelmus van Nassouwe", "El gran Carlemany", "Hymn to Liberty", "Bože pravde"};
    String[]  anthem_asia = {"As-salam al-malaki al-urdoni", "Independence March", "Менің Қазақстаным Menıñ Qazaqstanym", "Mawtini", "Azərbaycan marşı", "Phleng Chat Thai", "March of the Volunteers"};
    String[]  anthem_africa = {"Arise, O Compatriots", "God Bless Our Homeland Ghana", "March Forward, Dear Mother Ethiopia", "Kassaman or Qassaman", "Ry Tanindrazanay malala ô!", "Eritrea, Eritrea, Eritrea", "Le Mali"};
    String[]  anthem_australia = {"Advance Australia Fair", "THE SONG OF AUSTRALIA", "ADVANCE AUSTRALIA FAIR", "Life is Great in the Sunshine State", "God Save The Queen", "All Hail Tasmania!", "Advance Australia Fair"};
    String[]  anthem_south_america = {"Paraguayan National Anthem", "Land of the Free", "Oh gloria inmarcesible!", "Hino Nacional Brasileiro", "In Plenty and In Time of Need", "Green Land of Guyana", "The Star-Spangled Banner"};
    String[]  anthem_north_america = {"Himno Nacional del Perú", "Mexicanos, Al Grito de Guerra", "O Canada", "¡Guatemala Feliz!", "El Himno de Bayamo", "Tu bandera es un lampo de cielo", "Himno Nacional de Costa Rica"};
    String[]  anthem_antartica = {"Himno Nacional Argentino", "Advance Australia Fair", "Canción Nacional", "La Marseillaise", "Ja, vi elsker dette landet", "God Defend New Zealand", "God Save the King"};



    String[][] mainlandsCountries = {europe,asia,africa,australia,south_america,north_america,antartica};
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
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        ArrayAdapter<String>adp_sp=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, continents);
        adp_sp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adp_sp);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Toast.makeText(MainActivity.this, "you have to choose something", Toast.LENGTH_SHORT).show();
                    return;
                }
                ArrayAdapter<String> adp_lv = new ArrayAdapter<String>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, mainlandsCountries[position-1]);
                lv.setAdapter(adp_lv);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "you have to choose something", Toast.LENGTH_SHORT).show();
            }
        });


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position_lv, long id) {
                int spinnerPosition = sp.getSelectedItemPosition() - 1;

                switch (spinnerPosition){
                    case 0:
                        tv5.setText(capital_europe[position_lv]);
                        tv6.setText(Population_europe[position_lv]);
                        tv7.setText(language_europe[position_lv]);
                        tv8.setText(anthem_europe[position_lv]);
                        break;
                    case 1:
                        tv5.setText(capital_asia[position_lv]);
                        tv6.setText(Population_asia[position_lv]);
                        tv7.setText(language_asia[position_lv]);
                        tv8.setText(anthem_asia[position_lv]);
                        break;
                    case 2:
                        tv5.setText(capital_africa[position_lv]);
                        tv6.setText(Population_africa[position_lv]);
                        tv7.setText(language_africa[position_lv]);
                        tv8.setText(anthem_africa[position_lv]);
                        break;
                    case 3:
                        tv5.setText(capital_australia[position_lv]);
                        tv6.setText(Population_australia[position_lv]);
                        tv7.setText(language_australia[position_lv]);
                        tv8.setText(anthem_australia[position_lv]);
                        break;
                    case 4:
                        tv5.setText(capital_south_america[position_lv]);
                        tv6.setText(Population_south_america[position_lv]);
                        tv7.setText(language_south_america[position_lv]);
                        tv8.setText(anthem_south_america[position_lv]);
                        break;
                    case 5:
                        tv5.setText(capital_north_america[position_lv]);
                        tv6.setText(Population_north_america[position_lv]);
                        tv7.setText(language_north_america[position_lv]);
                        tv8.setText(anthem_north_america[position_lv]);
                        break;
                    case 6:
                        tv5.setText(capital_antartica[position_lv]);
                        tv6.setText(Population_antartica[position_lv]);
                        tv7.setText(language_antartica[position_lv]);
                        tv8.setText(anthem_antartica[position_lv]);
                        break;
                }
            }
        });
    }
}