package ru.geekbrains.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    int temp1, temp2;

    boolean boolplus, boolminus, booldivided, boolmulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        boolplus = false;
        boolminus = false;
        booldivided = false;
        boolmulty = false;
        textView = findViewById(R.id.windcalc);


        Button button0 = findViewById(R.id.btn0);
        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);
        Button button7 = findViewById(R.id.btn7);
        Button button8 = findViewById(R.id.btn8);
        Button button9 = findViewById(R.id.btn9);
        Button buttonequals = findViewById(R.id.btn_equals);
        Button buttonminus = findViewById(R.id.btn_minus);
        Button buttonplus = findViewById(R.id.btn_plus);
        Button buttonmultiply = findViewById(R.id.btn_multiply);
        Button buttondivided = findViewById(R.id.btn_divided);
        Button buttonclear = findViewById(R.id.btn_backspace);

        button0.setOnClickListener(v -> {
            textView.setText(textView.getText() + "0");
        });
        button1.setOnClickListener(v -> {
            textView.setText(textView.getText() + "1");
        });
        button2.setOnClickListener(v -> {
            textView.setText(textView.getText() + "2");
        });
        button3.setOnClickListener(v -> {
            textView.setText(textView.getText() + "3");
        });
        button4.setOnClickListener(v -> {
            textView.setText(textView.getText() + "4");
        });
        button5.setOnClickListener(v -> {
            textView.setText(textView.getText() + "5");
        });
        button6.setOnClickListener(v -> {
            textView.setText(textView.getText() + "6");
        });
        button7.setOnClickListener(v -> {
            textView.setText(textView.getText() + "7");
        });
        button8.setOnClickListener(v -> {
            textView.setText(textView.getText() + "8");
        });
        button9.setOnClickListener(v -> {
            textView.setText(textView.getText() + "9");
        });
        buttonclear.setOnClickListener(v -> {
            textView.setText("0");
        });


        buttonminus.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                temp1 = Integer.parseInt(textView.getText() + "");
                boolminus = true;
                textView.setText(null);
            }
        });


        buttonplus.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                temp1 = Integer.parseInt(textView.getText() + "");
                boolplus = true;
                textView.setText(null);
            }
        });

        buttonmultiply.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                temp1 = Integer.parseInt(textView.getText() + "");
                boolmulty = true;
                textView.setText(null);
            }
        });

        buttondivided.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                temp1 = Integer.parseInt(textView.getText() + "");
                booldivided = true;
                textView.setText(null);
            }
        });

        buttonequals.setOnClickListener(v -> {
            temp2 = Integer.parseInt(textView.getText() + "");

            if (boolminus = true) {
                textView.setText(temp1 - temp2 + "");
                boolminus = false;
            }
            if (boolplus = true) {
                textView.setText(temp1 + temp2 + "");
                boolplus = false;
            }
            if (boolmulty = true) {
                textView.setText(temp1 * temp2 + "");
                boolmulty = false;
            }

            if (booldivided = true) {
                textView.setText(temp1 / temp2 + "");
                booldivided = false;
            }
        });
/*
        findViewById(R.id.btn_settings).setOnClickListener(v -> setContentView(R.layout.settings));
        findViewById(R.id.btn_anketa).setOnClickListener(v -> setContentView(R.layout.test_ui));
        findViewById(R.id.btn_calc).setOnClickListener(v -> setContentView(R.layout.calc));
*/
    }
}