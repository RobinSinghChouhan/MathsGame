package com.example.mathsgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class hello extends AppCompatActivity {
    TextView noname;
    Button play;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        noname=findViewById(R.id.noname);
        play=findViewById(R.id.play);
        Intent in=getIntent();
        String selectuser=in.getStringExtra("username");
        String selectpass=in.getStringExtra("password");
        noname.setText("Hello! "+selectuser);
    play.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(hello.this, "PLAY", Toast.LENGTH_SHORT).show();
            Intent in = new Intent(hello.this,gamequestion.class);
            startActivity(in);
        }
    });
    }
}
