package mealzaimerproject.com.mealzaimer.anotacoesMEAlzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import mealzaimerproject.com.mealzaimer.R;

public class InicioAnotacoesActivity extends AppCompatActivity {
    protected ImageButton novaTarefa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_anotacoes);
        Toast toast = Toast.makeText(getApplicationContext(), "Não há anotações.",Toast.LENGTH_SHORT);
        toast.show();
        novaTarefa=(ImageButton)findViewById(R.id.btnNovaAnotacao);
        novaTarefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NovaAnotacaoActivity.class));

            }
        });
    }
}
