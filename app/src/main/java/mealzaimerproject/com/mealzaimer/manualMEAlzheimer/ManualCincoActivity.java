package mealzaimerproject.com.mealzaimer.manualMEAlzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.ManualSeisActivity;
import mealzaimerproject.com.mealzaimer.MenuInicialActivity;
import mealzaimerproject.com.mealzaimer.R;

public class ManualCincoActivity extends AppCompatActivity {
    protected ImageButton telaseis;
    protected ImageButton telaquatro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_cinco);

        telaseis=(ImageButton)findViewById(R.id.btnProxSeis);
        telaseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicialActivity.class));
            }
        });
        telaquatro=(ImageButton)findViewById(R.id.btnAntQuatro);
        telaquatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ManualQuatroActivity.class));
            }
        });
    }
}
