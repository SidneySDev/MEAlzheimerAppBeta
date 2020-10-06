package mealzaimerproject.com.mealzaimer.manualMEAlzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;

public class ManualTresActivity extends AppCompatActivity {
    protected ImageButton telaquatro;
 protected ImageButton teladois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_tres);
        telaquatro=(ImageButton)findViewById(R.id.btnProxQuatro);
                telaquatro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getApplicationContext(),ManualQuatroActivity.class));
                    }
                });
        teladois=(ImageButton)findViewById(R.id.btnAntDois);
        teladois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Manual2Activity.class));
            }
        });

    }
}
