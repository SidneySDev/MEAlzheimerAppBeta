package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DicaTresActivity extends AppCompatActivity {
    protected ImageButton prox;
    protected ImageButton voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dica_tres);
        prox=(ImageButton)findViewById(R.id.btnProxQuatro);
        voltar=(ImageButton)findViewById(R.id.btnAntDois);
        prox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DicaQuatroActivity.class));
            }
        });
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DicaDoisActivity.class));
            }
        });
    }
}
