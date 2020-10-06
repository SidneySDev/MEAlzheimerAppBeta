package mealzaimerproject.com.mealzaimer.manualMEAlzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;

public class ManualQuatroActivity extends AppCompatActivity {
    protected ImageButton telacinco;
    protected ImageButton telatres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_quatro);
        telacinco=(ImageButton)findViewById(R.id.btnProxCinco);
        telacinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ManualCincoActivity.class));
            }
        });
        telatres=(ImageButton)findViewById(R.id.btnAntUm);
        telatres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ManualTresActivity.class));
            }
        });
    }
}
