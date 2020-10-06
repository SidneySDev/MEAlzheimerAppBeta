package mealzaimerproject.com.mealzaimer.gamesMEAlzheimer.ordemDoze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.R;
import mealzaimerproject.com.mealzaimer.gamesMEAlzheimer.ordemDoze.ordemDoze.GameOrdemStartActivity;


public class GamesActivity extends AppCompatActivity {
    protected ImageButton botaoJogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        botaoJogo=(ImageButton) findViewById(R.id.ordemStart);

        botaoJogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),GameOrdemStartActivity.class));
            }
        });


    }
}
