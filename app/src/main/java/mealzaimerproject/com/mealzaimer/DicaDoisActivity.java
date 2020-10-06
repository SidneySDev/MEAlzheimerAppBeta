package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DicaDoisActivity extends AppCompatActivity {
    protected ImageButton dicatres;
    protected ImageButton dicaanterior;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dica_dois);
        dicatres=(ImageButton)findViewById(R.id.btnProxDicaTres);
        dicatres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DicaTresActivity.class));
            }
        });
        dicaanterior=(ImageButton)findViewById(R.id.btnAntUm);
        dicaanterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DicaActivity.class));
            }
        });
    }
}
