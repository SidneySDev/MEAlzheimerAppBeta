package mealzaimerproject.com.mealzaimer.controleRemedios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.net.ProtocolException;

import mealzaimerproject.com.mealzaimer.CadastroRemedioAlergicoActivity;
import mealzaimerproject.com.mealzaimer.MenuInicialActivity;
import mealzaimerproject.com.mealzaimer.R;

public class MenuInicioRemediosTwoActivity extends AppCompatActivity {
   protected ImageButton novoRemedio;
   protected ImageButton alergico;
    /////remedio um
    protected TextView remedioUm;
    protected TextView nomealertaUm;
    protected Switch switchUm;
    protected ImageButton apagarUm;
    //////

    /////remedio dois
    protected TextView remedioDois;
    protected TextView nomealertaDois;
    protected Switch switchDois;
    protected ImageButton apagarDois;
    ////////

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),MenuInicialActivity.class));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicio_remedios_two);
        Toast toast = Toast.makeText(getApplicationContext(), "Lista de Remédios Atualizada..",Toast.LENGTH_SHORT);
        toast.show();
        novoRemedio=(ImageButton)findViewById(R.id.btnAddRemedio);
        novoRemedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CadastroRemedioAlergicoActivity.class));
            }
        });
        //remedio 2
        remedioDois=findViewById(R.id.nomeRemedioDois);
        nomealertaDois=findViewById(R.id.nomeAlertaDois);
        switchDois=(Switch)findViewById(R.id.switchDois);
        apagarDois=(ImageButton)findViewById(R.id.btnApagarDois);
        apagarDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remedioDois.setVisibility(View.INVISIBLE);
                nomealertaDois.setVisibility(View.INVISIBLE);
                switchDois.setVisibility(View.INVISIBLE);
                apagarDois.setVisibility(View.INVISIBLE);
                Toast toast = Toast.makeText(getApplicationContext(), "Remedio Excluido...",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        ///remedio um
        remedioUm=findViewById(R.id.remedioUm);
        nomealertaUm=findViewById(R.id.nomeAlertaUm);
        switchUm=(Switch)findViewById(R.id.switchUm);
        apagarUm=(ImageButton)findViewById(R.id.btnApagarUm);
        apagarUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remedioUm.setVisibility(View.INVISIBLE);
                nomealertaUm.setVisibility(View.INVISIBLE);
                switchUm.setVisibility(View.INVISIBLE);
                apagarUm.setVisibility(View.INVISIBLE);
                Toast toast = Toast.makeText(getApplicationContext(), "Remedio Excluido.\nLista de vazia..",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        alergico=(ImageButton)findViewById(R.id.btnAlergicos);
        alergico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ListaAlergicosActivity.class));
            }
        });

    }
}
