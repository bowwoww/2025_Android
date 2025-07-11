package com.example.application01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_ImageView extends AppCompatActivity {

    TextView text01,text02;
    ImageView img01;

    Boolean changed,Imgchanged;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_image_view);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        text01 = findViewById(R.id.text01);
        text02 = findViewById(R.id.text02);
        img01 = findViewById(R.id.img01);
        changed = false;
        Imgchanged = false;

        text01.setOnTouchListener((v, event) -> {
            //當text01被按下觸發事件
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                if(!changed){
                    img01.setImageResource(R.drawable.pika);
                }
                else{
                    img01.setImageResource(R.drawable.picture01);
                }
                changed = !changed;
            }
            return true;

        });
        text02.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN)
            {
                if(!Imgchanged){
                    img01.setScaleType(ImageView.ScaleType.CENTER);
                }
                else{
                    img01.setScaleType(ImageView.ScaleType.FIT_XY);
            }
                Imgchanged = !Imgchanged;
            }
            return true;
        });


    }
}