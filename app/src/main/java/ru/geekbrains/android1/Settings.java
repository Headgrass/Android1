package ru.geekbrains.android1;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.widget.SwitchCompat;

public class Settings extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        SwitchCompat switchDarkTheme = findViewById(R.id.sw_day_night);
        switchDarkTheme.setChecked(isDarkTheme());
        switchDarkTheme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setDarkTheme(isChecked);
                recreate();
            }
        });

        findViewById(R.id.set_btn_save).setOnClickListener(v -> {
            finish();
        });

    }
}