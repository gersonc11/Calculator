package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textSpace)
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.one, R.id.two, R.id.three, R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine, R.id.zero, R.id.plus, R.id.minus, R.id.times, R.id.divide, R.id.equals, R.id.slash, R.id.cButton, R.id.dot, R.id.percent})
    public void pressingButtons(Button view) {
        switch (view.getId()) {
            case R.id.one:
                display.append("1");
                break;
            case R.id.two:
                display.append("2");
                break;
            case R.id.three:
                display.append("3");
                break;
            case R.id.four:
                display.append("4");
                break;
            case R.id.five:
                display.append("5");
                break;
            case R.id.six:
                display.append("6");
                break;
            case R.id.seven:
                display.append("7");
                break;
            case R.id.eight:
                display.append("8");
                break;
            case R.id.nine:
                display.append("9");
                break;
            case R.id.zero:
                display.append("0");
                break;
            case R.id.plus:
                display.append("+");
                break;
            case R.id.minus:
                display.append("-");
                break;
            case R.id.times:
                display.append("*");
                break;
            case R.id.divide:
                display.append("/");
                break;
            case R.id.cButton:
                display.setText("");
                break;
            case R.id.equals:
                display.append("=");
                break;
            case R.id.dot:
                display.append(".");
                break;
            case R.id.slash:
                display.append("+/-");
                break;
            case R.id.percent:
                display.append("%");
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
