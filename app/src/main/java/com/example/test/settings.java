package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.test.fragments.TextSizeFragment;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button btn_textSize_settings =findViewById(R.id.btn_textSize_settings);

        FrameLayout frame_Layout = findViewById(R.id.frame_layout);

        btn_textSize_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextSizeFragment textSizeFragment = new TextSizeFragment();
                FragmentManager myFragmentManager = getSupportFragmentManager();
                FragmentTransaction myFragmentTransaction = myFragmentManager.beginTransaction();
                myFragmentTransaction.replace(R.id.frame_layout,textSizeFragment);
                myFragmentTransaction.addToBackStack("TextSize");
                myFragmentTransaction.commit();

            }
        });


    }
}