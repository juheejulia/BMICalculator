package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityMain extends AppCompatActivity {

    EditText height, weight;
    Button calculator;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        calculator = findViewById(R.id.btn_calculate);
        result = findViewById(R.id.result);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float heightValue = Float.parseFloat(String.valueOf(height.getText())) / 100;
                float weightValue = Float.parseFloat(String.valueOf(weight.getText()));
                float bmi = weightValue / (heightValue * heightValue);
                result.setText(String.valueOf(bmi));
            }
        });                                                                                                  
    }
}