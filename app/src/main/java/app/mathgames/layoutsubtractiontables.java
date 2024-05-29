package app.mathgames;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class layoutsubtractiontables extends AppCompatActivity {
   
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layoutsubtractiontables);
       
        TextView button =  findViewById(R.id.btn1Tablas);
        TextView button2 =  findViewById(R.id.btn2Tablas);
        TextView button3 =  findViewById(R.id.btn3Tablas);
        TextView button4 =  findViewById(R.id.btn4Tablas);
        TextView button5 =  findViewById(R.id.btn5Tablas);
        TextView button6 =  findViewById(R.id.btn6Tablas);
        TextView button7 =  findViewById(R.id.btn7Tablas);
        TextView button8 =  findViewById(R.id.btn8Tablas);
        TextView button9 =  findViewById(R.id.btn9Tablas);
        TextView button10 =  findViewById(R.id.btn10Tablas);
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
                textView.setText("1 – 1 = 0");
                textView2.setText("2 – 1 = 1");
                textView3.setText("3 – 1 = 2");
                textView4.setText("4 – 1 = 3");
                textView5.setText("5 – 1 = 4");
                textView6.setText("6 – 1 = 5");
                textView7.setText("7 – 1 = 6");
                textView8.setText("8 – 1 = 7");
                textView9.setText("9 – 1 = 8");
                textView10.setText("10 – 1 = 9");
                textView11.setText("11 – 1 = 10");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("2 – 2 = 0");
                textView2.setText("3 – 2 = 1");
                textView3.setText("4 – 2 = 2");
                textView4.setText("5 – 2 = 3");
                textView5.setText("6 – 2 = 4");
                textView6.setText("7 – 2 = 5");
                textView7.setText("8 – 2 = 6");
                textView8.setText("9 – 2 = 7");
                textView9.setText("10 – 2 = 8");
                textView10.setText("11 – 2 = 9");
                textView11.setText("12 – 2 = 10");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("3 – 3 = 0");
                textView2.setText("4 – 3 = 1");
                textView3.setText("5 – 3 = 2");
                textView4.setText("6 – 3 = 3");
                textView5.setText("7 – 3 = 4");
                textView6.setText("8 – 3 = 5");
                textView7.setText("9 – 3 = 6");
                textView8.setText("10 – 3 = 7");
                textView9.setText("11 – 3 = 8");
                textView10.setText("12 – 3 = 9");
                textView11.setText("13 – 3 = 10");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("4 – 4 = 0");
                textView2.setText("5 – 4 = 1");
                textView3.setText("6 – 4 = 2");
                textView4.setText("7 – 4 = 3");
                textView5.setText("8 – 4 = 4");
                textView6.setText("9 – 4 = 5");
                textView7.setText("10 – 4 = 6");
                textView8.setText("11 – 4 = 7");
                textView9.setText("12 – 4 = 8");
                textView10.setText("13 – 4 = 9");
                textView11.setText("14 – 4 = 10");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("5 – 5 = 0");
                textView2.setText("6 – 5 = 1");
                textView3.setText("7 – 5 = 2");
                textView4.setText("8 – 5 = 3");
                textView5.setText("9 – 5 = 4");
                textView6.setText("10 – 5 = 5");
                textView7.setText("11 – 5 = 6");
                textView8.setText("12 – 5 = 7");
                textView9.setText("13 – 5 = 8");
                textView10.setText("14 – 5 = 9");
                textView11.setText("15 – 5 = 10");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("6 – 6 = 0");
                textView2.setText("7 – 6 = 1");
                textView3.setText("8 – 6 = 2");
                textView4.setText("9 – 6 = 3");
                textView5.setText("10 – 6 = 4");
                textView6.setText("11 – 6 = 5");
                textView7.setText("12 – 6 = 6");
                textView8.setText("13 – 6 = 7");
                textView9.setText("14 – 6 = 8");
                textView10.setText("15 – 6 = 9");
                textView11.setText("16 – 6 = 10");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("7 – 7 = 0");
                textView2.setText("8 – 7 = 1");
                textView3.setText("9 – 7 = 2");
                textView4.setText("10 – 7 = 3");
                textView5.setText("11 – 7 = 4");
                textView6.setText("12 – 7 = 5");
                textView7.setText("13 – 7 = 6");
                textView8.setText("14 – 7 = 7");
                textView9.setText("15 – 7 = 8");
                textView10.setText("16 – 7 = 9");
                textView11.setText("17 – 7 = 10");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("8 – 8 = 0");
                textView2.setText("9 – 8 = 1");
                textView3.setText("10 – 8 = 2");
                textView4.setText("11 – 8 = 3");
                textView5.setText("12 – 8 = 4");
                textView6.setText("13 – 8 = 5");
                textView7.setText("14 – 8 = 6");
                textView8.setText("15 – 8 = 7");
                textView9.setText("16 – 8 = 8");
                textView10.setText("17 – 8 = 9");
                textView11.setText("18 – 8 = 10");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("9 – 9 = 0");
                textView2.setText("10 – 9 = 1");
                textView3.setText("11 – 9 = 2");
                textView4.setText("12 – 9 = 3");
                textView5.setText("13 – 9 = 4");
                textView6.setText("14 – 9 = 5");
                textView7.setText("15 – 9 = 6");
                textView8.setText("16 – 9 = 7");
                textView9.setText("17 – 9 = 8");
                textView10.setText("18 – 9 = 9");
                textView11.setText("19 – 9 = 10");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("10 – 10 = 0");
                textView2.setText("11 – 10 = 1");
                textView3.setText("12 – 10 = 2");
                textView4.setText("13 – 10 = 3");
                textView5.setText("14 – 10 = 4");
                textView6.setText("15 – 10 = 5");
                textView7.setText("16 – 10 = 6");
                textView8.setText("17 – 10 = 7");
                textView9.setText("18 – 10 = 8");
                textView10.setText("19 – 10 = 9");
                textView11.setText("20 – 10 = 10");
            }
        });
    }
}
