package com.pacosignes.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt0;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button btCE;
    Button btMultiply;
    Button btDivide;
    Button btSubstract;
    Button btAdd;
    Button btEquals;

    EditText etMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0= findViewById(R.id.bt0);
        bt1= findViewById(R.id.bt1);
        bt2= findViewById(R.id.bt2);
        bt3= findViewById(R.id.bt3);
        bt4= findViewById(R.id.bt4);
        bt5= findViewById(R.id.bt5);
        bt6= findViewById(R.id.bt6);
        bt7= findViewById(R.id.bt7);
        bt8= findViewById(R.id.bt8);
        bt9= findViewById(R.id.bt9);
        btCE= findViewById(R.id.btCE);
        btMultiply= findViewById(R.id.btMultiply);
        btDivide= findViewById(R.id.btDivide);
        btSubstract= findViewById(R.id.btSubstract);
        btAdd= findViewById(R.id.btAdd);
        btEquals= findViewById(R.id.btEquals);
        etMain=findViewById(R.id.etMain);
        etMain.setText("");
        setOnClickListener();
    }

    private void setOnClickListener(){
        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        btSubstract.setOnClickListener(this);
        btAdd.setOnClickListener(this);
        btEquals.setOnClickListener(this);
        btDivide.setOnClickListener(this);
        btMultiply.setOnClickListener(this);
        btCE.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id= v.getId();

        switch (id){
            case R.id.bt0:
                append("0");
                break;
            case R.id.bt1:
                append("1");
                break;
            case R.id.bt2:
                append("2");
                break;
            case R.id.bt3:
                append("3");
                break;
            case R.id.bt4:
                append("4");
                break;
            case R.id.bt5:
                append("5");
                break;
            case R.id.bt6:
                append("6");
                break;
            case R.id.bt7:
                append("7");
                break;
            case R.id.bt8:
                append("8");
                break;
            case R.id.bt9:
                append("9");
                break;
            case R.id.btAdd:
                append("+");
                break;
            case R.id.btSubstract:
                append("-");
                break;
            case R.id.btEquals:

                break;
            case R.id.btMultiply:
                break;
            case R.id.btDivide:
                break;
            case R.id.btCE:
                etMain.setText("");
                break;
        }
    }


    private void append(String s){
        etMain.getText().append(s);
    }

    private void calcula(){

    }


}
