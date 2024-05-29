package app.mathgames;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class layoutmultiplicationtables extends AppCompatActivity {
   
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layoutmultiplicationtables);
       
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
        final TextView textView = (TextView) findViewById(R.id.x1);
        final TextView textView2 = (TextView) findViewById(R.id.x2);
        final TextView textView3 = (TextView) findViewById(R.id.x3);
        final TextView textView4 = (TextView) findViewById(R.id.x4);
        final TextView textView5 = (TextView) findViewById(R.id.x5);
        final TextView textView6 = (TextView) findViewById(R.id.x6);
        final TextView textView7 = (TextView) findViewById(R.id.x7);
        final TextView textView8 = (TextView) findViewById(R.id.x8);
        final TextView textView9 = (TextView) findViewById(R.id.x9);
        final TextView textView10 = (TextView) findViewById(R.id.x10);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("1 x 1 = 1");
                textView2.setText("1 x 2 = 2");
                textView3.setText("1 x 3 = 3");
                textView4.setText("1 x 4 = 4");
                textView5.setText("1 x 5 = 5");
                textView6.setText("1 x 6 = 6");
                textView7.setText("1 x 7 = 7");
                textView8.setText("1 x 8 = 8");
                textView9.setText("1 x 9 = 9");
                textView10.setText("1 x 10 = 10");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("2 x 1 = 2");
                textView2.setText("2 x 2 = 4");
                textView3.setText("2 x 3 = 6");
                textView4.setText("2 x 4 = 8");
                textView5.setText("2 x 5 = 10");
                textView6.setText("2 x 6 = 12");
                textView7.setText("2 x 7 = 14");
                textView8.setText("2 x 8 = 16");
                textView9.setText("2 x 9 = 18");
                textView10.setText("2 x 10 = 20");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("3 x 1 = 3");
                textView2.setText("3 x 2 = 6");
                textView3.setText("3 x 3 = 9");
                textView4.setText("3 x 4 = 12");
                textView5.setText("3 x 5 = 15");
                textView6.setText("3 x 6 = 18");
                textView7.setText("3 x 7 = 21");
                textView8.setText("3 x 8 = 24");
                textView9.setText("3 x 9 = 27");
                textView10.setText("3 x 10 = 30");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("4 x 1 = 4");
                textView2.setText("4 x 2 = 8");
                textView3.setText("4 x 3 = 12");
                textView4.setText("4 x 4 = 16");
                textView5.setText("4 x 5 = 20");
                textView6.setText("4 x 6 = 24");
                textView7.setText("4 x 7 = 28");
                textView8.setText("4 x 8 = 32");
                textView9.setText("4 x 9 = 36");
                textView10.setText("4 x 10 = 40");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("5 x 1 = 5");
                textView2.setText("5 x 2 = 10");
                textView3.setText("5 x 3 = 15");
                textView4.setText("5 x 4 = 20");
                textView5.setText("5 x 5 = 25");
                textView6.setText("5 x 6 = 30");
                textView7.setText("5 x 7 = 35");
                textView8.setText("5 x 8 = 40");
                textView9.setText("5 x 9 = 45");
                textView10.setText("5 x 10 = 50");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("6 x 1 = 6");
                textView2.setText("6 x 2 = 12");
                textView3.setText("6 x 3 = 18");
                textView4.setText("6 x 4 = 24");
                textView5.setText("6 x 5 = 30");
                textView6.setText("6 x 6 = 36");
                textView7.setText("6 x 7 = 42");
                textView8.setText("6 x 8 = 48");
                textView9.setText("6 x 9 = 54");
                textView10.setText("6 x 10 = 60");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("7 x 1 = 7");
                textView2.setText("7 x 2 = 14");
                textView3.setText("7 x 3 = 21");
                textView4.setText("7 x 4 = 28");
                textView5.setText("7 x 5 = 35");
                textView6.setText("7 x 6 = 42");
                textView7.setText("7 x 7 = 49");
                textView8.setText("7 x 8 = 56");
                textView9.setText("7 x 9 = 63");
                textView10.setText("7 x 10 = 70");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("8 x 1 = 8");
                textView2.setText("8 x 2 = 16");
                textView3.setText("8 x 3 = 24");
                textView4.setText("8 x 4 = 32");
                textView5.setText("8 x 5 = 40");
                textView6.setText("8 x 6 = 48");
                textView7.setText("8 x 7 = 56");
                textView8.setText("8 x 8 = 64");
                textView9.setText("8 x 9 = 72");
                textView10.setText("8 x 10 = 80");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("9 x 1 = 9");
                textView2.setText("9 x 2 = 18");
                textView3.setText("9 x 3 = 27");
                textView4.setText("9 x 4 = 36");
                textView5.setText("9 x 5 = 45");
                textView6.setText("9 x 6 = 54");
                textView7.setText("9 x 7 = 63");
                textView8.setText("9 x 8 = 72");
                textView9.setText("9 x 9 = 81");
                textView10.setText("9 x 10 = 90");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("10 x 1 = 10");
                textView2.setText("10 x 2 = 20");
                textView3.setText("10 x 3 = 30");
                textView4.setText("10 x 4 = 40");
                textView5.setText("10 x 5 = 50");
                textView6.setText("10 x 6 = 60");
                textView7.setText("10 x 7 = 70");
                textView8.setText("10 x 8 = 80");
                textView9.setText("10 x 9 = 90");
                textView10.setText("10 x 10 = 100");
            }
        });
    }
}
