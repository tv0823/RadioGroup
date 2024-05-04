package com.example.radiogroup;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout main;
    Switch sW1;
    RadioButton rBcolorRed, rBcolorBlue, rBcolorYellow, rBcolorGreen;
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
            } else if (rBcolorYellow.isChecked()) {
                main.setBackgroundColor(Color.YELLOW);
            } else if (rBcolorGreen.isChecked()){
                main.setBackgroundColor(Color.GREEN);
            } else {
                Toast.makeText(this, "Please choose a color", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void initViews() {
        main = findViewById(R.id.main);
        sW1 = findViewById(R.id.sW1);
        rBcolorRed = findViewById(R.id.rBcolorRed);
        rBcolorBlue = findViewById(R.id.rBcolorBlue);
        rBcolorYellow = findViewById(R.id.rBcolorYellow);
        rBcolorGreen = findViewById(R.id.rBcolorGreen);
    }
}