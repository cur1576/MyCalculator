package com.example.mycalculator;

import android.drm.DrmStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnNumber0;
    Button btnNumber1;
    Button btnNumber2;
    Button btnNumber3;
    Button btnNumber4;
    Button btnNumber5;
    Button btnNumber6;
    Button btnNumber7;
    Button btnNumber8;
    Button btnNumber9;

    TextView txtResult;

    EditText editInput;

    Button btnCE;
    Button btnC;
    Button btnDelete;

    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;

    Button btnDot;
    Button btnResult;

    double val1=Double.NaN;
    double val2;
    String ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNumber0 = findViewById(R.id.btnNumber0);
        btnNumber1 = findViewById(R.id.btnNumber1);
        btnNumber2 = findViewById(R.id.btnNumber2);
        btnNumber3 = findViewById(R.id.btnNumber3);
        btnNumber4 = findViewById(R.id.btnNumber4);
        btnNumber5 = findViewById(R.id.btnNumber5);
        btnNumber6 = findViewById(R.id.btnNumber6);
        btnNumber7 = findViewById(R.id.btnNumber7);
        btnNumber8 = findViewById(R.id.btnNumber8);
        btnNumber9 = findViewById(R.id.btnNumber9);

        txtResult = findViewById(R.id.txtResult);

        editInput = findViewById(R.id.editInput);

        btnCE = findViewById(R.id.btnCE);
        btnC = findViewById(R.id.btnC);
        btnDelete = findViewById(R.id.btnDelete);

        btnAdd = findViewById(R.id.btnNumberAdd);
        btnSub = findViewById(R.id.btnNumberSub);
        btnMul = findViewById(R.id.btnNumberMul);
        btnDiv = findViewById(R.id.btnNumberDiv);

        btnDot = findViewById(R.id.btnDot);
        btnResult = findViewById(R.id.btnResult);

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(null);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.NaN;
                txtResult.setText(null);
                editInput.setText(null);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = editInput.getText().toString();
                if(number != null && number.length() > 0){
                    number = number.substring(0, number.length() - 1);
                }
                editInput.setText(number);
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ACTION = "+";
                if(!Double.isNaN(val1)){
                    val2 = Double.parseDouble(editInput.getText().toString());
                    val1 = val1 + val2;
                }else {
                    val1 = Double.parseDouble(editInput.getText().toString());
                }

                txtResult.setText(val1 + " + ");
                editInput.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 ACTION = "-";
                 if(!Double.isNaN(val1)){
                     val2 = Double.parseDouble(editInput.getText().toString());
                     val1 = val1 - val2;
                 }else {
                     val1 = Double.parseDouble(editInput.getText().toString());
                 }

                 txtResult.setText(val1 + " - ");
                 editInput.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ACTION = "*";
                if(!Double.isNaN(val1)){
                    val2 = Double.parseDouble(editInput.getText().toString());
                    val1 = val1 * val2;
                }else{
                    val1 = Double.parseDouble(editInput.getText().toString());
                }

                txtResult.setText(val1 + " * ");
                editInput.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ACTION = "/";
                if(!Double.isNaN(val1)){
                    val2 = Double.parseDouble(editInput.getText().toString());
                    val1 = val1/val2;
                }else{
                    val1 = Double.parseDouble(editInput.getText().toString());
                }

                txtResult.setText(val1 + " / ");
                editInput.setText(null);
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ACTION != null && ACTION.equals("+")){
                    double result = val1 + Double.parseDouble(editInput.getText().toString());
                    txtResult.setText(null);
                    editInput.setText(String.valueOf(result));
                } else if(ACTION != null && ACTION.equals("-")){
                    double result = val1 - Double.parseDouble(editInput.getText().toString());
                    txtResult.setText(null);
                    editInput.setText(String.valueOf(result));
                } else if(ACTION != null && ACTION.equals("*")){
                    double result = val1 * Double.parseDouble(editInput.getText().toString());
                    txtResult.setText(null);
                    editInput.setText(String.valueOf(result));
                } else if(ACTION != null && ACTION.equals("/")){
                    double result = val1 / Double.parseDouble(editInput.getText().toString());
                    txtResult.setText(null);
                    editInput.setText(String.valueOf(result));
                }

                ACTION = null;
                val1 = Double.NaN;
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "0");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "1");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "2");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "3");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "4");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "5");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "6");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "7");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "8");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "9");
                editInput.setSelection(editInput.getText().length());
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + ".");
                editInput.setSelection(editInput.getText().length());
            }
        });
    }
}
