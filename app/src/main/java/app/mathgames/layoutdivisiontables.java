package app.mathgames;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class layoutdivisiontables extends AppCompatActivity {
   
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layoutdivisiontables);
       
        Button button =  findViewById(R.id.btn1Tablas);
        Button button2 =  findViewById(R.id.btn2Tablas);
        Button button3 =  findViewById(R.id.btn3Tablas);
        Button button4 =  findViewById(R.id.btn4Tablas);
        Button button5 =  findViewById(R.id.btn5Tablas);
        Button button6 =  findViewById(R.id.btn6Tablas);
        Button button7 =  findViewById(R.id.btn7Tablas);
        Button button8 =  findViewById(R.id.btn8Tablas);
        Button button9 =  findViewById(R.id.btn9Tablas);
        Button button10 =  findViewById(R.id.btn10Tablas);
        final TextView textView = (TextView) findViewById(R.id.x0);
        final TextView textView2 = (TextView) findViewById(R.id.x1);
        final TextView textView3 = (TextView) findViewById(R.id.x2);
        final TextView textView4 = (TextView) findViewById(R.id.x3);
        final TextView textView5 = (TextView) findViewById(R.id.x4);
        final TextView textView6 = (TextView) findViewById(R.id.x5);
        final TextView textView7 = (TextView) findViewById(R.id.x6);
        final TextView textView8 = (TextView) findViewById(R.id.x7);
        final TextView textView9 = (TextView) findViewById(R.id.x8);
        final TextView textView10 = (TextView) findViewById(R.id.x9);
        final TextView textView11 = (TextView) findViewById(R.id.x10);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 1 = 0");
                textView2.setText("1 ÷ 1 = 1");
                textView3.setText("2 ÷ 1 = 2");
                textView4.setText("3 ÷ 1 = 3");
                textView5.setText("4 ÷ 1 = 4");
                textView6.setText("5 ÷ 1 = 5");
                textView7.setText("6 ÷ 1 = 6");
                textView8.setText("7 ÷ 1 = 7");
                textView9.setText("8 ÷ 1 = 8");
                textView10.setText("9 ÷ 1 = 9");
                textView11.setText("10 ÷ 1 = 10");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 2 = 0");
                textView2.setText("2 ÷ 2 = 1");
                textView3.setText("4 ÷ 2 = 2");
                textView4.setText("6 ÷ 2 = 3");
                textView5.setText("8 ÷ 2 = 4");
                textView6.setText("10 ÷ 2 = 5");
                textView7.setText("12 ÷ 2 = 6");
                textView8.setText("14 ÷ 2 = 7");
                textView9.setText("16 ÷ 2 = 8");
                textView10.setText("18 ÷ 2 = 9");
                textView11.setText("20 ÷ 2 = 10");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 3 = 0");
                textView2.setText("3 ÷ 3 = 1");
                textView3.setText("6 ÷ 3 = 2");
                textView4.setText("9 ÷ 3 = 3");
                textView5.setText("12 ÷ 3 = 4");
                textView6.setText("15 ÷ 3 = 5");
                textView7.setText("18 ÷ 3 = 6");
                textView8.setText("21 ÷ 3 = 7");
                textView9.setText("24 ÷ 3 = 8");
                textView10.setText("27 ÷ 3 = 9");
                textView11.setText("30 ÷ 3 = 10");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 4 = 0");
                textView2.setText("4 ÷ 4 = 1");
                textView3.setText("8 ÷ 4 = 2");
                textView4.setText("12 ÷ 4 = 3");
                textView5.setText("16 ÷ 4 = 4");
                textView6.setText("20 ÷ 4 = 5");
                textView7.setText("24 ÷ 4 = 6");
                textView8.setText("28 ÷ 4 = 7");
                textView9.setText("32 ÷ 4 = 8");
                textView10.setText("36 ÷ 4 = 9");
                textView11.setText("40 ÷ 4 = 10");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 5 = 0");
                textView2.setText("5 ÷ 5 = 1");
                textView3.setText("10 ÷ 5 = 2");
                textView4.setText("15 ÷ 5 = 3");
                textView5.setText("20 ÷ 5 = 4");
                textView6.setText("25 ÷ 5 = 5");
                textView7.setText("30 ÷ 5 = 6");
                textView8.setText("35 ÷ 5 = 7");
                textView9.setText("40 ÷ 5 = 8");
                textView10.setText("45 ÷ 5 = 9");
                textView11.setText("50 ÷ 5 = 10");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 6 = 0");
                textView2.setText("6 ÷ 6 = 1");
                textView3.setText("12 ÷ 6 = 2");
                textView4.setText("18 ÷ 6 = 3");
                textView5.setText("24 ÷ 6 = 4");
                textView6.setText("30 ÷ 6 = 5");
                textView7.setText("36 ÷ 6 = 6");
                textView8.setText("42 ÷ 6 = 7");
                textView9.setText("48 ÷ 6 = 8");
                textView10.setText("54 ÷ 6 = 9");
                textView11.setText("60 ÷ 6 = 10");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 7 = 0");
                textView2.setText("7 ÷ 7 = 1");
                textView3.setText("14 ÷ 7 = 2");
                textView4.setText("21 ÷ 7 = 3");
                textView5.setText("28 ÷ 7 = 4");
                textView6.setText("35 ÷ 7 = 5");
                textView7.setText("42 ÷ 7 = 6");
                textView8.setText("49 ÷ 7 = 7");
                textView9.setText("56 ÷ 7 = 8");
                textView10.setText("63 ÷ 7 = 9");
                textView11.setText("70 ÷ 7 = 10");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 8 = 0");
                textView2.setText("8 ÷ 8 = 1");
                textView3.setText("16 ÷ 8 = 2");
                textView4.setText("24 ÷ 8 = 3");
                textView5.setText("32 ÷ 8 = 4");
                textView6.setText("40 ÷ 8 = 5");
                textView7.setText("48 ÷ 8 = 6");
                textView8.setText("56 ÷ 8 = 7");
                textView9.setText("64 ÷ 8 = 8");
                textView10.setText("72 ÷ 8 = 9");
                textView11.setText("80 ÷ 8 = 10");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 9 = 0");
                textView2.setText("9 ÷ 9 = 1");
                textView3.setText("18 ÷ 9 = 2");
                textView4.setText("27 ÷ 9 = 3");
                textView5.setText("36 ÷ 9 = 4");
                textView6.setText("45 ÷ 9 = 5");
                textView7.setText("54 ÷ 9 = 6");
                textView8.setText("63 ÷ 9 = 7");
                textView9.setText("72 ÷ 9 = 8");
                textView10.setText("81 ÷ 9 = 9");
                textView11.setText("90 ÷ 9 = 10");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("0 ÷ 10 = 0");
                textView2.setText("10 ÷ 10 = 1");
                textView3.setText("20 ÷ 10 = 2");
                textView4.setText("30 ÷ 10 = 3");
                textView5.setText("40 ÷ 10 = 4");
                textView6.setText("50 ÷ 10 = 5");
                textView7.setText("60 ÷ 10 = 6");
                textView8.setText("70 ÷ 10 = 7");
                textView9.setText("80 ÷ 10 = 8");
                textView10.setText("90 ÷ 10 = 9");
                textView11.setText("100 ÷ 10 = 10");
            }
        });
    }
}
