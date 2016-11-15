package com.example.liz.math;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    EditText x_value, y_value, z_value;
    TextView headline, resultf, resulth, resultg;
    Button function_f, function_g, function_h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x_value = (EditText) findViewById(R.id.x_value);
        y_value = (EditText) findViewById(R.id.y_value);
        z_value = (EditText) findViewById(R.id.z_value);
        headline = (TextView) findViewById(R.id.headline);
        resultf = (TextView) findViewById(R.id.result_f);
        resultg = (TextView) findViewById(R.id.result_g);
        resulth = (TextView) findViewById(R.id.result_h);
        function_f = (Button) findViewById(R.id.function_f);
        function_h = (Button) findViewById(R.id.function_h);
        function_g = (Button) findViewById(R.id.function_g);

        function_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = Integer.parseInt(x_value.getText().toString()) + Integer.parseInt(y_value.getText().toString());
                resultf.setText(" " + sum);
            }
        });
        function_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int output = Integer.parseInt(x_value.getText().toString())^10;
                resulth.setText(" " + output);
            }
        });

        function_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = Integer.parseInt(x_value.getText().toString());
                double sqrRoot = x/2;
                double t = sqrRoot;
                do {
                    sqrRoot = (t + (x/t))/2;
                }while((t-sqrRoot) != 0);
                double xsqrt = sqrRoot;
                double y;
                if(Integer.parseInt(y_value.getText().toString()) >=0 ) {
                    y = Integer.parseInt(y_value.getText().toString());
                } else {
                    y = -Integer.parseInt(y_value.getText().toString());
                }

                int z = Integer.parseInt(z_value.getText().toString())^Integer.parseInt(y_value.getText().toString());
                double finalresult = xsqrt + y + z;
                resultg.setText(" " + finalresult);


            }
        });

    }
}

