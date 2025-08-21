package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class elec_sebha extends AppCompatActivity {

    int counter = 0;
    TextView counterTextView;
    RelativeLayout btnTasbeeh;
    Button  btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elec_sebha);



            // ربط عناصر الواجهة
            counterTextView = findViewById(R.id.counterTextView);
            btnTasbeeh = findViewById(R.id.btnTasbeeh);
            btnReset = findViewById(R.id.btnReset);

            // عند الضغط على زر التسبيح
            btnTasbeeh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    counter++;
                    counterTextView.setText(String.valueOf(counter));
                }
            });

            // عند الضغط على زر الإعادة
            btnReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    counter = 0;
                    counterTextView.setText(String.valueOf(counter));
                }
            });


    }
}