package com.example.scoreboardapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*Button a1;
    Button a2;
    Button a3;*/
    TextView ta;

    /*Button b1;
    Button b2;
    Button b3;*/
    TextView tb;

    /*Button r;*/
    int a = 0;
    int b = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*a1 = findViewById(R.id.a_1_score);
        a2 = findViewById(R.id.a_2_score);
        a3 = findViewById(R.id.a_3_score);*/
        ta = findViewById(R.id.team_a_score);

        /*b1 = findViewById(R.id.b_1_score);
        b2 = findViewById(R.id.b_2_score);
        b3 = findViewById(R.id.b_3_score);*/
        tb = findViewById(R.id.team_b_score);

        /*r.findViewById(R.id.reset);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                a = a + 1;
                ta.setText("" + a);
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                a = a + 2;
                ta.setText("" + a);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                a = a + 3;
                ta.setText("" + a);
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                b = b + 1;
                tb.setText("" + b);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                b = b + 2;
                ta.setText("" + b);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                b = b + 3;
                ta.setText("" + b);
            }
        });


        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                a = b = 0;
                ta.setText("" + a);
                tb.setText("" + b);
            }
        });*/

        if (savedInstanceState != null) {
            String s1 = savedInstanceState.getString("swetha");
            a = Integer.parseInt(s1);
            ta.setText("" + a);
            String s2 = savedInstanceState.getString("swetha");
            b = Integer.parseInt(s2);
            tb.setText("" + b);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("swetha", ta.getText().toString());
        outState.putString("swetha", tb.getText().toString());

    }

    /* TEAM A */
    public void a1score(View view) {
        a=a+1;
        ta.setText("" + a);
    }

    public void a2score(View view) {
        a=a+2;
        ta.setText("" + a);
    }

    public void a3score(View view) {
        a=a+3;
        ta.setText("" + a);
    }


    /* TEAM B */
    public void b1score(View view) {
        b=b+1;
        tb.setText("" + b);
    }

    public void b2score(View view) {
        b=b+2;
        tb.setText("" + b);
    }

    public void b3score(View view) {
        b=b+3;
        tb.setText("" + b);
    }


    /* RESET BUTTON */
    public void reset(View view) {
        a=b=0;
        ta.setText("" + a);
        tb.setText("" + b);
    }
}



