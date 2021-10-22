package ru.geekbrains.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_settings).setOnClickListener(v -> setContentView(R.layout.settings));
        findViewById(R.id.btn_anketa).setOnClickListener(v -> setContentView(R.layout.test_ui));
        findViewById(R.id.btn_calc).setOnClickListener(v -> setContentView(R.layout.calc));

    }
}