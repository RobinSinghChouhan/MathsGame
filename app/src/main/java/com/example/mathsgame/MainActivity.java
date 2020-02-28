package com.example.mathsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button signin;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mathsgame);
        initComponent();
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sign In Clicked!", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(MainActivity.this,signin.class);
                startActivity(in);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(MainActivity.this,"Not yet introduced would be introduced in further updates! ",Toast.LENGTH_SHORT).show();

            }
        });

    }
    private void initComponent(){
        signin=findViewById(R.id.signin);
        signup=findViewById(R.id.signup);
    }
}
