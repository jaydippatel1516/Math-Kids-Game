package app.mathgames;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class layoutadditiontables extends AppCompatActivity {
   
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layoutadditiontables);

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
                textView.setText("1 + 0 = 1");
                textView2.setText("1 + 1 = 2");
                textView3.setText("1 + 2 = 3");
                textView4.setText("1 + 3 = 4");
                textView5.setText("1 + 4 = 5");
                textView6.setText("1 + 5 = 6");
                textView7.setText("1 + 6 = 7");
                textView8.setText("1 + 7 = 8");
                textView9.setText("1 + 8 = 9");
                textView10.setText("1 + 9 = 10");
                textView11.setText("1 + 10 = 11");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("2 + 0 = 2");
                textView2.setText("2 + 1 = 3");
                textView3.setText("2 + 2 = 4");
                textView4.setText("2 + 3 = 5");
                textView5.setText("2 + 4 = 6");
                textView6.setText("2 + 5 = 7");
                textView7.setText("2 + 6 = 8");
                textView8.setText("2 + 7 = 9");
                textView9.setText("2 + 8 = 10");
                textView10.setText("2 + 9 = 11");
                textView11.setText("2 + 10 = 12");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("3 + 0 = 3");
                textView2.setText("3 + 1 = 4");
                textView3.setText("3 + 2 = 5");
                textView4.setText("3 + 3 = 6");
                textView5.setText("3 + 4 = 7");
                textView6.setText("3 + 5 = 8");
                textView7.setText("3 + 6 = 9");
                textView8.setText("3 + 7 = 10");
                textView9.setText("3 + 8 = 11");
                textView10.setText("3 + 9 = 12");
                textView11.setText("3 + 10 = 13");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("4 + 0 = 4");
                textView2.setText("4 + 1 = 5");
                textView3.setText("4 + 2 = 6");
                textView4.setText("4 + 3 = 7");
                textView5.setText("4 + 4 = 8");
                textView6.setText("4 + 5 = 9");
                textView7.setText("4 + 6 = 10");
                textView8.setText("4 + 7 = 11");
                textView9.setText("4 + 8 = 12");
                textView10.setText("4 + 9 = 13");
                textView11.setText("4 + 10 = 14");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("5 + 0 = 5");
                textView2.setText("5 + 1 = 6");
                textView3.setText("5 + 2 = 7");
                textView4.setText("5 + 3 = 8");
                textView5.setText("5 + 4 = 9");
                textView6.setText("5 + 5 = 10");
                textView7.setText("5 + 6 = 11");
                textView8.setText("5 + 7 = 12");
                textView9.setText("5 + 8 = 13");
                textView10.setText("5 + 9 = 14");
                textView11.setText("5 + 10 = 15");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("6 + 0 = 6");
                textView2.setText("6 + 1 = 7");
                textView3.setText("6 + 2 = 8");
                textView4.setText("6 + 3 = 9");
                textView5.setText("6 + 4 = 10");
                textView6.setText("6 + 5 = 11");
                textView7.setText("6 + 6 = 12");
                textView8.setText("6 + 7 = 13");
                textView9.setText("6 + 8 = 14");
                textView10.setText("6 + 9 = 15");
                textView11.setText("6 + 10 = 16");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("7 + 0 = 7");
                textView2.setText("7 + 1 = 8");
                textView3.setText("7 + 2 = 9");
                textView4.setText("7 + 3 = 10");
                textView5.setText("7 + 4 = 11");
                textView6.setText("7 + 5 = 12");
                textView7.setText("7 + 6 = 13");
                textView8.setText("7 + 7 = 14");
                textView9.setText("7 + 8 = 15");
                textView10.setText("7 + 9 = 16");
                textView11.setText("7 + 10 = 17");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("8 + 0 = 8");
                textView2.setText("8 + 1 = 9");
                textView3.setText("8 + 2 = 10");
                textView4.setText("8 + 3 = 11");
                textView5.setText("8 + 4 = 12");
                textView6.setText("8 + 5 = 13");
                textView7.setText("8 + 6 = 14");
                textView8.setText("8 + 7 = 15");
                textView9.setText("8 + 8 = 16");
                textView10.setText("8 + 9 = 17");
                textView11.setText("8 + 10 = 18");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("9 + 0 = 9");
                textView2.setText("9 + 1 = 10");
                textView3.setText("9 + 2 = 11");
                textView4.setText("9 + 3 = 12");
                textView5.setText("9 + 4 = 13");
                textView6.setText("9 + 5 = 14");
                textView7.setText("9 + 6 = 15");
                textView8.setText("9 + 7 = 16");
                textView9.setText("9 + 8 = 17");
                textView10.setText("9 + 9 = 18");
                textView11.setText("9 + 10 = 19");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("10 + 0 = 10");
                textView2.setText("10 + 1 = 11");
                textView3.setText("10 + 2 = 12");
                textView4.setText("10 + 3 = 13");
                textView5.setText("10 + 4 = 14");
                textView6.setText("10 + 5 = 15");
                textView7.setText("10 + 6 = 16");
                textView8.setText("10 + 7 = 17");
                textView9.setText("10 + 8 = 18");
                textView10.setText("10 + 9 = 19");
                textView11.setText("10 + 10 = 20");
            }
        });
    }
}
