package app.mathgames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class layoutend extends AppCompatActivity implements View.OnClickListener {
   TextView btnExamen1;
   TextView btnExamen2;

   
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layoutend);
        this.btnExamen1 =  findViewById(R.id.btnExamen1);
        this.btnExamen2 =  findViewById(R.id.btnExamen2);
        this.btnExamen1.setOnClickListener(this);
        this.btnExamen2.setOnClickListener(this);
    }

    public void onClick(View view) {
        if(view.getId()==R.id.btnExamen1){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }else if(view.getId()==R.id.btnExamen2){
            startActivity(new Intent(getApplicationContext(), layouttables.class));
            finish();
        }

    }
}
