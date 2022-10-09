package com.kyhskola.kalkuppg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6,
            bt7, bt8, bt9, btPlus, btSub, btDiv,
            btMulti, btC, btEqu;

    EditText numberInput;

    float mValueOne, mValueTwo;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        Button bt0 = (Button) findViewById(R.id.buttonZero);
        Button bt1 = (Button) findViewById(R.id.button1);
        Button bt2 = (Button) findViewById(R.id.button2);
        Button bt3 = (Button) findViewById(R.id.button3);
        Button bt4 = (Button) findViewById(R.id.button4);
        Button bt5 = (Button) findViewById(R.id.button5);
        Button bt6 = (Button) findViewById(R.id.button6);
        Button bt7 = (Button) findViewById(R.id.button7);
        Button bt8 = (Button) findViewById(R.id.button8);
        Button bt9 = (Button) findViewById(R.id.button9);
        Button bt00 = (Button) findViewById(R.id.button00);
        Button btPlus = (Button) findViewById(R.id.buttonAddition);
        Button btSub = (Button) findViewById(R.id.buttonSubtraction);
        Button btMulti = (Button) findViewById(R.id.buttonMultiplication);
        Button btDiv = (Button) findViewById(R.id.buttonDivision);
        Button btEqu = (Button) findViewById(R.id.buttonEquals);
        Button btPercent = (Button) findViewById(R.id.buttonPercent);
        Button btC = (Button) findViewById(R.id.buttonC);
        Button btDot = (Button) findViewById(R.id.buttonDot);
        Button btBack = (Button) findViewById(R.id.buttonBack);
        numberInput = (EditText) findViewById(R.id.numberInput);

        bt1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "7");
            }

        });
        bt8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "9");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "0");
            }
        });
        btDot.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + ".");
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "1");
            }
        });
        bt00.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText(numberInput.getText() + "00");
            }
        });


        btPlus.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (numberInput == null) {
                    numberInput.setText("");
                } else {
                    mValueOne = Float.parseFloat(numberInput.getText() + "");
                    Addition = true;
                    numberInput.setText(null);
                }
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mValueOne = Float.parseFloat(numberInput.getText() + "");
                Subtract = true;
                numberInput.setText(null);
            }
        });
        btMulti.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mValueOne = Float.parseFloat(numberInput.getText() + "");
                Multiplication = true;
                numberInput.setText(null);
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mValueOne = Float.parseFloat(numberInput.getText() + "");
                Division = true;
                numberInput.setText(null);
            }
        });


        btEqu.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mValueTwo = Float.parseFloat(numberInput.getText() + "");
                if (Addition == true) {
                    numberInput.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }
                if (Subtract == true) {
                    numberInput.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }
                if (Multiplication == true) {
                    numberInput.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }
                if (Division == true) {
                    numberInput.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });
        btC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                numberInput.setText("");
            }
        });

        int num0 = Integer.parseInt(bt0.getText().toString());
    }



}