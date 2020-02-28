package com.example.mathsgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class gamequestion extends AppCompatActivity {
    TextView num1,operator,num2;
    Button op1,op2,op3,op4;
    int correct=1;
    int count=1;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamequestion);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        operator=findViewById(R.id.operator);
        op1=findViewById(R.id.op1);
        op2=findViewById(R.id.op2);
        op3=findViewById(R.id.op3);
        op4=findViewById(R.id.op4);
        nextQuestion();
    }
    public void nextQuestion()
    {
        double a=Math.random()*(10)+1;
        double b=Math.random()*(10)+1;
        int a1=(int)a;
        int b1=(int)b;
        double c=Math.random()*(4)+1;
        int c1=(int)c;
        int ans=0;
        String op="";

        switch (c1)
        {
            case 0: op="+";
                ans=a1+b1;
                break;
            case 1: op="-";
                ans=a1-b1;
                break;
            case 2: op="*";
                ans=a1*b1;
                break;
            case 3: op="/";
                ans=a1/b1;
                break;
            case 4: op="%";
                ans=a1%b1;
                break;
        }
        final String checked=""+ans;
        num1.setText(""+a1);
        num2.setText(""+b1);
        operator.setText(op);
        double options=Math.random()*3+1;
        int opt=(int)options;
        switch (opt) {
            case 0:op1.setText("" + ans);
                op2.setText("" + (ans+10));
                op3.setText("" + (ans-10));
                op4.setText("" + (ans+1));
                break;
            case 1:op2.setText("" + ans);
                op3.setText("" + (ans+10));
                op4.setText("" + (ans-10));
                op1.setText("" + (ans+1));
                break;
            case 2:op3.setText("" + ans);
                op4.setText("" + (ans+10));
                op1.setText("" + (ans-10));
                op2.setText("" + (ans+1));
                break;
            case 3:op4.setText("" + ans);
                op1.setText("" + (ans+10));
                op2.setText("" + (ans-10));
                op3.setText("" + (ans+1));
                break;
        }
        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op1.getText().equals(checked))
                {
                    correct++;
                }
                count++;
                check();
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op2.getText().equals(checked))
                {
                    correct++;
                }
                count++;
                check();
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op3.getText().equals(checked))
                {
                    correct++;
                }
                count++;
                check();
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op4.getText().equals(checked))
                {
                    correct++;
                }
                count++;
                check();
            }
        });
    }
    public void check()
    {
        if(count<=10)
        {
            nextQuestion();
        }
        else
        {
            int finalCorrect=correct;
            String finalResult=String.valueOf(finalCorrect);
            Toast.makeText(gamequestion.this,"Complete!"+finalCorrect,Toast.LENGTH_SHORT).show();
            Intent in=new Intent(gamequestion.this,result.class);
            in.putExtra("result",finalResult);
            startActivity(in);
        }
    }

}

