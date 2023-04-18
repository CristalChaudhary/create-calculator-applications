package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText etFirstValue, etSecondValue;
    TextView etAnswer;
    Button Add, Sub, Multiply, Divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        etAnswer = findViewById(R.id.etAnswer);
        Add = findViewById(R.id.buttonAdd);
        Sub = findViewById(R.id.buttonSub);
        Multiply = findViewById(R.id.buttonMultiply);
        Divide = findViewById(R.id.buttonDivide);





    Add.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {





            int firstValue,SecondValue,Answer;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            SecondValue = Integer.parseInt(etSecondValue.getText().toString());
            Answer = firstValue + SecondValue;
            etAnswer.setText("ans = " + Answer);




        }
    });
        Sub.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {



            int firstValue,SecondValue,Answer;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            SecondValue = Integer.parseInt(etSecondValue.getText().toString());
            Answer = firstValue - SecondValue;
            etAnswer.setText("ans = " + Answer);




        }
    });
        Multiply.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {



            int firstValue,SecondValue,Answer;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            SecondValue = Integer.parseInt(etSecondValue.getText().toString());
            Answer = firstValue * SecondValue;
            etAnswer.setText("ans = " + Answer);




        }
    });
        Divide.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {



            int firstValue,SecondValue,Answer;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            SecondValue = Integer.parseInt(etSecondValue.getText().toString());
            Answer = firstValue / SecondValue;
            etAnswer.setText("ans = " + Answer);




        }
    });





   }
}