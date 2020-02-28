package com.example.mathsgame;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class result extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Intent in=getIntent();
        String finalResult=in.getStringExtra("result");
        TextView score;
        score=findViewById(R.id.score);
        score.setText(finalResult);
        ProgressBar progress;
        progress=findViewById(R.id.progress);
        progress.setMax(10);
        int pro=Integer.parseInt(finalResult);
        progress.setProgress(pro);
    }
}
