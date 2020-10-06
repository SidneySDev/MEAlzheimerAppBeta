package mealzaimerproject.com.mealzaimer.manualMEAlzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;

public class Manual2Activity extends AppCompatActivity {
    protected ImageButton telaTres;
    protected ImageButton telaUm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual2);
        telaTres=(ImageButton)findViewById(R.id.btnProxTres);
        telaTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),ManualTresActivity.class));
            }
        });

        telaUm=(ImageButton)findViewById(R.id.btnAntUm);

        telaUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Manual1Activity.class));
            }
        });
    }
}
