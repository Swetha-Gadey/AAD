package com.example.countapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button i;
    Button d;
    Button z;
    Button t;
    TextView tv;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=findViewById(R.id.inc);
        d=findViewById(R.id.dec);
        z=findViewById(R.id.zero);
        t=findViewById(R.id.toast);
        tv=findViewById(R.id.textcount);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Action
                a++;
                tv.setText(""+a);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Action
                a--;
                tv.setText(""+a);
            }
        });

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Action
                a=0;
                tv.setText(""+a);
            }
        });

        if(savedInstanceState!=null){
            String s=savedInstanceState.getString("swetha");
            a=Integer.parseInt(s);
            tv.setText(""+a);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("swetha",tv.getText().toString());
    }

    public void display(View view){

        Toast.makeText(this, "Your Count is : "+a, Toast.LENGTH_SHORT).show();
    }
}