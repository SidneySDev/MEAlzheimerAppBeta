package mealzaimerproject.com.mealzaimer.controleRemedios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import mealzaimerproject.com.mealzaimer.R;

public class MenuInicioRemedios extends AppCompatActivity {
    protected ImageButton botaoCadastrarRemedio;
    protected ImageButton botaoAlergicos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicio_remedios);
        Toast toast = Toast.makeText(getApplicationContext(), "Lista de Remédios Vazia..",Toast.LENGTH_SHORT);
        toast.show();
    botaoCadastrarRemedio=(ImageButton)findViewById(R.id.btnAddRemedioTwo);
    botaoCadastrarRemedio.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),CadastroRemediosActivity.class));
        }
    });
    botaoAlergicos=(ImageButton)findViewById(R.id.btnAlergicos);
    botaoAlergicos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),ListaAlergicosblankActivity.class));
            Toast toast = Toast.makeText(getApplicationContext(), "Lista de Remédios Vazia..",Toast.LENGTH_SHORT);
            toast.show();
        }
    });
    }

}
