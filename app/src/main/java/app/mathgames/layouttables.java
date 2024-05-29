package app.mathgames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class layouttables extends AppCompatActivity implements View.OnClickListener {
    TextView btn1Home;
    TextView btn2Home;
    TextView btn3Home;
    TextView btn4Home;


    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layouttables);
        this.btn1Home =  findViewById(R.id.btn1Home);
        this.btn2Home =  findViewById(R.id.btn2Home);
        this.btn3Home =  findViewById(R.id.btn3Home);
        this.btn4Home =  findViewById(R.id.btn4Home);
        this.btn1Home.setOnClickListener(this);
        this.btn2Home.setOnClickListener(this);
        this.btn3Home.setOnClickListener(this);
        this.btn4Home.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btn1Home) {
            startActivity(new Intent(getApplicationContext(), layoutmultiplicationtables.class));

        } else if (view.getId() == R.id.btn2Home) {
            startActivity(new Intent(getApplicationContext(), layoutdivisiontables.class));

        } else if (view.getId() == R.id.btn3Home) {
            startActivity(new Intent(getApplicationContext(), layoutadditiontables.class));

        } else if (view.getId() == R.id.btn4Home) {
            startActivity(new Intent(getApplicationContext(), layoutsubtractiontables.class));

        } else if (view.getId() == R.id.btn1Tablas) {
        } else if (view.getId() == R.id.btn2Tablas) {
        } else if (view.getId() == R.id.btn3Tablas) {
        }

    }
}
