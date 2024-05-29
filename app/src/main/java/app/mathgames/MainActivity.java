package app.mathgames;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView btn1Home;
    TextView btn2Home;
    TextView btn3Home;
    TextView btn4Home;
    TextView btn5Home;
    TextView btn6Home;

   
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        checkFirstRun();
        this.btn1Home =  findViewById(R.id.btn1Home);
        this.btn2Home =  findViewById(R.id.btn2Home);
        this.btn3Home =  findViewById(R.id.btn3Home);
        this.btn4Home =  findViewById(R.id.btn4Home);
        this.btn5Home =  findViewById(R.id.btn5Home);
        this.btn6Home =  findViewById(R.id.btn6Home);
        this.btn1Home.setOnClickListener(this);
        this.btn2Home.setOnClickListener(this);
        this.btn3Home.setOnClickListener(this);
        this.btn4Home.setOnClickListener(this);
        this.btn5Home.setOnClickListener(this);
        this.btn6Home.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId()==R.id.btn1Home){
            startActivity(new Intent(getApplicationContext(), layoutmath.class));
        }else if (view.getId()==R.id.btn2Home){
            startActivity(new Intent(getApplicationContext(), layoutmultiplication.class));
        }else if (view.getId()==R.id.btn3Home){
            startActivity(new Intent(getApplicationContext(), layoutdivision.class));
        }else if (view.getId()==R.id.btn4Home){
            startActivity(new Intent(getApplicationContext(), layoutaddition.class));
        }else if (view.getId()==R.id.btn5Home){
            startActivity(new Intent(getApplicationContext(), layoutsubtraction.class));
        }else if (view.getId()==R.id.btn6Home){
            startActivity(new Intent(getApplicationContext(), layouttables.class));

        }else if (view.getId()==R.id.btn1Tablas){
        }else if (view.getId()==R.id.btn2Tablas){
        }else if (view.getId()==R.id.btn3Tablas){
        }else if (view.getId()==R.id.btn4Tablas){
        }else if (view.getId()==R.id.btn5Tablas){
        }

    }

    public void checkFirstRun() {
        if (getSharedPreferences("PREFERENCE", 0).getBoolean("isFirstRun", true)) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.euNotice);
            builder.setMessage(R.string.textnotice);
            builder.setPositiveButton(R.string.vale, new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.this.getSharedPreferences("PREFERENCE", 0).edit().putBoolean("isFirstRun", false).apply();
                }
            });
            builder.setNegativeButton(R.string.moreInfo, new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.this.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("https://aplity.com/politica-privacidad-matematicas/")));
                    builder.show();
                }
            });
            builder.show();
        }
    }
}
