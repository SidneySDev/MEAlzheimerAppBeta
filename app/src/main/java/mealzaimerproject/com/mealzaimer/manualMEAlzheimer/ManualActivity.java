package mealzaimerproject.com.mealzaimer.manualMEAlzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;

public class ManualActivity extends AppCompatActivity {
    protected ImageButton proximatela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        proximatela=(ImageButton)findViewById(R.id.btnProxDicaUm);
        proximatela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Manual1Activity.class));
            }
        });
    }
}
