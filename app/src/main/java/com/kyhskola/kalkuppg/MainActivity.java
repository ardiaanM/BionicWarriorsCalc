package com.kyhskola.kalkuppg;

import static android.text.TextUtils.indexOf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

// https://github.com/ardiaanM/BionicWarriorsCalc
// Alina, Ardian, Biniyam, Jonatan, Robin

public class MainActivity extends AppCompatActivity {

    Button bt0, bt00, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btDot, btPlus, btSub, btDiv, btMulti, btC,
            btEqu, btPi, btSqRoot, btBack;

    TextView historyTextView;
    TextView numberInput;
    TextView resultTextView;

    String firstValue = "";
    String operator = "";
    String secondValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        // Hämtar referenser till samtliga komponenter
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
        Button btC = (Button) findViewById(R.id.buttonC);
        Button btDot = (Button) findViewById(R.id.buttonDot);
        Button btBack = (Button) findViewById(R.id.buttonBack);
        Button btPi = (Button) findViewById(R.id.buttonPi);
        Button btSqRoot = (Button) findViewById(R.id.buttonSqr);
        numberInput = (TextView) findViewById(R.id.numberInput);
        historyTextView = (TextView) findViewById(R.id.history);
        resultTextView = (TextView) findViewById(R.id.result);

        // Sätter onClickListener på samtliga knappar.
        // ----------------- Siffrorna adderar endast till numberInput -----------------

        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "9");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "0");
            }
        });
        btDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + ".");
            }
        });
        bt00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckForPi();
                numberInput.setText(numberInput.getText() + "00");
            }
        });

        // ----------------- Operators kräver ett firstValue. Går ej sätta efter secondValue -----------------
        btPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (CanUseOperator()) {
                    firstValue = numberInput.getText().toString();

                    operator = "+";

                    UpdateHistoryTextView();
                    ClearNumberInputView();
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (CanUseOperator()) {
                    firstValue = numberInput.getText().toString();

                    operator = "-";

                    UpdateHistoryTextView();
                    ClearNumberInputView();
                }
            }
        });

        btMulti.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (CanUseOperator()) {
                    firstValue = numberInput.getText().toString();

                    operator = "*";

                    UpdateHistoryTextView();
                    ClearNumberInputView();
                }
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (CanUseOperator()) {
                    firstValue = numberInput.getText().toString();

                    operator = "/";

                    UpdateHistoryTextView();
                    ClearNumberInputView();
                }
            }
        });


        btSqRoot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (numberInput.length() > 0) {
                    if (numberInput.getText() == btPi.getText()) {
                        double sqrt = Math.sqrt(Math.PI);

                        String result = Double.toString((double) Math.round(sqrt * 100) / 100);
                        numberInput.setText(result);
                    }

                    else {
                        String numberInputString = numberInput.getText().toString();
                        double numberInputDouble = Double.parseDouble(numberInputString);
                        double sqrt = Math.sqrt(numberInputDouble);
                        String result = Double.toString((double) Math.round(sqrt * 100) / 100);
                        numberInput.setText(result);
                    }
                }
            }
        });

        btPi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberInput.setText(btPi.getText().toString());
            }
        });

        btBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String numberString = numberInput.getText().toString();

                if (numberString.length() > 0) {
                    numberInput.setText(numberString.substring(0, numberString.length() - 1));
                }
            }
        });

        btC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClearNumberInputView();
                historyTextView.setText("");
                ClearValues();
                resultTextView.setText("");
            }
        });

        btEqu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (numberInput.length() > 0 && firstValue.length() > 0) {
                    secondValue = numberInput.getText().toString();

                    CalculateResult(btPi);
                    ClearNumberInputView();
                    ClearHistoryTextView();
                }
            }
        });
    }

    private void CheckForPi() {
        Button pi = (Button) findViewById(R.id.buttonPi);

        if (numberInput.getText() == pi.getText()) {
            numberInput.setText("");
        }
    }

    private boolean CanUseOperator() {
        return numberInput.length() > 0 && operator.length() == 0 || firstValue != "" && operator.length() == 0;
    }

    private void UpdateHistoryTextView() {
        historyTextView.setText(firstValue + operator + secondValue);
    }

    private void ClearNumberInputView() {
        numberInput.setText("");
    }

    private void ClearHistoryTextView() {
        historyTextView.setText("");
    }

    private void CalculateResult(Button btPi) {
        if (firstValue == btPi.getText()) {
            firstValue = Double.toString(Math.PI);
        }

        if (secondValue == btPi.getText()) {
            secondValue = Double.toString(Math.PI);
        }

        if (operator == "/" && Double.parseDouble(secondValue) == 0) {
            resultTextView.setText("Det går inte att dela med noll");
        } else {
            switch (operator) {
                case "/":
                    resultTextView.setText(Double.toString(Double.parseDouble(firstValue) / Double.parseDouble(secondValue)));
                    break;
                case "*":
                    resultTextView.setText(Double.toString(Double.parseDouble(firstValue) * Double.parseDouble(secondValue)));
                    break;
                case "+":
                    resultTextView.setText(Double.toString(Double.parseDouble(firstValue) + Double.parseDouble(secondValue)));
                    break;
                case "-":
                    resultTextView.setText(Double.toString(Double.parseDouble(firstValue) - Double.parseDouble(secondValue)));
                    break;
                default:
            }
        }

        ClearValues();
    }

    private void ClearValues() {
        firstValue = "";
        operator = "";
        secondValue = "";
    }
}