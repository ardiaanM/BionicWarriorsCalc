package com.kyhskola.kalkuppg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view){
        Button bt0 =(Button)findViewById(R.id.buttonZero);
        Button bt1 =(Button)findViewById(R.id.button1);
        Button bt2 =(Button)findViewById(R.id.button2);
        Button bt3 =(Button)findViewById(R.id.button3);
        Button bt4 =(Button)findViewById(R.id.button4);
        Button bt5 =(Button)findViewById(R.id.button5);
        Button bt6 =(Button)findViewById(R.id.button6);
        Button bt7 =(Button)findViewById(R.id.button7);
        Button bt8 =(Button)findViewById(R.id.button8);
        Button bt9 =(Button)findViewById(R.id.button9);
        Button bt00 =(Button)findViewById(R.id.button00);
        Button btPlus =(Button)findViewById(R.id.buttonAddition);
        Button btSub =(Button)findViewById(R.id.buttonSubtraction);
        Button btMulti =(Button)findViewById(R.id.buttonMultiplication);
        Button btDiv =(Button)findViewById(R.id.buttonDivision);
        Button btEqu =(Button)findViewById(R.id.buttonEquals);
        Button btPercent =(Button)findViewById(R.id.buttonPercent);
        Button btC =(Button)findViewById(R.id.buttonC);
        Button btDot =(Button)findViewById(R.id.buttonDot);
        Button btBack =(Button)findViewById(R.id.buttonBack);


        int b0 = Integer.parseInt(bt0.getText().toString());
    }


}