package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DicaQuatroActivity extends AppCompatActivity {
    protected ImageButton proxQuatro;
    protected ImageButton antTres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dica_quatro);

        proxQuatro=(ImageButton)findViewById(R.id.btnDicaCinco);
        proxQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DicaCincoActivity.class));
            }
        });
        antTres=(ImageButton)findViewById(R.id.btnAntUm);
        antTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DicaTresActivity.class));
            }
        });
    }
}
