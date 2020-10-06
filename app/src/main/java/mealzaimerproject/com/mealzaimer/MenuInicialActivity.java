package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.manualMEAlzheimer.ManualActivity;
import mealzaimerproject.com.mealzaimer.anotacoesMEAlzheimer.InicioAnotacoesActivity;
import mealzaimerproject.com.mealzaimer.controleRemedios.MenuInicioRemedios;
import mealzaimerproject.com.mealzaimer.controleTarefas.InicioAtividadesActivity;
import mealzaimerproject.com.mealzaimer.gamesMEAlzheimer.ordemDoze.GamesActivity;
import mealzaimerproject.com.mealzaimer.sobreMimMEAlzheimer.EuActivity;

public class MenuInicialActivity extends AppCompatActivity {
    protected ImageButton botaoJogos;
    protected ImageButton botaoManual;
    protected ImageButton eu;
    protected ImageButton familia;
    protected ImageButton botaoEnderecos;
    protected ImageButton botaoRemedios;
    protected ImageButton botaoTarefas;
    protected ImageButton botaoAnotacoes;
    protected ImageButton botaoDicas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);

        botaoJogos=(ImageButton)findViewById(R.id.btnJogos);
        botaoJogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),GamesActivity.class));

            }
        });
        eu=(ImageButton)findViewById(R.id.btnEu);
        eu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EuActivity.class));

            }
        });
        familia=(ImageButton)findViewById(R.id.btnFamilia);
        familia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FamiliaActivity.class));
            }
        });
        botaoEnderecos=(ImageButton)findViewById(R.id.btnEnderecos);
        botaoEnderecos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EmDesenvolvimentoActivity.class));

            }
        });
        botaoTarefas=(ImageButton)findViewById(R.id.btnTarefas);
        botaoTarefas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),InicioAtividadesActivity.class));
            }
        });
        botaoAnotacoes=(ImageButton)findViewById(R.id.btnAnotacoes);
        botaoAnotacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),InicioAnotacoesActivity.class));
            }
        });
        botaoRemedios=(ImageButton)findViewById(R.id.btnRemedios);
        botaoRemedios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MenuInicioRemedios.class));
            }
        });
        botaoManual=(ImageButton)findViewById(R.id.btnManual);
        botaoManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ManualActivity.class));
            }
        });
        botaoDicas=(ImageButton)findViewById(R.id.btnSaude);
        botaoDicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),DicaActivity.class));
            }
        });


    }
}
