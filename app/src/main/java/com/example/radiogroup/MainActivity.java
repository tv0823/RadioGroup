package com.example.radiogroup;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout main;
    Switch sW1;
    RadioButton rBcolorRed, rBcolorBlue, rBcolorGreen, rBcolorWhite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    public void chageBgColor(View view) {
        if(!sW1.isChecked()) {
            if (rBcolorRed.isChecked()) {
                main.setBackgroundColor(Color.RED);
            } else if (rBcolorBlue.isChecked()) {
                main.setBackgroundColor(Color.BLUE);
            } else if (rBcolorGreen.isChecked()) {
                main.setBackgroundColor(Color.GREEN);
            } else {
                main.setBackgroundColor(Color.WHITE);
            }
        }
    }

    public void initViews() {
        main = findViewById(R.id.main);
        sW1 = findViewById(R.id.sW1);
        rBcolorRed = findViewById(R.id.rBcolorRed);
        rBcolorBlue = findViewById(R.id.rBcolorBlue);
        rBcolorGreen = findViewById(R.id.rBcolorGreen);
        rBcolorWhite = findViewById(R.id.rBcolorWhite);
    }

    public void ColorWhite(View view) {
        if (sW1.isChecked()) {
            main.setBackgroundColor(Color.WHITE);
        }
    }

    public void ColorRed(View view) {
        if (sW1.isChecked()) {
            main.setBackgroundColor(Color.RED);
        }
    }

    public void ColorBlue(View view) {
        if (sW1.isChecked()) {
            main.setBackgroundColor(Color.BLUE);
        }
    }

    public void ColorGreen(View view) {
        if (sW1.isChecked()) {
            main.setBackgroundColor(Color.GREEN);
        }
    }
}