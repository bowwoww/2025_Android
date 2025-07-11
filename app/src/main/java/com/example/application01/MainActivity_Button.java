package com.example.application01;
//命名原則
//class第一個字為大寫

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_Button extends AppCompatActivity {

    Button btn01,btn02;
    TextView text01;
    int i = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_button);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);
        text01 = findViewById(R.id.text01);
        btn01.setOnClickListener(v ->{
            //設定click事件 按下後改變按鈕文字
            btn01.setText("Clicked");
            btn02.setText("Now Click Me");
            text01.setText(String.valueOf(++i));
            btn01.setClickable(false);
            btn02.setClickable(true);
            int r = (int)(Math.random()*256),g = (int)(Math.random()*256),b = (int)(Math.random()*256);
            text01.setTextColor(Color.rgb(r,g,b));
        });
        btn02.setOnClickListener(v1 ->{
            //設定click事件 按下後改變按鈕文字
            btn01.setText("Now Click Me");
            btn02.setText("Clicked");
            text01.setText(String.valueOf(++i));
            btn01.setClickable(true);
            btn02.setClickable(false);
        });
    }
}