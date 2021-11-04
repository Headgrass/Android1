package ru.geekbrains.android1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private static final Integer REQ_CODE = 88;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_settings).setOnClickListener(v -> {
            Intent intent = new Intent(this, Settings.class);
            startActivityForResult(intent, REQ_CODE);
        });


        findViewById(R.id.btn_calc).setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_calc.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_CODE && resultCode == RESULT_OK) {
            recreate();
        }
    }
}