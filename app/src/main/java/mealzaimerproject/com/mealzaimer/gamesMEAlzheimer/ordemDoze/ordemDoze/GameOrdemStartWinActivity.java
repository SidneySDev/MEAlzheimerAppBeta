package mealzaimerproject.com.mealzaimer.gamesMEAlzheimer.ordemDoze.ordemDoze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import mealzaimerproject.com.mealzaimer.MenuInicialActivity;
import mealzaimerproject.com.mealzaimer.R;

public class GameOrdemStartWinActivity extends AppCompatActivity {
    private ImageView botaoMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_ordem_start_win);
        botaoMenu=(ImageView)findViewById(R.id.btnMenu);
        botaoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicialActivity.class));
            }
        });
    }
}
