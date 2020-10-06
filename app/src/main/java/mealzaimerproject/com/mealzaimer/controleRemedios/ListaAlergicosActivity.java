package mealzaimerproject.com.mealzaimer.controleRemedios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import mealzaimerproject.com.mealzaimer.R;

public class ListaAlergicosActivity extends AppCompatActivity {
    protected TextView alergicoum;
    protected ImageButton apagar;
    protected  ImageButton salvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alergicos);
        Toast toast = Toast.makeText(getApplicationContext(), "Lista de Remédios Alergicos Atualizado..",Toast.LENGTH_SHORT);
        toast.show();
        alergicoum=findViewById(R.id.alergicoUm);
        apagar=(ImageButton)findViewById(R.id.btnExcluirAlergico);
        apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alergicoum.setVisibility(View.INVISIBLE);
                apagar.setVisibility(View.INVISIBLE);
                Toast toast = Toast.makeText(getApplicationContext(), "Alérgico Excluido.\n   Lista Vazia.",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        salvar=(ImageButton)findViewById(R.id.ed);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicioRemediosTwoActivity.class));
            }
        });
    }
}
