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

public class signin extends AppCompatActivity {
    Button login;
    EditText label;
    EditText pass;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        initComponent();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signin.this, "done", Toast.LENGTH_SHORT).show();
                String uname=label.getText().toString();
                Intent in = new Intent(signin.this,hello.class);
                in.putExtra("username",uname);
                startActivity(in);
            }
        });
    }
    private void initComponent()
    {
        label=findViewById(R.id.label);
        pass=findViewById(R.id.pass);
        login=findViewById(R.id.login);
    }
}
