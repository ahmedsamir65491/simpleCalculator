package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String show = "" ;
    String operation ="" ;
    double number1 = 0 ;
    String show2 = "" ;
    double number2 = 0 ;
    double result = 0 ;
    public void b0(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            if (!show2.equals("0")){
                show2 += "0" ;
                vie.setText(show + show2 );
            }
        }else {
            if (!show.equals("0")){
                show += "0" ;
                vie.setText(show  );
            }

        }

    }

    public void b1(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            show2 += "1" ;
            show = show + "1" ;
            vie.setText(show);
        }else {
            show += "1" ;
            vie.setText(show);
        }
    }

    public void b2(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            show2 += "2" ;
            show = show + "2" ;
            vie.setText(show);
        }else {
            show += "2" ;
            vie.setText(show);
        }
    }

    public void b3(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            show2 += "3" ;
            show = show + "3" ;
            vie.setText(show);
        }else {
            show += "3" ;
            vie.setText(show);
        }
    }

    public void b4(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            show2 += "4" ;
            show = show + "4" ;
            vie.setText(show);
        }else {
            show += "4" ;
            vie.setText(show);
        }
    }

    public void b5(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            show2 += "5" ;
            show = show + "5" ;
            vie.setText(show);
        }else {
            show += "5" ;
            vie.setText(show);
        }
    }

    public void b6(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            show2 += "6" ;
            show = show + "6" ;
            vie.setText(show);
        }else {
            show += "6" ;
            vie.setText(show);
        }
    }

    public void b7(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            show2 += "7" ;
            show = show + "7" ;
            vie.setText(show);
        }else {
            show += "7" ;
            vie.setText(show);
        }
    }

    public void b8(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            show2 += "8" ;
            show = show + "8" ;
            vie.setText(show);
        }else {
            show += "8" ;
            vie.setText(show);
        }
    }

    public void b9(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            show2 += "9" ;
            show = show + "9" ;
            vie.setText(show);
        }else {
            show += "9" ;
            vie.setText(show);
        }
    }

    public void bBlus(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            vie.setText(show);
        }else {
            number1 = Integer.parseInt(show) ;
            operation = "+" ;
            show = show +("+") ;
            vie.setText(show);
        }
    }

    public void bMinus(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            vie.setText(show);
        }else {
            number1 = Integer.parseInt(show) ;
            operation = "-" ;
            show = show +("-") ;
            vie.setText(show);
        }
    }

    public void bMultiply(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            vie.setText(show);
        }else {
            number1 = Integer.parseInt(show) ;
            operation = "*" ;
            show = show +("*") ;
            vie.setText(show);
        }
    }

    public void bDivide(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        if (operation.equals("+") ||operation.equals("-") ||operation.equals("*") ||operation.equals("/") ){
            vie.setText(show);
        }else {
            number1 = Integer.parseInt(show) ;
            operation = "/" ;
            show = show +("/") ;
            vie.setText(show);

        }
    }

    public void bEqual(View view) {
        TextView vie = (TextView) findViewById(R.id.vi) ;
        number2 = Integer.parseInt(show2) ;
        switch (operation) {
            case "+" :
                result = number1 + number2 ;
                break;
            case "-" :
                result = number1 - number2 ;
                break;
            case "*" :
                result = number1 * number2 ;
                break;
            case "/" :
                result = number1 / number2 ;
                break;
        }
        operation = "" ;
        show = String.valueOf(result) ;
        vie.setText(String.valueOf(result)); 
    }
}