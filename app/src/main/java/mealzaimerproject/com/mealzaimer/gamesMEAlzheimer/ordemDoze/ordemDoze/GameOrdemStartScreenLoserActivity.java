package mealzaimerproject.com.mealzaimer.gamesMEAlzheimer.ordemDoze.ordemDoze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.MenuInicialActivity;
import mealzaimerproject.com.mealzaimer.R;

public class GameOrdemStartScreenLoserActivity extends AppCompatActivity {
    protected ImageButton botaoTentarNovamente;
    protected ImageButton botaoMenuPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_ordem_start_screen_loser);
        botaoTentarNovamente=(ImageButton)findViewById(R.id.btnTentarNovamente);
        botaoMenuPrincipal=(ImageButton)findViewById(R.id.btnMenuPrincipal);
        botaoTentarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),GameOrdemStartActivity.class));
            }
        });
        botaoMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicialActivity.class));
            }
        });
    }
}
