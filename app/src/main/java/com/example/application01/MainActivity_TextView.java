package com.example.application01;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_TextView extends AppCompatActivity implements View.OnFocusChangeListener {

    List<TextView> textlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_text_view);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        textlist = new ArrayList<>();

        textlist.add(findViewById(R.id.text01));
        textlist.add(findViewById(R.id.text02));
        textlist.add(findViewById(R.id.text03));

        for (TextView textView : textlist) {
            if (textView != null) {
                textView.setOnFocusChangeListener(this);
            }
        }

        var size = textlist.get(0).getTextSize() / getResources().getDisplayMetrics().scaledDensity;
        android.util.Log.d("MainActivity_TextView", "onCreate: " + size);
    }

    public void onFocusChange(View v, boolean hasFocus){

        for(TextView textView : textlist){
            textView.setTextColor(0xFF000000);
            textView.setTextSize(24);
            if(textView.hasFocus()) {
                textView.setTextColor(Color.rgb(255, 0, 0));
                textView.setTextSize(30f);
            }
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}