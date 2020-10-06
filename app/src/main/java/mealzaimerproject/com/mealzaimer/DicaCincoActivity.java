package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DicaCincoActivity extends AppCompatActivity {
    protected ImageButton prox;
    protected ImageButton ant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dica_cinco);

        prox=(ImageButton)findViewById(R.id.btnUltimo);
        prox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicialActivity.class));
            }
        });
        ant=(ImageButton)findViewById(R.id.btnDicaQuatro);
        ant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DicaQuatroActivity.class));
            }
        });

    }
}
