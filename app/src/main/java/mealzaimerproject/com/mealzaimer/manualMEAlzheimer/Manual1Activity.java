package mealzaimerproject.com.mealzaimer.manualMEAlzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;

public class Manual1Activity extends AppCompatActivity {
    protected  ImageButton telaUm;
    protected  ImageButton telaZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual1);
        telaUm=(ImageButton)findViewById(R.id.btnProxDicaUm);
        telaUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Manual2Activity.class));
            }
        });
        telaZero=(ImageButton)findViewById(R.id.btnAntUm);
        telaZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ManualActivity.class));
            }
        });
    }
}
