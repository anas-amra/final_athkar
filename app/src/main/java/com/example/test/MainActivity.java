package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.test.adapters.AthkarAdapter;
import com.example.test.models.Athkar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gv ;
    ArrayList<Athkar> athkarArrayList;
    AthkarAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = findViewById(R.id.gv_athkar);
        athkarArrayList = new ArrayList<>();
        athkarArrayList.add(new Athkar(1,R.drawable.sun, "أذكار الصباح", "morning"));
        athkarArrayList.add(new Athkar(2,R.drawable.crescentmoon64, "أذكار المساء", "evening"));
        athkarArrayList.add(new Athkar(3,R.drawable.travel, "دعاء السفر", "travel"));
        athkarArrayList.add(new Athkar(4,R.drawable.mosque, "دعاء الذهاب للمسجد", "mosque"));
        athkarArrayList.add(new Athkar(5,R.drawable.alarmclock, "دعاء الاستيقاظ", "wake_up"));
        athkarArrayList.add(new Athkar(6,R.drawable.sleep, "دعاء قبل النوم", "sleep"));
        athkarArrayList.add(new Athkar(7,R.drawable.carpet, "تسابيح", "tasbeeh"));
        athkarArrayList.add(new Athkar(8,R.drawable.tasbih, "مسبحة إلكترونية", "digital_tasbeeh"));
        athkarArrayList.add(new Athkar(9,R.drawable.pray, "أذكار الصلاة", "prayer_azkar"));
        athkarArrayList.add(new Athkar(10,R.drawable.pray2, "بعد الصلاة", "after_prayer"));
        athkarArrayList.add(new Athkar(11,R.drawable.adzan, "سماع الأذان", "athan"));
        athkarArrayList.add(new Athkar(12,R.drawable.pray4, "دعاء الاستخارة", "istikharah"));
        athkarArrayList.add(new Athkar(13,R.drawable.casket, "صلاة الجنازة", "janazah"));
        athkarArrayList.add(new Athkar(14,R.drawable.loan, "دعاء قضاء الدين", "loan"));

        adapter = new AthkarAdapter(MainActivity.this,athkarArrayList);
        gv.setAdapter(adapter);

        //click and go to the page
        gv.setOnItemClickListener((parent, view, position, id) -> {

            Athkar item = athkarArrayList.get(position);
            //open page based on key
            switch (item.getKey()) {
                case "morning":
                    startActivity(new Intent(this, morning.class));
                    Toast.makeText(MainActivity.this, "اذكار الصباح", Toast.LENGTH_SHORT).show();
                    break;

                case "evening":
                    startActivity(new Intent(this, evening.class));
                    Toast.makeText(MainActivity.this, "اذكار المساء", Toast.LENGTH_SHORT).show();
                    break;

                case "travel":
                    startActivity(new Intent(this, travel.class));
                    Toast.makeText(MainActivity.this, "دعاء السفر", Toast.LENGTH_SHORT).show();
                    break;

                case "mosque":
                    startActivity(new Intent(this, mosque.class));
                    Toast.makeText(MainActivity.this, "دعاء الذهاب للمسجد", Toast.LENGTH_SHORT).show();
                    break;
                case "wake_up":
                    startActivity(new Intent(this, wake_up.class));
                    Toast.makeText(MainActivity.this, "دعاء الاستيقاظ", Toast.LENGTH_SHORT).show();
                    break;
                case "sleep":
                    startActivity(new Intent(this, sleep_pray.class));
                    Toast.makeText(MainActivity.this, "دعاء قبل النوم", Toast.LENGTH_SHORT).show();
                    break;
                case "tasbeeh":
                    startActivity(new Intent(this, tasbeeh.class));
                    Toast.makeText(MainActivity.this, "تسابيح", Toast.LENGTH_SHORT).show();
                    break;
                case "digital_tasbeeh":
                    startActivity(new Intent(this, elec_sebha.class));
                    Toast.makeText(MainActivity.this, "مسبحة الكترونية", Toast.LENGTH_SHORT).show();
                    break;
                case "prayer_azkar":
                    startActivity(new Intent(this, athkar_pray.class));
                    Toast.makeText(MainActivity.this, "اذكار الصلاة", Toast.LENGTH_SHORT).show();
                    break;
                case "after_prayer":
                    startActivity(new Intent(this, after_pray.class));
                    Toast.makeText(MainActivity.this, "بعد الصلاة", Toast.LENGTH_SHORT).show();
                    break;
                case "athan":
                    startActivity(new Intent(this, athan.class));
                    Toast.makeText(MainActivity.this, "سماع الاذان", Toast.LENGTH_SHORT).show();
                    break;
                case "istikharah":
                    startActivity(new Intent(this, istekhara.class));
                    Toast.makeText(MainActivity.this, "دعاء الاستخارة", Toast.LENGTH_SHORT).show();
                    break;
                case "janazah":
                    startActivity(new Intent(this,casket.class));
                    Toast.makeText(MainActivity.this, "صلاة الجنازة", Toast.LENGTH_SHORT).show();
                    break;
                case "loan":
                    startActivity(new Intent(this,loan.class));
                    Toast.makeText(MainActivity.this, "دعاء قضاء الدين", Toast.LENGTH_SHORT).show();
                    break;


            }
        });


        ImageView iv_settings = findViewById(R.id.iv_settings);
        iv_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent settings_intent = new Intent(MainActivity.this , settings.class);
                Intent settings_intent = new Intent(MainActivity.this, settings.class);
                startActivity(settings_intent);
                Toast.makeText(MainActivity.this, "الاعدادات", Toast.LENGTH_SHORT).show();
            }
        });






    }
}